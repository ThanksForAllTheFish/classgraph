import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.4.0"
}

group = "org.t4atf"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.webjars:webjars-locator-core:0.46")
	implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.0")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.0")

	testImplementation("io.kotest:kotest-runner-junit5:4.2.2")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}
