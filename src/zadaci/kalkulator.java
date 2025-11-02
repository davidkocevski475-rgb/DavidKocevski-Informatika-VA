package zadaci;
import java.util.Scanner;
public class kalkulator {
public static void main(String[] args) {
	Scanner i=new Scanner(System.in);
	Scanner s=new Scanner(System.in);
	System.out.print("Vnesi go prviot broj: ");
	double a=i.nextDouble();
	System.out.println("Vnesi ja posakuvanata operacija: ");
	String operacija=s.nextLine ();
	System.out.print("Vnesi go vtoriot broj: ");
	double b=i.nextDouble();
	double c;
	switch(operacija) {
	case "+":
		c=a+b;
		System.out.println(a+operacija+b+"="+c);
		break;
	case"-":
		c=a-b;
		System.out.println(a+operacija+b+"="+c);
		break;
	case "*":
		c=a*b;
		System.out.println(a+operacija+b+"="+c);
		break;
	case "/":
		c=a/b;
		System.out.println(a+operacija+b+ "="+c);
		break;
		default:
			System.out.println("Proverete sto imate napisano");
			break;
		
	}
}
}
