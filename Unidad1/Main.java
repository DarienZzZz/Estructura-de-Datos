import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0, r=0,s=0;
		System.out.print("Ingrese la cantidad numeros: ");
		c=sc.nextInt();
		int [] usuario = new int[c];
		int [] random = new int [c];
		do {
			for(int i=0; i<c; i++) {
				System.out.print("Ingrese los numeros: ");
				usuario[i]=sc.nextInt();
			}

			if(c==5) {
			    for(int i=0;i<5;i++){
				Random ran = new Random();
				random[i]= ran.nextInt(1000);
			    }
			}
			for(int i=){
			    
			}
			System.out.print("Desea Continuar:SI-2, NO-1");
		} while(s!=1);
		}
}