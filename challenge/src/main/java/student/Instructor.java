package student;

public class Instructor extends Person{
    private String employeeNumber;

    public Instructor(String firstName, String secondName, String telephone, String email, String employee_number) {
        super(firstName, secondName, telephone, email);
        this.employeeNumber = employee_number;
        cleanEmployeeNumber();
    }

    public String getEmployeeNumber() { return employeeNumber; }
    public void setEmployeeNumber(String employeeNumber) { this.employeeNumber = employeeNumber; }

    // Method to clean employeeNumber from spaces
    public String cleanEmployeeNumber() {
        if (employeeNumber == null) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < employeeNumber.length(); i++) {
            char c = employeeNumber.charAt(i);
            if (c != ' ') { // skip spaces
                sb.append(c);
            }
        }
        employeeNumber = sb.toString();
        return employeeNumber;
    }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                this.employeeNumber, this.secondName, this.firstName);
    }

}
