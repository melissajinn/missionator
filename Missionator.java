import java.util.*;

public class Missionator {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        boolean again = true;
        while(again){
            Teacher[] teachers = defineTeacherBank();

            System.out.println("Welcome to Missionator! Please think of a teacher from this bank of teachers, and we will ask you yes or no questions. Please answer with 'Y' or 'N'.");
            System.out.println("Teacher Bank: ");

            for(Teacher t : teachers) System.out.println(t.getName());

            // Ask about gender first
            System.out.println("Is this teacher female?");
            boolean isFemale = scan.nextLine().equalsIgnoreCase("Y");

            // Filter teachers by gender
            teachers = filterByGender(teachers, isFemale);

            // Loop through subjects
            for (String subject : getUniqueSubjects(teachers)) {
                System.out.println("Is this teacher a " + subject + " teacher?");
                boolean response = scan.nextLine().equalsIgnoreCase("Y");

                if (response) {
                    // Filter teachers by subject
                    teachers = filterBySubject(teachers, subject);
                    break;
                }
            }

            // Loop through wings
            for (String wing : getUniqueWings(teachers)) {
                System.out.println("Is this teacher located in the " + wing + "?");
                boolean response = scan.nextLine().equalsIgnoreCase("Y");

                if (response) {
                    // Filter teachers by wing
                    teachers = filterByWing(teachers, wing);
                    break;
                }
            }

            // Loop through remaining teachers
            for (Teacher teacher : teachers) {
                System.out.println(teacher.getSpecial());
                boolean response = scan.nextLine().equalsIgnoreCase("Y");

                if (response) {
                    System.out.println("The teacher you were thinking of is: " + teacher.getName());
                    System.out.println("Would you like to play again?");
                    again = scan.nextLine().equals("Y");
                }
            }
        }
        }

    public static Teacher[] filterByGender(Teacher[] teachers, boolean isFemale) {
        List<Teacher> filteredList = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getGender().equalsIgnoreCase("female") == isFemale) {
                filteredList.add(teacher);
            }
        }
        return filteredList.toArray(new Teacher[0]);
    }
    public static Teacher[] filterBySubject(Teacher[] teachers, String subject) {
        List<Teacher> filteredList = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getSubject().equalsIgnoreCase(subject)) {
                filteredList.add(teacher);
            }
        }
        return filteredList.toArray(new Teacher[0]);
    }

    public static Teacher[] filterByWing(Teacher[] teachers, String wing) {
        List<Teacher> filteredList = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getWing().equalsIgnoreCase(wing)) {
                filteredList.add(teacher);
            }
        }
        return filteredList.toArray(new Teacher[0]);
    }

    public static Set<String> getUniqueSubjects(Teacher[] teachers) {
        Set<String> subjects = new HashSet<>();
        for (Teacher teacher : teachers) {
            subjects.add(teacher.getSubject());
        }
        return subjects;
    }

    public static Set<String> getUniqueWings(Teacher[] teachers) {
        Set<String> wings = new HashSet<>();
        for (Teacher teacher : teachers) {
            wings.add(teacher.getWing());
        }
        return wings;
    }
    public static Teacher[] defineTeacherBank(){
        Teacher AmyPerez = new Teacher(true, "Amy Perez","female","administration","office","Does the teacher walk around with a megaphone?");
        Teacher BethBonomo = new Teacher(true, "Beth Bonomo","female","administration","office","Does the teacher give stickers to everyone?");
        Teacher NathanielBates = new Teacher(true, "Nathaniel Bates","male","math","B wing","Does the teacher act like a hallway monitor?");
        Teacher AnthonyBelloti = new Teacher(true, "Anthony Belloti","male","history","B wing","Does the teacher practically have a subject named after him?");
        Teacher JohnBoegman = new Teacher(true, "John Boegman","male","english","E wing","Is the teacher one of the tallest teacher at school?");
        Teacher BennyBreazeale = new Teacher(true, "Benny Breazeale","male","PE","N wing","Do you go to this teacher for service forms?");
        Teacher SandraCohen = new Teacher(true, "Sandra Cohen","female","english","M wing","Is the teacher the head of the Smoke Signal?");
        Teacher ChelbertDai = new Teacher(true, "Chelbert Dai","male","english","P wing","Does the teacher wear flip flops to school?");
        Teacher LoisDotson = new Teacher(true, "Lois Dotson","female","english","E wing","Is the teacher a sweet old lady?");
        Teacher KarlHui = new Teacher(true, "Karl Hui","male","science","C wing","Does the teacher do martial arts at assemblies?");
        Teacher MichaelJan = new Teacher(true, "Michael Jan","male","CS","B wing","Is the teacher the best teacher at mission?");
        Teacher FloraKang = new Teacher(true, "Flora Kang","female","english","P wing","Does the teacher blend in with students?");
        Teacher LingRuKuei = new Teacher(true, "Ling Ru Kuei","female","science","C wing","Is the teacher a classic Asian tiger mom?");
        Teacher SailakshmiKumar = new Teacher(true, "Sailakshmi Kumar","female","science","C wing","Is the teacher the physics head at mission?");
        Teacher DavidLau = new Teacher(true, "David Lau","male","math","C wing","Does the teacher have a heavy accent?");
        Teacher BellamyLiu = new Teacher(true, "Bellamy Liu","male","math","A wing","Is the teacher Jan's best friend?");
        Teacher KimMathis = new Teacher(true, "Kim Mathis","female","history","B wing","Is the teacher 4 feet tall and scary?");
        Teacher LaneMelcic = new Teacher(true, "Lane Melcic","male","science","P wing","Is the teacher a plane nerd?");
        Teacher SarahMueller = new Teacher(true, "Sarah Mueller","female","science","C wing","Was the teacher in a cast for most of the year last year?");
        Teacher MughdaPatil = new Teacher(true, "Mugdha Patil","female","CS","C wing","Is the teacher the other CS teacher?");
        Teacher StephanieRandazzo = new Teacher(true, "Stephanie Randazzo","female","PE","gym","Is the teacher the athletic director?");
        Teacher IuliaRusu = new Teacher(true, "Iulia Rusu","female","math","B wing","Is the teacher Romanian married to an Indian guy?");
        Teacher UmitSahin = new Teacher(true, "Umit Sahin","male","math","B wing","Did we do a project based off of his name?");
        Teacher FreddySaldana = new Teacher(true, "Freddy Saldana","male","math","B wing","Does the teacher have many mood swings?");
        Teacher MelissaSaldivar = new Teacher(true, "Melissa Saldivar","female","math","B wing","Is the teacher all over the place?");
        Teacher DorotaSawicka = new Teacher(true, "Dorota Sawicka","female","science","C wing","Does the teacher have a reputation for not being a great teacher?");
        Teacher EricStampfli = new Teacher(true, "Eric Stampfli","male","art","E wing","Is the teacher in a wheelchair?");
        Teacher PeterVaz = new Teacher(true, "Peter Vaz","male","PE","gym","Is the teacher the AP coordinator?");
        Teacher MatthewVierk = new Teacher(true, "Matthew Vierk","male","civics","P wing","Is the teacher very conservative?");
        Teacher LaurenWareHartbeck = new Teacher(true, "Lauren Ware Hartbeck","female","science","C wing","Is the teacher always absent from school because she had a baby?");

        return new Teacher[]{AmyPerez, BethBonomo, NathanielBates, AnthonyBelloti, JohnBoegman, BennyBreazeale,
                SandraCohen, ChelbertDai, LoisDotson, KarlHui, MichaelJan, FloraKang, LingRuKuei, SailakshmiKumar,
                DavidLau, BellamyLiu, KimMathis, LaneMelcic, SarahMueller, MughdaPatil, StephanieRandazzo, IuliaRusu,
                UmitSahin, FreddySaldana, MelissaSaldivar, DorotaSawicka, EricStampfli, PeterVaz, MatthewVierk, LaurenWareHartbeck};
    }
}
