import java.util.*;

public class Game{
    Room bedroom, hallway, staircase, kitchen;
    Item lamp, knife, bread, pitcher;
    Room currentRoom;
    Scanner scanner;
    public static void main(String[] args){
        Game game = new Game();
    }
    public Game(){
        System.out.println(Color.green("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮"));
        System.out.println(Color.green("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮"));
        System.out.println(Color.green("▮▮                                  ▮▮"));
        System.out.println(Color.green("▮▮       WELCOME TO THE DUNGEON     ▮▮"));
        System.out.println(Color.green("▮▮                                  ▮▮"));
        System.out.println(Color.green("▮▮                                  ▮▮"));
        System.out.println(Color.green("▮▮              BEYOND              ▮▮"));
        System.out.println(Color.green("▮▮               RPG                ▮▮"));
        System.out.println(Color.green("▮▮                                  ▮▮"));
        System.out.println(Color.green("▮▮                                  ▮▮"));
        System.out.println(Color.green("▮▮      By:Me and The other dude    ▮▮"));
        System.out.println(Color.green("▮▮                                  ▮▮"));
        System.out.println(Color.green("▮▮                                  ▮▮"));
        System.out.println(Color.green("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮"));
        System.out.println(Color.green("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮"));

        lamp = new Item("lamp", false, "Wow it's a lamp, no suprise there.");
        knife = new Item("knife", true, "A dull kitchen knife.");
        bread = new Item("bread", true, "A stale loaf of bread.");
        pitcher = new Item("pitcher", true, "A small glass pitcher.");

        bedroom = new Room("Bedroom", "You are in the bedroom of your house.");
        hallway = new Room("Hallway", "You are in the hallway of your house");
        staircase = new Room("Staircase", "You stand in front of a staircase leading down to the first floor of your house.");
        kitchen = new Room("Kitchen", "You are in the kitchen of your house");
        currentRoom = bedroom;

        bedroom.addExit("west", hallway);
        bedroom.addItem(lamp);
            lamp.addVerb("examine", "Wow it's a lamp, no suprise there.");

        hallway.addExit("east", bedroom);
        hallway.addExit("west", staircase);

        staircase.addExit("east", hallway);
        staircase.addExit("down", kitchen);

        kitchen.addExit("up", staircase);
        kitchen.addItem(knife);
            knife.addVerb("examine", "A dull kitchen knife.");
            knife.addVerb("eat", "nom nom nom.. OUCH!");
        kitchen.addItem(bread);
            bread.addVerb("examine", "A stale loaf of bread.");
            bread.addVerb("eat", "nom nom nom");
        kitchen.addItem(pitcher);
            pitcher.addVerb("examine", "A small glass pitcher");
            pitcher.addVerb("break", "It smashes to the ground into over 9000.1 pieces.");

        scanner = new Scanner(System.in);
        Parser parser = new Parser();

        while(true){
            currentRoom.printRoom();

            System.out.print("Enter command:");

//            currentRoom = currentRoom.getExit(scanner.nextLine());

            String command = scanner.nextLine();
            parser.parseInput(command);

            for(Item item : currentRoom.inventory){
                if(item.getName().equals(parser.noun)) {
                    if(item.hasAction(parser.verb)){
                        System.out.println(item.actionString(parser.verb));
                    }
                }
            }
        }
    }
}