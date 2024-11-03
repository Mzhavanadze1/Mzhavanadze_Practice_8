import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        try {
            File file = new File("src/data.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();


        }catch (FileNotFoundException e){
            System.out.println("file not found. Please make sure data.txt exists in the directory.");
        }


    }
}
