public class Teacher {
    private String gender;
    private String subject;
    private String wing;
    private String special;

    public Teacher(String gender, String subject, String wing, String special){
        this.gender = gender;
        this.subject = subject;
        this.wing = wing;
        this.special = special;
    }

    public String getGender() {
        return gender;
    }
    public String getSubject(){
        return subject;
    }
    public String getWing(){
        return wing;
    }
    public String getSpecial(){
        return special;
    }
}
