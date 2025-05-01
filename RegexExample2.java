import java.util.regex.*;

public class RegexExample2 {
    public static void main(String args[]) {

        // 1st  Identificateur:
        Pattern identificateurPattern = Pattern.compile("^[a-zA-Z_][a-zA-Z0-9_]*$");
        Matcher identificateurMatcher = identificateurPattern.matcher("meriem");
        boolean isIdentificateur = identificateurMatcher.matches();

        // 2nd way - Operation: نمط للتحقق من العمليات الحسابية
        Pattern operationPattern = Pattern.compile("[+\\-*/]");
        Matcher operationMatcher = operationPattern.matcher("+");
        boolean isOperation = operationMatcher.matches();

        // 3rd  Mot clé:
        Pattern motClePattern = Pattern.compile("\\b(if|else|while|for)\\b");
        Matcher motCleMatcher = motClePattern.matcher("if");
        boolean isMotCle = motCleMatcher.matches();

        // 4th  Separateur:
        Pattern separateurPattern = Pattern.compile("[,(;]");
        Matcher separateurMatcher = separateurPattern.matcher("(");
        boolean isSeparateur = separateurMatcher.matches();






        System.out.println("Identificateur match: " + isIdentificateur);
        System.out.println("Operation match: " + isOperation);
        System.out.println("Mot clé match: " + isMotCle);
        System.out.println("Separateur match: " + isSeparateur);
    }
}
