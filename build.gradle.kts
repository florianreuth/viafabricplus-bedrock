import de.florianreuth.baseproject.integration.configureJarInJar
import de.florianreuth.baseproject.integration.includeTransitiveJijDependencies
import de.florianreuth.baseproject.integration.setupFabric
import de.florianreuth.baseproject.setupProject
import de.florianreuth.baseproject.setupViaPublishing

plugins {
    id("net.fabricmc.fabric-loom")
    id("de.florianreuth.baseproject")
}

setupProject()
setupFabric()
setupViaPublishing()

repositories {
    maven("https://repo.viaversion.com")
    maven("https://maven.lenni0451.net/everything")
    maven("https://jitpack.io") {
        content {
            includeGroup("com.github.oryxel1")
        }
    }
}

val shade = configureJarInJar()

dependencies {
    implementation("com.viaversion:viafabricplus:5.0.1")

    shade("net.raphimc:ViaBedrock:0.0.30-20260908.182032-2") {
        exclude(group = "com.mojang", module = "brigadier")
        exclude(group = "at.yawk.lz4", module = "lz4-java")
        exclude(group = "io.netty")
    }
    shade("net.raphimc:MinecraftAuth:5.0.2") {
        exclude(group = "com.google.code.gson", module = "gson")
    }
    shade("dev.kastle.netty:netty-transport-raknet:1.7.0") {
        exclude(group = "io.netty")
    }
    shade("dev.kastle.netty:netty-transport-nethernet:1.7.0") {
        exclude(group = "io.netty")
    }
    arrayOf("windows-x86_64", "windows-aarch64", "linux-x86_64", "linux-aarch64", "macos-aarch64").forEach {
        shade("dev.kastle.webrtc:webrtc-java:1.0.3:$it")
    }
}

includeTransitiveJijDependencies()
