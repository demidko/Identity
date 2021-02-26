repositories {
  mavenCentral()
  maven("https://jitpack.io")
}

plugins {
  kotlin("jvm") version "1.4.30"
  id("org.beryx.runtime") version "1.12.1"
}

dependencies {
  implementation("com.github.ajalt.clikt:clikt:3.1.0")
  testImplementation("org.testng:testng:7.3.0")
  testImplementation("com.natpryce:hamkrest:1.8.0.1")
  testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
}

application {
  mainClass.set("AppKt")
  applicationName = "idt"
}

tasks {
  test {
    useTestNG()
  }
  compileKotlin {
    kotlinOptions {
      jvmTarget = "15"
    }
  }
}


