import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int c, f;

		System.out.println("Ingrese la cantidad de filas: ");
		f = sc.nextInt();
		System.out.println("Ingrese la cantidad de columnas: ");
		c = sc.nextInt();


		int[][]nums = new int [f][c];
		int[][]nums2 = new int [f][c];
		int[][]suma=new int [f][c];
		for(int i=0; i<f; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.println("Ingrese el dato del primer arreglo: " );
				nums[i][j] = sc.nextInt();
				System.out.println("Ingrese el dato del segundo arreglo: " );
				nums2[i][j]= sc.nextInt();

				suma[i][j]+= nums[i][j]+nums2[i][j];
	        System.out.println("posicion: "+i+" "+j +""+ " = "+ suma[i][j]);
			}

		}
	}
}
