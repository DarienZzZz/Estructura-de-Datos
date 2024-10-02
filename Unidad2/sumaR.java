import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el tamaño del arreglo: ");
		int n1=sc.nextInt();
		
		int[] as= new int[n1];
		for(int i=0;i<n1;i++){
		    System.out.println("Ingrese los valores: ");
		    as[i]=sc.nextInt();
		}
		
		System.out.println("La suma del arreglo es: "+ suma(as, as.length-1));
	}
	public static int suma(int ar[],int p){
	    int t=p;
	    int r;
	    if(t==0){
	        return ar[t];
	    }else{
	       r = (ar[t]) + suma(ar, t - 1);
	    }
	    return r;
	    
	}
}