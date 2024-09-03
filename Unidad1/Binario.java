import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int n = sc.nextInt();
		String bi = "";
		if (n > 0) {
			while (n > 0) {
				if (n % 2 == 0) {
					bi = "0" + bi;
				} else {
					bi = "1" + bi;
				}
				n = n / 2;
			}
		}
		System.out.println("Su numero en binario es: " + bi);
	}
}
