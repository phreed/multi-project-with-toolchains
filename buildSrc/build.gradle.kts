plugins {
    `kotlin-dsl`
}

/**
 * see https://docs.gradle.org/6.8.3/userguide/kotlin_dsl.html#sec:kotlin-dsl_plugin
 */
kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

repositories {
    mavenCentral()
}
