
plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}
 
repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}
 
  dependencies {
    // JUnit
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.2")
 
    // Apache Commons Math
    api("org.apache.commons:commons-math3:3.6.1")
 
    // Guava
    implementation("com.google.guava:guava:33.0.0-jre")
 
    // HikariCP
    implementation("com.zaxxer:HikariCP:7.0.2")
 
    // SQLite
    implementation("org.xerial:sqlite-jdbc:3.53.0.0")
}
// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
 
tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
 
