import java.util.*;

public class Game{
    Room dungeonRoom;
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

        dungeonRoom = new Room();

        scanner = new Scanner(System.in);
        System.out.print("Enter command:");
        System.out.println("You took " + Color.red("2") + " damage.");
        String command = scanner.nextLine();

        Parser parser = new Parser();
        parser.parseInput(command);
    }
}