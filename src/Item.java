import java.util.*;

public class Item{
    private String name;
    private Boolean canPickUp;
    private String examineText;
    HashMap<String, String> verbs = new HashMap<>();

    public Item(String name, Boolean canPickUp, String examineText){
        this.name = name;
        this.canPickUp = canPickUp;
        this.examineText = examineText;
    }
    public String getName(){
        return name;
    }

   public String getExamineText(){
       return examineText;
   }

   public boolean hasAction(String verb) {
        return verbs.containsKey(verb);
   }

   public String actionString(String verb) {
        return verbs.get(verb);
    }

    public void addVerb(String verb, String text){
        verbs.put(verb, text);
    }
}