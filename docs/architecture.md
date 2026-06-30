# Architecture

## Overview

TeleClaw is a mobile AI agent platform built on a modular architecture. The system is composed of several loosely-coupled layers, each responsible for a specific domain.

## Layer Design

```
┌─────────────────────────────────────────────┐
│                  UI Layer                     │
│         Jetpack Compose + Material 3          │
├─────────────────────────────────────────────┤
│               Agent Core                      │
│    Conversation loop · Orchestration · State  │
├───────────┬──────────┬───────────────────────┤
│   Memory   │  Tools   │     Skills            │
│  BM25 + MD │ Registry │  Intent Recognition   │
├───────────┴──────────┴───────────────────────┤
│           Platform Services                   │
│    Built-in permission system · VirtualDisplay │
├──────────────────────────────────────────────┤
│              VLM Client                       │
│       OpenAI-compatible API interface         │
└──────────────────────────────────────────────┘
```

## Core Modules

### Agent Core
The central orchestration engine that manages the conversation loop, coordinates tool execution, and handles session lifecycle.

### Memory System
- **Long-term memory** — Persistent notes and user preferences (`MEMORY.md`)
- **Daily notes** — Time-stamped activity logs
- **Active memory** — BM25-based semantic search across all memory files
- **Session startup** — Automatic context loading at conversation start

### Tool System
A registry-based tool framework where each tool declares its schema and handler:

| Tool | Description |
|------|-------------|
| `read` | Read file contents |
| `write` | Write or create files |
| `shell` | Execute shell commands |
| `image` | Image recognition via VLM |
| `search` | Search memory using BM25 |
| `web_fetch` | Fetch and extract web content |

### Skills Engine
Intent recognition system that matches user requests to available app capabilities. Supports:
- **Delegation mode** — Direct deep-link launch
- **GUI automation** — Step-by-step screen interaction

### Platform Services
- **Built-in Permission System** — Full control over your device without external dependencies
- **Virtual Display** — Background app operation on a virtual screen

## Session Lifecycle

```
Create Session → Load Context → Run Agent Loop → Compact (if needed) → Save → Reset
```

Sessions persist in JSONL format and support:
- Daily reset (4:00 AM)
- Idle reset (configurable)
- Compaction with quality guard
- Memory flush before compaction

## Data Flow

```
User Input
    ↓
Agent Core (conversation loop)
    ↓
VLM Client (API call)
    ↓
Tool Execution (if needed)
    ↓
Response Rendering
    ↓
Memory Update (if significant)
```

## Security Model

- All processing happens on-device by default
- No external telemetry
- API keys encrypted at rest
- Session data stored in app-private directory