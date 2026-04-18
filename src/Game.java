import java.util.*;

public class Game{
    Room bedroom, hallway;
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
        currentRoom = bedroom;

        bedroom.addExit("west", hallway);

        hallway.addExit("east", bedroom);

        bedroom.printRoom();

        scanner = new Scanner(System.in);
        Parser parser = new Parser();

        while(true){
            System.out.print("Enter command:");

            currentRoom = currentRoom.getExit(scanner.nextLine());
            currentRoom.printRoom();
            //String command = scanner.nextLine();
            //parser.parseInput(command);
        }
    }
}