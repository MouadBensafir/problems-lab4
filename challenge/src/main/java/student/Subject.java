package student;


public class Subject {
    private static int NextId = 1;
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    public Subject(String code, String title,  Instructor instructor) {
        this.id = NextId++;
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }

    public int getId() { return this.id; }
    public String getCode() { return this.code; }
    public String getTitle() { return this.title; }
    public Instructor getInstructor() { return this.instructor; }

    public void setCode(String code) { this.code = code; }
    public void setTitle(String title) { this.title = title; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    public String normalizedCode() {
        this.code = code.toUpperCase().trim();
        return this.code;
    }

    public String properTitle() {
        String[] titleArray = title.split(" ");
        if (titleArray.length <= 1) { return this.title;}

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < titleArray.length; i++) {
            String word = titleArray[i];
            if (!word.isEmpty()) {
                sb.append(word.substring(0, 1).toUpperCase());
                if (word.length() > 1) {
                    sb.append(word.substring(1).toLowerCase());
                }
            }

            // Tant qu'on n'a pas fini les mots du titre
            if (i < titleArray.length - 1) {
                sb.append(" ");
            }
        }
        this.title = sb.toString();
        return this.title;
    }

    public boolean isIntroCourse() {
        if (title != null && title.length() >= 5 && title.toLowerCase().startsWith("intro")) {
            return true;
        }
        if (code != null && code.length() >= 6 && code.toUpperCase().startsWith("INTRO-")) {
            return true;
        }
        return false;
    }

    public String syllabusLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(code).append(" - ").append(title)
                .append(" (Instructor: ")
                .append(instructor.getSecondName()).append(" ")
                .append(instructor.getFirstName()).append(")");
        return sb.toString();
    }


}
