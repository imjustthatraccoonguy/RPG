import java.util.*;

public class Room{
    private String name;
    private String roomDescription;
    //exits hashmap


    public ArrayList<Item> inventory;

    public Room(){
        inventory = new ArrayList<>();
    }
    public void printRoom(){
        System.out.println(name.toUpperCase());
        System.out.println(roomDescription);
        System.out.println(printItems());
        //print exits here
    }
    public String printItems(){
        String returnString = "Items in room: ";

        for(Item item : inventory){
            returnString += item.getName() + ", ";
        }
        returnString = returnString.substring(0, returnString.length() - 2);

        return returnString;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return roomDescription;
    }
}