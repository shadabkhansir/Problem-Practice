import java.util.Scanner;
public class InputOutput{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter New Number");
        int number =reader.nextInt();
        System.out.println("your number is " + number);
    }

}