package student;

public class Person {
    private static int nextId = 22875;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person() {
        this.id = nextId++;
    }

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
    }

    // Getters
    public int getId() { return this.id; }
    public String getFirstName() { return this.firstName; }
    public String getSecondName() { return this.secondName; }
    public String getPhone() { return this.phone; }
    public String getEmail() { return this.email; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setSecondName(String secondName) { this.secondName = secondName; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }

    // Method to convert the information into a string
    @Override
    public String toString() {
        return String.format("Student{id=%d, firstName='%s', secondName='%s', phone='%s', email='%s'}",
                this.id, this.firstName, this.secondName, this.phone, this.email);
    }
}

