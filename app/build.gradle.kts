plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.example.moodtracker"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.moodtracker"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures { compose = true }

    // Avec Kotlin 2.x + plugin compose, pas besoin de composeOptions ici
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    // Compose BOM -> gère les versions internes
    implementation(platform(libs.androidx.compose.bom))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.compose)

    // Compose UI + Material 3
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.material3)

    // Outils d’aperçu (dev)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.navigation.runtime.ktx)
    debugImplementation(libs.androidx.compose.ui.tooling)

    // NEW: Material icons étendus (CalendarMonth, BarChart, etc.)
    implementation("androidx.compose.material:material-icons-extended")


    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("com.jakewharton.threetenabp:threetenabp:1.4.6")

    implementation(libs.androidx.lifecycle.runtime.ktx)

    implementation("androidx.room:room-runtime:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")

    implementation("com.github.tehras:charts:0.2.4-alpha")


    implementation("androidx.core:core-splashscreen:1.0.1")

    implementation("androidx.compose.material3:material3:1.3.0")
    implementation("com.google.android.material:material:1.12.0")
}
