package java_stepik;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class calculator_simple {
    public static void  main (String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\79178\\IdeaProjects\\stepik1\\src\\java_stepik\\input.txt");
            calculate(reader);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void calculate (FileReader reader) {
        Scanner sc = new Scanner(reader);
        String str = sc.nextLine();
        String[] mas = str.split(" ");
        double a = 0, b = 0;
        try {
            a = Double.parseDouble(mas[0]);
            b = Double.parseDouble(mas[2]);
        } catch (NumberFormatException error) {
            System.out.println("Error! Not number");
            return;
        }
        try {
            if (mas[1].contentEquals("+")) {
                System.out.println( a + b);
                return;
            }
            if (mas[1].contentEquals("-")) {
                System.out.println( a - b);
                return;
            }
            if (mas[1].contentEquals("*")) {
                System.out.println( a * b);
                return;
            }
            if (mas[1].contentEquals("/")) {
                if (b==0.0) throw new ArithmeticException("Error! Division by zero");
                System.out.println( a / b);
                return;
            }
            System.out.println("Operation Error!");

        } catch (ArithmeticException error){
            System.out.println(error.getMessage());
            return;
        }
    }
}
