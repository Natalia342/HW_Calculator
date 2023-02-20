import javax.swing.*;
import java.awt.*;
public class Calculator {
    int a;
    int b;
    char action;
    String res;

    public static void print() {
        System.out.println("This is a calculator");
    }

    public void /* double*/  calc(/*int a, int b, char action*/) {
        res = "a+b";
        System.out.println("a + b");
        res = "a-b";
        System.out.println("a - b");
        res = "a * b";
        System.out.println("a * b");
        res = "a/b";
        System.out.println("a / b");

      /*  switch (act) {
            case "+":
                System.out.println("a + b");
           case "-":
                System.out.println("a - b");
            case "*":
                System.out.println("a * b");
            case "/":
                System.out.println("a / b");
        }*/
    }
}