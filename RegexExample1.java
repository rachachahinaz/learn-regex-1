import java.util.regex.*;

public class RegexExample1 {
        public static void main(String args[]) {
                // 1st way - مثال على طريقة الاستخدام الأولى
                Pattern p = Pattern.compile("[a-zA-Z][0-9]"); // حرف يتبعه رقم (معالجة الخطأ في النطاق)
                Matcher m = p.matcher("a9");
                boolean b = m.matches();

                // 2nd way - مثال على طريقة الاستخدام الثانية
                boolean b2 = Pattern.compile(".s").matcher("as").matches();

                // 3rd way - مثال على طريقة الاستخدام الثالثة
                boolean b3 = Pattern.matches(".s", "as");

                // إضافة الأنماط الأخرى المطلوبة
                Pattern identificateur = Pattern.compile("^[a-zA-Z_][a-zA-Z0-9_]*$"); // معرف صالح
                Pattern operation = Pattern.compile("[+\\-*/]"); // عملية رياضية
                Pattern motCle = Pattern.compile("\\b(if|else|while|for)\\b"); // كلمات مفتاحية
                Pattern separateur = Pattern.compile("[,;]"); // فواصل مثل الفاصلة أو الفاصلة المنقوطة

                // مجموعة من السلاسل لاختبار المطابقة
                String[] testStrings = {"a9", "x1", "if", "a+b", ";", "while", "variable_name", "for"};

                // التحقق من المطابقة لكل نمط على السلاسل
                System.out.println("Results for primary expressions:");
                System.out.println(b + " \n" + b2 + " \n" + b3);
                System.out.println("\nResults for additional patterns:\n");

                for (String test : testStrings) {
                        Matcher identMatcher = identificateur.matcher(test);
                        Matcher opMatcher = operation.matcher(test);
                        Matcher motCleMatcher = motCle.matcher(test);
                        Matcher sepMatcher = separateur.matcher(test);

                        // عرض نتائج المطابقة لكل نمط
                        System.out.println("Testing: \"" + test + "\"");
                        System.out.println("Is Identificateur? " + identMatcher.matches());
                        System.out.println("Contains Operation? " + opMatcher.find());
                        System.out.println("Is Mot Clé? " + motCleMatcher.find());
                        System.out.println("Contains Separateur? " + sepMatcher.find());
                        System.out.println("--------------");
                }
        }
}
