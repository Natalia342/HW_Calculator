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

    public void /* double*/  calc(int a, int b, char action) {
 /*       res = "a+b";
        System.out.println("a + b");
        res = "a-b";
        System.out.println("a - b");
        res = "a * b";
        System.out.println("a * b");
        res = "a/b";
        System.out.println("a / b");*/
         int val;
           switch (action) {
            case '+':
            val = a+b;
            res = Integer.toString(val);
                System.out.println("a + b="+res);
                break;
           case '-':
                val = a-b;
                res = Integer.toString(val);
                System.out.println("a - b="+res);
                break;
            case '*':
            val = a*b;
            res = Integer.toString(val);
                System.out.println("a * b="+res);
                break;
            case '/':
            val = a/b;
            res = Integer.toString(val);
                System.out.println("a/b="+res);
                break;

        }
    }
}