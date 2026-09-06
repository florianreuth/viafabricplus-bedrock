# ViaFabricPlus Bedrock

Addon for [ViaFabricPlus](https://github.com/ViaVersion/ViaFabricPlus) that adds Minecraft: Bedrock Edition support back
to the mod.

## Usage

1. Install [ViaFabricPlus](https://modrinth.com/mod/viafabricplus) 5.0.1 or newer and this addon.
2. Open the ViaFabricPlus screen and select the Bedrock version.
3. For online mode servers and Realms, open the settings, switch to the `Bedrock` tab and click
   `Account for Bedrock Edition`. Your browser opens for the Microsoft login, and the entry then shows the name of the
   account that is signed in.

Logging in is only needed once and is independent of Realms — the same account is used for every online mode Bedrock
server. `Bedrock Realms` in the ViaFabricPlus screen stays disabled until an account is set.

The remaining `Bedrock` settings control whether the default Bedrock port is filled in automatically and whether
ViaBedrock's experimental features are enabled.

## Gradle

The mod is published to the ViaVersion repository as `com.viaversion:viafabricplus-bedrock`.

```kotlin
repositories {
    maven("https://repo.viaversion.com")
}

dependencies {
    // Replace it with latest release
    runtimeOnly("com.viaversion:viafabricplus-bedrock:x.x.x")
}
```

## Links

- ViaFabricPlus: https://github.com/ViaVersion/ViaFabricPlus
- ViaBedrock: https://github.com/RaphiMC/ViaBedrock

## Contact

- Issues: https://github.com/florianreuth/viafabricplus-bedrock/issues
- Discord: https://florianreuth.de/discord
