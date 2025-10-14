package student;


public class Subject {
    private static int NextId = 1;
    private int id;
    private String code;
    private String title;

    public Subject(String code, String title) {
        this.id = NextId++;
        this.code = code;
        this.title = title;
    }

    public int getId() { return this.id; }
    public String getCode() { return this.code; }
    public String getTitle() { return this.title; }

    public void setCode(String code) { this.code = code; }
    public void setTitle(String title) { this.title = title; }

    public String normalizedCode() {
        return code.toUpperCase().trim();
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
        return sb.toString();
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


}
