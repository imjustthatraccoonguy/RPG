import java.util.*;

public class Parser{
    public String verb;
    public String noun;

    public ArrayList<String> verbs = new ArrayList<>();

    public Parser(){
        verbs.add("go");
        verbs.add("take");
        verbs.add("look around");
        verbs.add("inventory");
        verbs.add("help");
        verbs.add("eat");
        verbs.add("break");
        verbs.add("examine");
        verbs.add("pickup");
        verbs.add("drop");
        verbs.add("talkto");
    }

    public void parseInput(String input) {
        input = input.toLowerCase().trim();
        for (String checkVerb : verbs) {
            if (input.startsWith(checkVerb)) {
                verb = checkVerb;
                noun = input.replaceAll(checkVerb, "").trim();
            }
        }
        System.out.println(verb);
        System.out.println(noun);
    }
}
