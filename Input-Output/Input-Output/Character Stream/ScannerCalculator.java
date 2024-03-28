import java.util.Scanner;

class ScannerCalculator
{
	public static void main(String...args)
	{
		System.out.println("Type something like : 1 + 5");
		Scanner sc=new Scanner(System.in);
		double d1=Double.NaN;
		double d2=Double.NaN;
		String operation = null ;
		
		try
		{
			d1=sc.nextDouble();
			operation = sc.next();
			d2=sc.nextDouble();
			
			double result = calculate(d1,d2,operation);
			System.out.printf("%s %s %s = %.2f%n" ,d1,operation,d2,result);
		}
		catch(Exception e){	System.out.println("An invalid Expression");	}
	}
	public static double calculate(double op1,double op2,String operation)
	{
		switch ( operation )
		{
			case "+":
			return op1 +op2;
			case"-":
			return op1-op2;
			case"*":
			return op1*op2;
			case"/":
			return op1/op2;
		}
		return Double.NaN;
	}
}