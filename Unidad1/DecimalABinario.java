import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int num,idk,pot=0;
		System.out.println("Inserte el numero binario");
		num=sc.nextInt();
		for(int i=0;num!=0;i++){
		    idk=num%10;
		     pot+=idk*Math.pow(2,i);
		     num/=10;
		}
		System.out.println(pot);
	}
}
