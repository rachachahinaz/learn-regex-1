import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToutFound {
    public static void main(String[] args) {

        String text =
                 """
                 racha
                 hello my friends ,
                 Contact me at +212660626214, 0770789854, +213660626214, 0570789854, 087078985 and number 123456.";
                 My email professional is: becheriracha1@gmail.com. Feel free to reach out!
                 my age is 2024-2003=20
                 if you cant come contact me with phone or gmail .
                 welcom !
                 """;

        String separ_Regex = "[,(;]";
        String motCle_Regex = "\\b(if|else|while|for)\\b";
        String oper_Regex = "[+\\-*/]";
        String ident_Regex = "[a-zA-Z_][a-zA-Z0-9_]*^\\b(if|else|while|for)\\b";
        String phone_Regex = "((\\+213|00213)(6|7|5)\\d{8})|(0[675]\\d{8})";
        String email_Regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";

        System.out.println("Searching for sparateur:");
        found(text, separ_Regex);

        System.out.println("Searching for operation:");
        found(text, oper_Regex);

        System.out.println("Searching for les mot cle:");
        found(text, motCle_Regex);

        System.out.println("Searching for phone numbers:");
        found(text, phone_Regex);

        System.out.println("Searching for identificateur:");
        found(text, ident_Regex);

        System.out.println("\nSearching for emails:");
        found(text, email_Regex);
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
