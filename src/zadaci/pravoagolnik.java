package zadaci;
import java.util.Scanner;
public class pravoagolnik {
	public static void main(String[] args) {
		double str1, str2, povrsina, perimetar;
		Scanner t=new Scanner(System.in);
		System.out.println("programata presmetuva povrsina i perimetar na pravoagolnik");
		str1=t.nextDouble ();
		System.out.println("vnesete dolzina na prvata strana");
		str2=t.nextDouble ();
		System.out.println("vnesete dolzina na drugata strana");
		povrsina=str1*str2;
		perimetar=2*str1+2*str2;
		System.out.println();
		System.out.println("perimetarot e:"+perimetar);
		//system.out.println(perimetar);
		System.out.println("plostinata e:"+povrsina);
		//system.out.println(povrsina)
}
}