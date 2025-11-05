package zadaci;
import java.util.Scanner;
public class kamata {
public static void main(String[] args) {
	double deposit;
	double KamatnaStapka;
	double VkupenIznos;
	Scanner t=new Scanner(System.in);
	System.out.println("Vnesi go depositot: ");
	deposit=t.nextDouble();
	System.out.println("Vnesi procent na kamatna stapka: ");
	KamatnaStapka=t.nextDouble();
	VkupenIznos=deposit*KamatnaStapka;
	deposit = deposit + VkupenIznos;
	System.out.println();
	System.out.println("Paricen iznos na godisna kamata: ");
	System.out.println(VkupenIznos);
	System.out.println("Zgolemen deposit posle 1 godina: ");
	System.out.println(deposit);

}

}
