import java.util.Random;


public class Generate_Subject{
     public static String generateSubjects(String[] subjects){
            Random subs = new Random();
            
            int randomSubjects = subs.nextInt(subjects.length);
            return subjects[randomSubjects];
        }
}


