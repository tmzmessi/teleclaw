# FAQ

## General

### What is TeleClaw?
TeleClaw is an AI agent app for Android. It can hold conversations, control your phone, run automated tasks, and remember context across sessions.

### Does it require root?
No. TeleClaw uses Shizuku for system-level operations, which works without root on Android 8.0+.

### Is my data sent to the cloud?
Conversation messages are sent to the AI model provider you configure (e.g., OpenAI-compatible APIs). All other data (memory, sessions, files) stays on your device.

## Setup

### How do I configure the AI model?
Go to Settings → AI Provider and enter your API endpoint and key. TeleClaw supports any OpenAI-compatible API.

### How do I enable Shizuku?
TeleClaw has Shizuku built in. Follow the in-app setup guide to activate it via wireless debugging.

### How do I use Virtual Display?
Go to Tools → Virtual Display. You can create a virtual screen, launch apps on it, and let the agent operate them automatically.

## Troubleshooting

### The app crashes on startup
Make sure you're running Android 8.0 or later. Try clearing app data and restarting.

### Shizuku connection is unstable
Ensure wireless debugging is enabled in Developer Options. Restart the Shizuku service from within TeleClaw.

### The agent doesn't call tools
Check that your API provider supports function calling. Not all models support this feature.

## Development

### Can I build from source?
This repository contains the open framework. Some proprietary modules are not included. For the full experience, use the pre-built APK from [Releases](../../releases).

### Can I contribute code?
At this time, we are not accepting code contributions for core modules. Bug reports and feature requests are welcome.
