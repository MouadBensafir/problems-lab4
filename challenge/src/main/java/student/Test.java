package student;

public class Test {
    public static void main(String[] args) {
        Major fms = new Major("18", "Médecine");
        Major archi = new Major("19", "Architecture");

        // Students using default (Computer Science)
        Student s1 = new Student("SAFI", "Amal", "+212612345678", "amal.safi@um6p.ma", "JB4526");
        Student s2 = new Student("ALAMI", "Samir", "+212698765432", "samir.alami@um6p.ma", "BF8764");
        Student s3 = new Student("QADIRI", "Sara", "+212634567890", "sara.qadiri@um6p.ma", "CK1234", fms);
        Student s4 = new Student("BENSAID", "Omar", "+212645987321", "omar.bensaid@um6p.ma", "DD8765", archi);
        Student s5 = new Student("HASSANI", "Aya", "+212677654321", "aya.hassani@um6p.ma", "EE9087", archi);

        // Display computer science students
        Major.displayCsStudents();

        // Testing some methods
        System.out.println("\nFormatted Name: " + s1.getFullNameFormatted());
        Student foundStudent = archi.findStudentByCNE("DD8765");
        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent.getFullNameFormatted());
        } else {
            System.out.println("No student found with CNE DD8765.");
        }
        System.out.println("\nArchitecture capacity: " + Major.getMaxCapacity());
        archi.getStudentCount();
        archi.getOccupancyRate();
    }
}
