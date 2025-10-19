# 🎵 Java Audio Player (Console-Based)

A simple **Java console application** that can **play, pause, stop, and reset** an audio file (`.wav`) using the **Java Sound API** (`javax.sound.sampled`).  
This mini project demonstrates interactive audio control through the command line.

---

## 🧠 Project Overview

This program allows users to control music playback directly from the **console**.  
It loads a `.wav` file from the `src` folder and provides four basic options:

| Command | Description |
|----------|--------------|
| ▶️ **P** | Play / Resume the audio |
| ⏹️ **S** | Stop the audio |
| 🔁 **R** | Reset (restart from beginning) |
| ❌ **Q** | Quit the program |

It uses Java’s `Clip` class to handle playback, and a `Scanner` for user input — creating a simple yet functional command-line music player.

---

## ⚙️ How It Works

1. The program loads the audio file (e.g., `I Love You, Im Sorry.wav`) using a **relative file path** from the `src` directory.  
2. It opens the file as an `AudioInputStream` and assigns it to a `Clip` object (like a mini audio player).  
3. The user can control playback interactively by typing commands into the console.  
4. The `try-with-resources` block automatically closes the scanner and audio resources once the user exits.

---

## 💻 Technologies Used

- **Language:** Java  
- **Libraries:**  
  - `javax.sound.sampled`  
  - `java.io`  
  - `java.util`  
- **Concepts Demonstrated:**  
  - File handling  
  - Exception handling  
  - Audio playback  
  - Console input/output  
  - Resource management (`try-with-resources`)

---



