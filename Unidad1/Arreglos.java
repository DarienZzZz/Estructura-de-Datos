import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int c;

      System.out.println("Ingresa la cantidad de numeros:");
      c = sc.nextInt();

      int[] nums = new int[c];

      for (int i = 0; i < c; i++)
      {
        System.out.println("Ingresa el numero:");
        nums[i] = sc.nextInt();
	}
	for(int i=c-1; i>=0; i--)
        {
            
                 System.out.println("Numeros: " +  nums[i]);
                 
               
        }
}
}