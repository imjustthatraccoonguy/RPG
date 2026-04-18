import java.util.*;

public class Room{
    private String name;
    private String roomDescription;
    //exits hashmap

    HashMap<String, Room> exits = new HashMap<>();

    public ArrayList<Item> inventory;

    public Room(String name, String roomDescription){
        inventory = new ArrayList<>();
        this.name = name;
        this.roomDescription = roomDescription;
    }

    public void addExit(String key, Room value){
        exits.put(key, value);
    }

    public void printRoom(){
        System.out.println(Color.cyan(name.toUpperCase()));
        System.out.println(roomDescription);
        printItems();
        printExits();
    }
    public void printItems(){
        StringBuilder returnString = new StringBuilder("Items here: ");

        for (Item item : inventory) {
            returnString.append(item.getName()).append(", ");

        }
        if(returnString.length() > 12) returnString.delete(returnString.length()-2,returnString.length());

        System.out.println(returnString.toString());
    }

    public void printExits(){
       StringBuilder returnString = new StringBuilder("Exits: ");

        for (String exit : exits.keySet()){
            returnString.append(exit).append(", ");
        }
        if(returnString.length() > 12) returnString.delete(returnString.length()-2,returnString.length());

       System.out.println(returnString.toString());
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return roomDescription;
    }

    public Room getExit(String direction){
        return exits.get(direction);
    }
}