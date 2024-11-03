import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);


        try {
            System.out.println("sheiyvane intejeri : ");
            int sheyvanili= input.nextInt();
            System.out.println("sheyvanili intejeria: " + sheyvanili);
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter an integer");
        }finally {
            input.close();
        }
    }
}
