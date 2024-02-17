buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.1")
    }
}
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.20" apply false
    id("androidx.navigation.safeargs.kotlin") version "2.7.6" apply false
    id("com.google.gms.google-services") version "4.4.1" apply false

    id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false


    id ("com.google.dagger.hilt.android") version "2.49" apply false




}



