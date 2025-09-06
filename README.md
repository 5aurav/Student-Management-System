# Student-Management-System

**Overview**
This is a simple Student Management System written in Java. It allows you to:
+ Add new students.
+ View all student records.
+ Update an existing student’s details.
+ Delete a student record.
+ Store data persistently in a text file (students.txt).

**Project Structure**

<img width="750" height="158" alt="image" src="https://github.com/user-attachments/assets/47d86a5a-bc25-4b7e-aa16-ce2f9e8e6a5f" />

**How It Works**
1. Student.java
+ Represents a student with fields like id, name, and marks/GPA.
+ Provides constructors, getters, setters, and toString() for display.

2. StudentManager.java
+ Handles all core operations:
  + Add Student → Save new student into students.txt.
  + View Students → Display all students in the system.
  + Update Student → Modify name/marks for a given student ID.
  + Delete Student → Remove a student record by ID.
  + Ensures file-based persistence across runs.

2. Main.java
+ Provides a menu-driven console interface.
+ Lets the user select actions (Add, View, Update, Delete, Exit).

4. students.txt
+ Stores student data in this format:\
    id,name,marks\
    1467,Saurav Kumar Yadav,9.84\
    102,Anjali,8.70

**How to Run**
1. Compile the program
  + javac Main.java Student.java StudentManager.java
2. Run the program
  + java Main

**Features**
+ Add new students with ID, Name, Marks/GPA.
+ View all student records in a clean format.
+ Update student details (name/marks).
+ Delete a student by ID.
+ Data persistence using students.txt.
+ Menu-driven console interface.
