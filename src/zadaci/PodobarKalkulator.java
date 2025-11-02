package zadaci;
import java.util.Scanner;
public class PodobarKalkulator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vnesi go prviot broj: ");
        double rezultat = sc.nextDouble();
        while (true) {
            System.out.print("Vnesi operacija: ");
            String op = sc.next();
            if (op.equals("=")) {
                System.out.println("Konechen rezultat: " + rezultat);
                break;
            }
            System.out.print("Vnesi go sledniot broj: ");
            double broj = sc.nextDouble();
            switch (op) {
                case "+":
                    rezultat += broj;
                    break;
                case "-":
                    rezultat -= broj;
                    break;
                case "*":
                    rezultat *= broj;
                    break;
                case "/":
                    rezultat /= broj;
                    break;
                default:
                    System.out.println("Nepoznata operacija!");
            }
        }
    }
}

