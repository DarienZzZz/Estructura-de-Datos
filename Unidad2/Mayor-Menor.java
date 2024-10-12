import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println sc.nextInt()
		int c = 0, idk = 0;
		//Indicar el limite del arreglo
		System.out.println ("Ingresa la cantidad de numeros:");
		c =sc.nextInt();

		int[] numero = new int[c];
		int[] numero2 = new int[c];

		//For para llenar los arreglos
		for (int i = 0; i < c; i++)
		{
			System.out.println ("Ingresa el nuemero:");
			numero[i] = sc.nextInt();
			numero2[i] = numero[i];
		}
		for (int j = 0; j < c; j++)
		{
			for (int i = 0; i < c; i++)
			{
				if (numero[i] < numero2[j])
				{
					idk = numero[j]; //Almacenamos el valor del primer arreglo para no perderlo
					numero[j]=numero2[i]; //Limpiamos de nuevo el arreglo
					numero2[i]=idk; //Y almacenas el valor previamente guardado para poder imprimir
				}
			}
		}
		for(int i=0; i < c; i++)
		{
			System.out.println ("De menor a Mayor: " + numero[i]);
		}
	}
}
