import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]array={2, 4, 6, 8, 10};
        int fixednum= 40;

        try {
            System.out.println("sheikvane indeqsi: ");
            int index = input.nextInt();
            int arrayindex= array[index];
            System.out.println("array number : " + arrayindex);


            System.out.println("sheikvane gamyofi");
            int gamyofi = input.nextInt();

            int result= fixednum/gamyofi;
            System.out.println("Shedegi : " + result);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }finally {
            input.close();
        }

    }
}
