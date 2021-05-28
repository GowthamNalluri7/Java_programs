import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args){
        Scanner mul = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = mul.nextInt();
        System.out.println("Enter Second Number : ");
        int b = mul.nextInt();
        mul.close();
        int product = a*b;
        System.out.println("Output : "+product);
    }
}