import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    private final String FILE_NAME = "students.txt";

    public StudentManager() {
        loadFromFile();
    }

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
        saveToFile();
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public void updateStudent(int rollNo, String newName, double newMarks) {
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                s.name = newName;
                s.marks = newMarks;
                System.out.println("Student updated successfully!");
                saveToFile();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void deleteStudent(int rollNo) {
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                saveToFile();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Save students to file
    private void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                bw.write(s.rollNo + "," + s.name + "," + s.marks);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Load students from file
    private void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int rollNo = Integer.parseInt(parts[0]);
                String name = parts[1];
                double marks = Double.parseDouble(parts[2]);
                students.add(new Student(rollNo, name, marks));
            }
        } catch (FileNotFoundException e) {
            // Ignore if file doesn’t exist yet
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}
