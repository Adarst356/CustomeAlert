🔔 CustomAlertDialog
A lightweight and animated custom alert dialog library for Android, written in Java. This dialog can be used to show confirmation popups like Add, Update, Delete, or Exit with appropriate icons and smooth animations.

✨ Features
Customizable layout and title

Icons based on action type (Add, Update, Delete, Exit)

Smooth enter animation

Simple usage with just one method call

Written in pure Java (no extra dependencies)


📦 Installation
To use this library in your Android project, follow these steps:

🔧 Step 1: Add JitPack to your root settings.gradle

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}


➕ Step 2: Add the dependency in your build.gradle (app level)

dependencies {
    implementation 'com.github.Adarst356:CustomeAlert:Tag'


    📝 Replace Tag with your actual release tag, e.g. 1.1



    
