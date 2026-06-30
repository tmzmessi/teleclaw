# ProGuard rules for TeleClaw

# Keep application class
-keep class com.teleclaw.App { *; }

# Keep main activity
-keep class com.teleclaw.MainActivity { *; }

# Proprietary modules are obfuscated in the release build
# and are not included in this source repository.