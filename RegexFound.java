import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFound {
    public static void main(String[] args) {

        String text1 = "Contact us at +212660626214, 0770789854, +213660626214, 0570789854, 087078985 and number 123456.";
        String text2 = "My email professional is: becheriracha1@gmail.com. Feel free to reach out!";


        String phone_Regex = "((\\+213|00213)(6|7|5)\\d{8})|(0[675]\\d{8})";
        String email_Regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";

        System.out.println("Searching for phone numbers:");
        found(text1, phone_Regex);

        System.out.println("\nSearching for emails:");
        found(text2, email_Regex);
    }

    public static void found(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean found = false;

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No match found.");
        }
    }
}
