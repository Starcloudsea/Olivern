pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/") {
            isAllowInsecureProtocol = true
            name = "Fabric"
        }
        gradlePluginPortal()
    }
}
