package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    private static int max_capacity = 50;

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[max_capacity];
        this.studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount >= max_capacity) { return; }
        students[this.studentCount++] = s;
    }

    // Getters
    public int getId() { return this.id; }
    public String getCode() { return this.code; }
    public String getName() { return this.name; }
    public Student[] getStudents() { return this.students; }
    public static int getMaxCapacity() { return max_capacity; }


    // Setters
    public void setId(int id) { this.id = id; }
    public void setCode(String code) { this.code = code; }
    public void setName(String name) { this.name = name; }

    // Display all students in the major
    public void displayStudents() {
        Student[] cs_students = getStudents();
        for (int i=0; i<this.studentCount; i++) {
            Student s = cs_students[i];
            System.out.println(String.format("- %d. %s %s %s",
                    (i+1), s.getId(), s.getFirstName(), s.getSecondName()));
        }
    }

    // Special method to display Cs students
    public static void displayCsStudents() {
        System.out.println("The list of students in the computer science major is: ");
        Student.getDefaultMajor().displayStudents();
    }

    public Student findStudentByCNE(String cne) {
        for (Student s : students) {
            if (s.getCne().equals(cne)) {
                return s;
            }
        }
        return null;
    }

    public void getStudentCount() {
        System.out.println("Current enrollment: " + studentCount);
    }

    public boolean removeStudentByCNE(String cne) {
        Student std = findStudentByCNE(cne);

        for (int i = 0; i < studentCount; i++) {
            Student s = students[i];
            if (s == std) {
                // Shift every student to the left
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                studentCount--;
                return true;
            }
        }
        return false;
    }

    public double getOccupancyRate() {
        double result = (studentCount / (double) max_capacity) * 100;
        System.out.println("Occupancy rate = " + result + "%");
        return result;
    }

    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < studentCount; i++) {
            sb.append(students[i].getFullNameFormatted());
            if (i < studentCount - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

}
