package zadaci;
import java.util.Scanner;
public class stepeni {
public static void main(String[] args) {
	int f;
	int c;
	Scanner t=new Scanner(System.in);
	System.out.print("Vnesi broj na celziusovi stepeni: ");
	c=t.nextInt();
	f=9*c/5+32;
	System.out.println("Vkupen broj na celziusovi stepeni: " + c);
	System.out.println("Vkupen broj na ferenhajtovi stepeni: " + f);
}
}
