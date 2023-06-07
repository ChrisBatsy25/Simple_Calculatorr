
import java.util.Scanner;
class Calculator

	{ 
	public static void main (String[] args) {
	
	int n1;
	int n2;
	int op;
	int cal;
	System.out.print("Enter the two numbers");
	Scanner r = new Scanner(System.in);
	n1=r.nextInt();
	n2=r.nextInt();
	System.out.print("Select the operation : 1-Addition 2-Subtraction 3-Multiplication 4-Division");
	op=r.nextInt();
	if (op==1){
		cal=n1+n2;
		System.out.print("Added result: "+cal);
	}
	else if (op==2){
		cal=n1-n2;
		System.out.print("Subtracted result: "+cal);
	}
	else if (op==3){
		cal=n1*n2;
		System.out.print("Multiplied result: "+cal);
	}
	else if (op==4){
		cal=n1/n2;
		System.out.print("Divided result: "+cal);
	}
	else{
		System.out.print("ERROR : Operation not defined");
	}
	
	}
	
	}