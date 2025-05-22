import javax.swing.JOptionPane;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your grade");
        int huzz = sc.nextInt();
        System.out.println("your grade next year will be " + (++huzz));
    }
}
