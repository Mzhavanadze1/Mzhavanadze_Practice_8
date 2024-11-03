public class Task4 {
    public static void main(String[] args) {
        String sityva = null;
        int[] ricxvebi = {1, 2, 3, 4, 5};


        try {
            System.out.println(sityva.length());
            System.out.println(ricxvebi[8]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds");
        }catch (NullPointerException e){
            System.out.println("String variable is null");
        }

    }
}
