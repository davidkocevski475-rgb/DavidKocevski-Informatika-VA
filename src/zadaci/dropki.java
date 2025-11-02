package zadaci;
import java.util.Scanner;
public class dropki {
 public static void main(String[] args) {
	 int n1,n2,n1prim,n2prim;
	 Scanner t=new Scanner(System.in);
	 System.out.println("Vnesete broitel:");
	 n1=t.nextInt();
	 System.out.println("Vnesete imenitel");
	 n2=t.nextInt();
	 n1prim=n1;
	 n2prim=n2;
	 while(n1!=n2) {
	 if (n1>n2) {
	 n1=n1-n2;
	 } else {
		 n2=n2-n1;
	 }
	 }
	 int nzd=n1;
	 System.out.println("\n nzd na broevite e:" +nzd);
	 System.out.println("\nСкратената дробка е: " + (n1prim / nzd) + "/" + (n2prim / nzd));
	 
	 
	 
 }
}
