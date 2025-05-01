import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhone {

    public static void main(String[] args) {
        // Sample text to search for phone numbers
        String text = "Contact us at +212660626214,  0770789854 ,+213660626214 , 0570789854 , 087078985 and an invalid number 123456.";

        // Updated regex pattern to find valid phone numbers in the specific formats
        String phoneRegex = "((\\+213|00213)(6|7|5)\\d{9})|(0[675][0-9]{8})pt";

        // Compile the pattern
        Pattern pattern = Pattern.compile(phoneRegex);

        // Split the text by spaces and commas to check each part separately
        String[] parts = text.split("[ ,]+"); // Separate by spaces and commas

        boolean found = false;

        for (String part : parts) {
            // Check if each part matches the phone number pattern
            Matcher matcher = pattern.matcher(part);

            if (matcher.matches()) {
                System.out.println("Found valid phone number: " + part);
                found = true;
            } else if (part.matches("\\d+")) { // Additional check for numeric parts only
                System.out.println("Error: Invalid phone number format - " + part);
            }
        }

        // If no valid phone numbers were found
        if (!found) {
            System.out.println("No valid phone numbers found.");
        }
    }
}
