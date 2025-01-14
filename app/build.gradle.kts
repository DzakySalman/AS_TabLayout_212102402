plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.dzakysalman.tablayout"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.dzakysalman.tablayout"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
//    implementation fileTree(dir: "libs", include: ["*.jar"])
//    implementation 'androidx.appcompat:appcompat:1.4.0'
//    implementation 'com google.android.material:material:1.6.0-alpha01'
//    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
//    testImplementation'junir:junit:4.12'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}