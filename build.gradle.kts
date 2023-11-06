import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.10"
    application
    antlr
}

group = "me.roland"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    antlr("org.antlr:antlr4:4.10.1")
    implementation("org.apache.commons:commons-lang3:3.6")
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.mockito.kotlin:mockito-kotlin:5.1.0")
}

tasks.test {
    useJUnitPlatform()
}

val packageName = "kernel.antlr"
tasks.generateGrammarSource {
    outputDirectory = File("C:\\Users\\Roland\\Documents\\OpenCLPP2\\src\\main\\java\\kernel\\antlr") // TODO
    arguments = listOf(
        "-visitor",
        "-package", packageName,
    )
}

tasks.getByName("compileKotlin").dependsOn("generateGrammarSource")

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

buildscript {
    dependencies {
        classpath("org.antlr:antlr4:4.10.1")
    }
}

application {
    mainClass.set("MainKt")
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "11"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "11"
}