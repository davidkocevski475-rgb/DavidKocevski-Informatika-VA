package zadaci;
import java.util.Scanner;
public class smetka {
	public static void main(String[] args) {
		//jabolki-50 den, kg krusi-60 den, kg grozje-100den, kg
		double smetka = 0;
		System.out.println("vnesi sto si pazaruval vo kg");
		Scanner tastatura=new Scanner(System.in);
		System.out.println("jabolki:");
		double jabolki = tastatura.nextDouble ();
		System.out.println("krusi:");
		double krusi = tastatura.nextDouble ();
		System.out.println("grozje:");
		double grozje = tastatura.nextDouble ();
		smetka=jabolki*50+krusi*60+grozje*100;
		System.out.println("smetkata iznesuva:"+smetka+"denari");
		
	}

}