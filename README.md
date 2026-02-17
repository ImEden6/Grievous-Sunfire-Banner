# Grievous Sunfire Addon

An addon for [Simply Swords](https://modrinth.com/mod/simply-swords) that enhances the Sunfire Standard weapon by applying **Grievous Wounds** to targets. This effect reduces the healing effectiveness of enemies, adding a tactical advantage in combat.

Designed for Minecraft 1.20.1 using the Fabric Mod Loader.

## Features

- **Grievous Sunfire Effect**: Attacks with the Sunfire Standard now inflict the Grievous Wounds status effect.
- **Strategic Combat**: Counter regeneration and healing abilities effectively.
- **Seamless Integration**: Works directly with Simply Swords and Zenith Attributes mechanics.

## Requirements

This mod requires the following dependencies:

- **Minecraft**: 1.20.1
- **Fabric Loader**: >= 0.15.11
- **Fabric API**: Latest version for 1.20.1
- **[Simply Swords](https://modrinth.com/mod/simply-swords)**: >= 1.55.0
- **[Zenith Attributes](https://modrinth.com/mod/zenith-attributes)**: >= 0.2.7
- **[Architectury API](https://modrinth.com/mod/architectury-api)** (Required by Simply Swords)
- **[Cloth Config API](https://modrinth.com/mod/cloth-config)** (Required by Zenith Attributes)

## Installation

1. Download the latest release `.jar` file.
2. Install [Fabric Loader](https://fabricmc.net/use/installer/) for Minecraft 1.20.1.
3. Place the downloaded mod `.jar` file into your Minecraft `mods` folder.
4. Ensure all required dependencies listed above are also in the `mods` folder.
5. Launch the game!

## Building from Source

To build this project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/grievous-sunfire-addon.git
   cd grievous-sunfire-addon
   ```

2. Build with Gradle:
   - **Windows**:
     ```powershell
     .\gradlew.bat build
     ```
   - **Linux / macOS**:
     ```bash
     ./gradlew build
     ```

3. The compiled `.jar` file will be located in the `build/libs/` directory.

## License

This project is licensed under the **MIT License**. See the `LICENSE` file for details.

## Credits

- **Author**: Mervyn
- **Simply Swords**: Created by the Simply Swords team.
- **Zenith Attributes**: Created by the Zenith Attributes team.
