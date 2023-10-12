/*
a) Write a package for String operation which has two classes Con and Comp. Con class
has to concatenates two strings and comp class compares two strings. Also display
proper message on execution.
 */

class StrOperations {
    public String con(String str1, String str2) {
        System.out.println("Strings are concatineted.");
        return str1 + str2;
    }

    public boolean comp(String str1, String str2) {
        return str1.equals(str2);
    }
} 

public class Asg2Ca {
    public static void main(String[] args) {
        StrOperations obj = new StrOperations();

        String str = obj.con("chetan ", "mankar");
        System.out.println(str);

        if(obj.comp("How you doing", "How you doin")) {
            System.out.println("String are equal.");
        } else {
            System.out.println("String are not equal.");
        }
    }
}
