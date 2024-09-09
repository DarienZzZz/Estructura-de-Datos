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
				System.out.print("Ingrese el dato "+i+" "+j+" del primer arreglo: " );
				nums[i][j] = sc.nextInt();
				System.out.print("Ingrese el dato "+i+" "+j+" del segundo arreglo: ");
				nums2[i][j]= sc.nextInt();
			}

		}
		for(int i=0; i<f; i++)
		{
			for(int j=0; j<c; j++)
			{
				for(int z=0; z<=f; z++) {
					for(int w=c-1; w>=0; w--) {
						suma[i][j]+= nums[z][w]+nums2[z][w];
					}
				}
			}
		}


		for(int i=0; i<f; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.println("posicion: "+i+" "+j +""+ " = "+ suma[i][j]);
			}

		}

	}
}