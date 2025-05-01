import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample3 {
    public static void main(String[] args) {
        // Text to search for email addresses
        String text = "My email profetional is  : support@example.com. Feel free to reach out!";

        // Regex pattern to find email addresses
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";

        // Compile the pattern
        Pattern pattern = Pattern.compile(emailRegex);

        // Search for matches in the text
        Matcher matcher = pattern.matcher(text);

        // Find and display all email addresses
        boolean found = false;
        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
            found = true;
        }

        // If no email address was found
        if (!found) {
            System.out.println("No email address found.");
        }
    }
}
