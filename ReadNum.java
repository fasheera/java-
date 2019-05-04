import java.util.Scanner;
class ReadNum{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);

System.out.println("enter your age");
int age=scan.nextInt();
scan.close();
System.out.println("the number entered by user:"+age);
}}