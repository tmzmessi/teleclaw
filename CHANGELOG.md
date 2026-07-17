# Changelog

All notable changes to TeleClaw will be documented in this file.

## [1.8.1] - 2026-07-17

### Changed
- APK size reduced from ~40 MB to **26.5 MB** via R8 optimization and native library consolidation
- Release signing switched to production keystore (Apache 2.0 distribution ready)

### Security
- Push notification API endpoints obfuscated via native C++ layer (no plaintext URLs in APK)

## [1.4.2] - 2026-06

### Added
- Tool call bubble UI with expandable details
- Smart tool display resolver for concise summaries
- BM25-based active memory search
- Session compaction with quality guard
- Heartbeat system for periodic checks
- Virtual display background automation
- Shizuku embedded service (invisible to other apps)
- Scheduled tasks (cron-like automation)

### Changed
- Improved conversation context management
- Optimized token usage tracking

## [1.3.0] - 2026-05

### Added
- Skills intent recognition system
- Workspace management with auto-initialization
- Bootstrap activation flow
- Daily and idle session reset

## [1.2.0] - 2026-04

### Added
- VLM client with OpenAI-compatible API
- Function calling support
- Image recognition capability
- Streaming response support

## [1.1.0] - 2026-03

### Added
- Basic tool system (read, write, shell, search)
- Session persistence (JSONL format)
- Memory manager with daily notes

## [1.0.0] - 2026-02

### Added
- Initial release
- Core agent architecture
- Basic conversation interface
