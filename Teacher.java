public class Teacher {
    private boolean available;
    private String name;
    private String gender;
    private String subject;
    private String wing;
    private String special;

    public Teacher(boolean available, String name, String gender, String subject, String wing, String special){
        this.available = available;
        this.name = name;
        this.gender = gender;
        this.subject = subject;
        this.wing = wing;
        this.special = special;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }
    public boolean getAvailable(){
        return available;
    }
    public String getName(){
        return name;
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
