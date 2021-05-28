import java.util.*;
public class Even_Odd
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check : ");
		int num = scan.nextInt();
		scan.close();
		if(num % 2 == 0){
		    System.out.println("Number is even");
		}
		else{
		    System.out.println("Number is odd");
		}
	}
}
