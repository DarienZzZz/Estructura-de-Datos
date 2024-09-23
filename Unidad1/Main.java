import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		int n1=sc.nextInt();
		System.out.println("Factorial de "+ n1+ " es: "+ factos(n1));
	}
	public static int factos(int n){
	    if(n>1){
	        return n*factos(n-1);
	    }else{
	        return 1;
	    }
	    
	}
}
