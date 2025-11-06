<p align="center">
  <img src="app/src/main/res/drawable/ic_ledgerly.png" alt="Ledgerly Logo" width="300">

  <h1 align="center">Ledgerly</h1>
  <p align="center">Know your money.</p>

</p>

Ledgerly is a small personal-finance Android app (a school project) built with Kotlin and modern Android libraries. It helps users track expenses, income, budgets and goals.

This repository contains the Android app source for the SCO 306 — Project 2 assignment. See the original assignment here: [📄 SCO 306 - Project 2 (PDF)](./SCO%20306%20-project%202.pdf).

## Features

- Add and categorize transactions (income and expense)
- Track budgets and financial goals
- Local persistence using Room
- Firebase integration placeholders / sync (requires configuration)
- Basic analytics and simple reports


## Tech stack

- Kotlin
- Jetpack Compose (UI)
- AndroidX libraries
- Room (local database)
- Firebase (optional — for cloud sync/auth; not bundled)
- Gradle


## Quick setup

Prerequisites:
- Android Studio (Electric Eel / Flamingo / later recommended) or a compatible IDE
- JDK 17+

Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/Olooce/Ledgerly.git
   cd Ledgerly
   
2. (Optional) Firebase:
   - Firebase features (analytics, auth, firestore), create a Firebase project for development and download `google-services.json`.


