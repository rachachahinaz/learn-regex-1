import java.util.regex.*;

public class RegexExample{

    public static void main(String args[]){

//1st way

        Pattern p= Pattern.compile("[a_zA_Z][0_9]");//. represents single character

        Matcher m = p.matcher("a9");

        boolean b = m.matches();

//2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

//3rd way

        boolean b3 = Pattern.matches(".s", "as");

        System.out.print(b+" \n"+b2+" \n"+b3);

    }}