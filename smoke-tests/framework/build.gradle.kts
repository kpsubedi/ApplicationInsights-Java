plugins {
  id("ai.java-conventions")
}

tasks {
  named("spotbugsMain") {
    enabled = false
  }
}

dependencies {
  implementation("com.google.guava:guava")
  implementation("org.junit.jupiter:junit-jupiter")
  implementation("org.apache.commons:commons-lang3:3.13.0")

  implementation("com.google.code.gson:gson")
  implementation("org.apache.httpcomponents:httpclient:4.5.14")

  implementation("org.eclipse.jetty:jetty-servlet:10.0.16")

  // this is exposed in SmokeTestExtension API
  api("org.testcontainers:testcontainers:1.19.0")

  implementation("org.awaitility:awaitility:4.2.0")

  implementation("ch.qos.logback:logback-classic")

  implementation("org.assertj:assertj-core")
}
