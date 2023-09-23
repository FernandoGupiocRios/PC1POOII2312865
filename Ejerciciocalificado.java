
package ejerciciocalificado;
import java.util.Scanner;
import java.util.Random;

   
public class Ejerciciocalificado {
     
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String userInput = "si";

        while (userInput.equalsIgnoreCase("si")) {
            System.out.println("Tirando los dados...");

            int dice1 = random.nextInt(6) + 1; 
            int dice2 = random.nextInt(6) + 1;

            System.out.println("Sus valores son:");
            System.out.println(dice1 + " " + dice2);

            System.out.print("¿Desea volver a tirar los dados?  ");
            userInput = scanner.nextLine();
        }

        scanner.close();
        System.exit(0);
    }
}



