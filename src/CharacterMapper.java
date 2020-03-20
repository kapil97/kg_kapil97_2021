import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharacterMapper {
    String subject,observer;
    Map<Character,Character> charMap= new HashMap<>();

    public void setStrings(String subjectIn, String observerIn){
        subject=subjectIn;
        observer=observerIn;
    }

    boolean buildMap(){
        int flag=0;
        char[] subArray = subject.toCharArray();
        char[] obsArray=observer.toCharArray();
        charMap.put(subArray[0],obsArray[0]);

        for(int k=1;k<subArray.length;k++){
            if(charMap.get(subArray[k])!=null){
                flag=1;
            }
            else
                charMap.put(subArray[k],obsArray[k]);
        }
        return 1 != flag;
    }

}
