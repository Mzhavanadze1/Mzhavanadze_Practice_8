import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("sheikvane gasayopi ricxvi");
        int ricxvi1= input.nextInt();

        System.out.println("sheikvane gamyofi ricxvi ");
        int ricxvi2= input.nextInt();

        try {
            int shedegi = ricxvi1 / ricxvi2;
            System.out.println("ganayofi: " + shedegi);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

    }
}
