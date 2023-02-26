package java_stepik;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
public class calc_output {

    public static void  main (String[] args) throws IOException {

        try {

            FileReader reader = new FileReader("C:\\Users\\79178\\IdeaProjects\\stepik1\\src\\java_stepik\\input.txt");
            calculate(reader);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void calculate (FileReader reader) throws IOException {
        File file = new File("C:\\Users\\79178\\IdeaProjects\\stepik1\\src\\java_stepik\\output1.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.flush();
        Scanner sc = new Scanner(reader);
        String str = sc.nextLine();
        String[] mas = str.split(" ");
        double a = 0, b = 0;
        try {

            a = Double.parseDouble(mas[0]);
            b = Double.parseDouble(mas[2]);
        } catch (NumberFormatException error) {
            writer.write("Error! Not number");
            writer.flush();
            writer.close();
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
                writer.write("Error! Division by zero");
                writer.write((int) (a / b));
                return;
            }
            System.out.println("Operation Error!");

        } catch (ArithmeticException error){
            writer.write(error.getMessage());
            return;
        }
    }
}

