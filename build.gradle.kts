plugins {
    id("org.graalvm.buildtools.native") version "0.10.1" apply false
}

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}
