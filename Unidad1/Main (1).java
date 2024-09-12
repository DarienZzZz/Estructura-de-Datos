import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0, r=0,s=0;
		do {
		System.out.print("Ingrese la cantidad numeros: ");
		c=sc.nextInt();
		int [] usuario = new int[c];
		int [] random = new int [c];
		int u=0;
		//int r=0;
		int ma=usuario[0];
		int me=random[0];
		
			for(int i=0; i<c; i++) {
				System.out.print("Ingrese los numeros: ");
				usuario[i]=sc.nextInt();
			}

			if(c==5) {
				for(int j=0; j<5; j++) {
					Random ran = new Random();
					random[j]= ran.nextInt(1000);
					System.out.println(random[j]);
				}
			}
			for (int i=1; i<usuario.length; i++) {
				if (usuario[i] > ma) {
					ma = usuario[i];
					
				}
			}
			for (int i = 1; i < random.length; i++) {
            if (random[i] < me) {
                me = random[i];
            }
        }
			/*for (int j=1; j<random.length; j++) {
				if (random[j] < me) {
					me = random[j];
					
				}
			}*/
            System.out.println("El numero mayor por el usuario es: "+ ma+" Y el menor por aleatorio es: "+me);
            
			System.out.println("Desea Continuar:SI-2, NO-1");
			s=sc.nextInt();
		} while(s!=1);
	}
}