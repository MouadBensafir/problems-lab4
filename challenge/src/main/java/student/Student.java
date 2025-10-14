package student;

import java.util.Locale;

public class Student extends Person {
    private String cne;
    private Major major;
    private static final Major default_major = new Major("23", "Computer Science");

    // Default constructor
    public Student() {}

    // Constructor for students with specified major
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = major;
        major.addStudent(this);
    }

    // Constructor for default major (aka Computer Science)
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = default_major;
        default_major.addStudent(this);
    }

    // Getters
    public String getCne() { return this.cne; }
    public Major getMajor() { return this.major; }
    public static Major getDefaultMajor() { return default_major; }

    // Setters
    public void setCne(String cne) { this.cne = cne; }
    public void setMajor(Major major) { this.major = major; }
    public static Major setDefaultMajor() { return default_major; }

    // Method to get a formatted name
    public String getFullNameFormatted() {
        return String.format("%s, %s", getSecondName().toUpperCase(), getFirstName().toLowerCase());
    }
}
