import java.util.Scanner;
import java.lang.String;

public class TextShortcuts {

    public static void main(String[] args) {

        Scanner shortform = new Scanner(System.in);
        String oldchar;
        System.out.print("Type in the text that will be replaced: ");
        oldchar= shortform.nextLine();
        System.out.println(oldchar + " will be replaced by: ");

        Scanner longform = new Scanner(System.in);
        String newchar;
        newchar= longform.nextLine();
        System.out.println(newchar + " is the replacement of " + oldchar + ".");

        Scanner replace = new Scanner(System.in);
        String input;
        input= replace.nextLine();

        System.out.println(input.replace(oldchar, newchar));

    }
}
