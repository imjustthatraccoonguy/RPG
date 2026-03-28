import java.util.*;

public class Game{
    Room dungeonRoom;
    Scanner scanner;
    public static void main(String[] args){
        Game game = new Game();
    }
    public Game(){
        dungeonRoom = new Room();

        scanner = new Scanner(System.in);
        System.out.print("Enter command:");
        String command = scanner.nextLine();

        Parser parser = new Parser();
        parser.parseInput(command);
    }
}