import java.util.HashMap;
import java.util.Map;

public class CharacterMapper {
    String subject,observer;
    Map<Character,Character> charMap= new HashMap<>();

    public void setStrings(String subjectIn, String observerIn){
        subject=subjectIn;
        observer=observerIn;
    }

    void buildMap(){
        char[] subArray = subject.toCharArray();
        char[] obsArray=observer.toCharArray();
        System.out.println(subArray.length);
        System.out.println(obsArray.length);

    }

}
