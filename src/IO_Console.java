import java.util.Locale;
import java.util.Scanner;

import java.util.Scanner;

public class IO_Console implements IO_Stratagy{

    Scanner keyboard = new Scanner(System.in);


    @Override
    public char inputCharacter() {
        return keyboard.nextLine().toUpperCase().charAt(0);
    }


    @Override
    public String inputString() {
        return keyboard.nextLine();
    }


    @Override
    public void outputLine(String line) {
        System.out.println(line);
    }

}
