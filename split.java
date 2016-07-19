import java.util.Scanner;


public class split {

	public static void main(String[] args) {
		String input1=" ";
		Scanner sc=new Scanner(System.in);
		input1=sc.nextLine();		
String a[]=input1.split(" ");
if(a.length==1)
{
	System.out.println("less");
}
else
{
	System.out.println(a[1].toUpperCase());
}
	}

}
