# Features

## 🧠 AI Agent
- Multi-turn conversation with context awareness
- Function calling (tool use) support
- Streaming response with real-time display
- Automatic session compaction for long conversations

## 📱 Phone Control
- Automated tap, swipe, and input with built-in permission system
- App launch, stop, uninstall, clear data
- Permission grant/revoke management
- System settings control

## 🖥️ Virtual Display
- Create virtual screens for background automation
- Launch and operate apps on virtual display
- Screenshot capture from virtual display
- Agent loop: screenshot → analyze → act → repeat

## 🛠️ Tool System
| Tool | What it does |
|------|-------------|
| 📖 read | Read file contents |
| ✍️ write | Create or overwrite files |
| 🛠️ shell | Execute shell commands |
| 🖼️ image | Analyze images with VLM |
| 🔎 search | Search memory with BM25 |
| 🌐 web_fetch | Fetch web page content |

## 💾 Memory System
- **MEMORY.md** — Long-term curated memory
- **Daily notes** — Automatic activity logging
- **BM25 search** — Semantic retrieval across all memory files
- **Session startup** — Auto-loads relevant context
- **Compaction** — Smart summarization when history grows

## ⏰ Scheduled Tasks
- Cron-like scheduling (one-shot and recurring)
- Natural language time expressions
- Automatic execution and notification

## 🔒 Privacy
- All data stays on your device
- No telemetry or tracking
- API keys encrypted locally