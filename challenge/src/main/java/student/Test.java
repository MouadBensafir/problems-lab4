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

        // Displaying majors with their students
        System.out.println("\n=== Summary of majors ===");
        System.out.println("Computer Science : " + Student.getDefaultMajor().getStudentListAsString());
        System.out.println("Médecine : " + fms.getStudentListAsString());
        System.out.println("Architecture : " + archi.getStudentListAsString());

        // Problem 5
        Instructor i1 = new Instructor("Mouad", "Bensafir", "+212612345678", "mouad@um6p.ma", " EMP 12 3 ");
        Instructor i2 = new Instructor("Zayd", "Kassimi", "+212634567890", "sara@um6p.ma", "EMP 4 5 6");
        Instructor i3 = new Instructor("Yassine", "Talea", "+212698765432", "amal@um6p.ma", " EMP 78 9 ");

        // Some subjects
        Subject sub1 = new Subject(" m112  ", "computation theory", i1);
        Subject sub2 = new Subject( " m113   ", "inTRoDuctION to java", i2);

        // Testing methods by order
        System.out.println("- Clean Employee Number : " + i1.cleanEmployeeNumber());
        System.out.println("- Normalized code       : " + sub2.normalizedCode());
        System.out.println("- Proper Title          : " + sub2.properTitle());
        System.out.println("- Summary Line          : " + i1.summaryLine());
        System.out.println("- Is it an intro course ? " + sub2.isIntroCourse());
        System.out.println("\n" + i1.toCard());
        System.out.println(sub2.syllabusLine());
        System.out.println("- Instructor 3's name : " + i3.displayName());
    }
}
