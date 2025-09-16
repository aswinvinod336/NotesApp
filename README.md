# NotesApp

A Java console-based Notes App with CRUD operations, sorting, filtering, and MySQL persistence.  
This project helps you manage personal notes efficiently through a simple, menu-driven console interface.

---

## Features

- Add, view, edit, and delete notes
- Sort notes by title or date
- Filter notes by keyword in title or content
- Persist notes using a MySQL database
- Modular structure for easy maintenance and scalability

---

## Tech Stack

- **Java** – OOP concepts, Collections, Streams
- **MySQL** – JDBC for database operations
- **Git** – Version control
- **IntelliJ IDEA** – Development environment

---

## Project Structure

src/
├── model/ → Note.java
├── service/ → NoteService.java
├── dao/ → NoteDAO.java (database operations)
└── ui/ → NotesApp.java (console interaction)