//Import Library
import java.util.Scanner; // Import the Scanner class to read user input
import java.util.Random; // Import the Random class to generate random funfact

public class MyFirstProgram {
    public static void main(String[] args) throws Exception {
        // ANSI escape codes for colors
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        // String ANSI_BLUE = "\u001B[34m";
        // String ANSI_PURPLE = "\u001B[35m";
        // String ANSI_WHITE = "\u001B[37m";

        // Display a Welcome Message
        System.out.println(ANSI_GREEN + "Hello World!");

        // User Input and Personalized Greeting
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_CYAN + "Please enter your name: " + ANSI_RESET);
        String name = scanner.nextLine();
        System.out.println(
                ANSI_GREEN + "Hello, " + ANSI_RESET + name + "!" + ANSI_YELLOW + " Welcome to Java programming.");

        // Array of Fun Facts About Java
        String[] funFacts = {
                "Did you know that Java was originally called Oak?",
                "Java was created by James Gosling at Sun Microsystems.",
                "The first version of Java was released in 1995.",
                "Java is used by over 9 million developers worldwide.",
                "Java is platform-independent, which means it can run on any device with a Java Virtual Machine (JVM)."
        };

        // Generate a random fun fact
        Random random = new Random();
        int randomIndex = random.nextInt(funFacts.length);
        String randomFunFact = funFacts[randomIndex];
        System.out.println(ANSI_RED + randomFunFact + ANSI_RESET);

        scanner.close();
    }
}

// Reference: https://en.wikipedia.org/wiki/ANSI_escape_code
// Reference: https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
// Reference: https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html
// Fun Facts Reference #1: https://en.wikipedia.org/wiki/Java_(programming_language)
// Fun Facts Reference #2: https://www.oracle.com/java/