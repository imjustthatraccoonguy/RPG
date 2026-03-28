import java.util.*;

public class Parser{
    public static String inputVerb;
    public static String inputNoun;

    public ArrayList<String> verbs = new ArrayList<>();

    public Parser(){
        verbs.add("go");
        verbs.add("take");
        verbs.add("look around");
        verbs.add("examine");
        verbs.add("inventory");
    }

    public void parseInput(String input){
        input = input.toLowerCase().trim();
        for(String checkVerb : verbs){
            if(input.contains(checkVerb)){
                inputVerb = checkVerb;
                inputNoun = input.replaceAll(checkVerb, "").trim();
            }
        }
        System.out.println(inputVerb);
        System.out.println(inputNoun);
    }
}
