import java.util.*;

public class Game{
    Room bedroom, hallway, staircase, kitchen;
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

        bedroom = new Room("Bedroom", "You are in the bedroom of your house.");
        hallway = new Room("Hallway", "You are in the hallway of your house");
        staircase = new Room("Staircase", "You stand in front of a staircase leading down to the first floor of your house.");
        kitchen = new Room("Kitchen", "You are in the kitchen of your house");
        currentRoom = bedroom;

        bedroom.addExit("west", hallway);

        hallway.addExit("east", bedroom);
        hallway.addExit("west", staircase);

        staircase.addExit("east", hallway);
        staircase.addExit("down", kitchen);

        kitchen.addExit("up", staircase);


        scanner = new Scanner(System.in);
        Parser parser = new Parser();

        while(true){
            currentRoom.printRoom();

            System.out.print("Enter command:");

            currentRoom = currentRoom.getExit(scanner.nextLine());

            //String command = scanner.nextLine();
            //parser.parseInput(command);
        }
    }
}