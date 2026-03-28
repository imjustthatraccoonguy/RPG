public class Color {
    public static final String WHITE = "\u001b[97m";
    public static final String RED = "\u001b[91m";
    public static final String CYAN = "\u001b[96m";
    public static final String GREEN = "\u001b[92m";
    public static final String YELLOW = "\u001b[93m";
    public static final String RESET = "\u001b[0m";

    public static String white(String input) {
        return WHITE + input + RESET;
    }
    public static String red(String input) {
        return RED + input + RESET;
    }
    public static String cyan(String input) {
        return CYAN + input + RESET;
    }
    public static String green(String input) {
        return GREEN + input + RESET;
    }
    public static String yellow(String input) {
        return YELLOW + input + RESET;
    }
}
