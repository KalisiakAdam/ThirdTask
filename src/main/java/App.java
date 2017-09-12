import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();
        int clientNumber = keyboard.keyboardNumber(new Scanner(System.in));
        System.out.println("My number is: " + clientNumber);

        FizzBuzz fizzBuzz = new FizzBuzz();
        Object[] result = fizzBuzz.putNumbersInArray(clientNumber);

        for(Object c : result){
           System.out.print(c + ", ");
        }
    }
}
