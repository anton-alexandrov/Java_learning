import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HowToReadFromKeyboard {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Your name is : "+name);

        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        System.out.println(age);

    }
}
