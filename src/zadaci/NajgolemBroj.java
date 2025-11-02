package zadaci;
import java.util.Scanner;
public class NajgolemBroj {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("najgolem n od vcitani borevi:");
		int n, x, max;
		System.out.println("kolku broevi ke prveruvas");
		n=input.nextInt();
		System.out.println("Vnesi 1 broj");
		x=input.nextInt();
		max=x;
		for (int i=2; i<=n;i++) {
			System.out.println("Vnesi" + i + "broj");
			x=input.nextInt();
			if (x>max)
				max=x;
		}
		System.out.println("najgolem broj e" +max);
		
			
		
				
	}
	}