package Synchronization;

import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        List<Integer> ev= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> num=ev.stream().filter(n->n%2==0).toList();
        System.out.println("i = " + num);

        http://prices.azure.com/api/retail/prices?$filter=meterId%20eq%20%27cd926b81-ccc0-5185-bb72-b2c301d4a3ea%27

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i < num.toArray().length; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + num.toArray()[i]);

        }
    }
}