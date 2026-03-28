public class Item{
    String name;
    Boolean canPickUp;
    String examineText;

    //Adding these variables won't do anything yet because you don't have any commands
    //to pick up or examine the items. You need something called an enum to define what
    //commands you want to be able to use, and then methods to define what the commands do.
    //You can try to figure that out yourself, but I can also show you next week.


    public Item(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //For now you can add methods like getExamineText() and stuff
}