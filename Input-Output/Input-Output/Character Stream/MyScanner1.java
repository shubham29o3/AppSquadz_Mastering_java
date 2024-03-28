import java.io.*;
import java.util.*;

class MyScanner1
{
	public static void main(String...args) throws IOException
	{
		System.out.println("Write int, doubke ,lfloat , long ");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		double d=sc.nextDouble();
		float f1=sc.nextFloat();
		long l1=sc.nextLong();
		System.out.println( i + d + f1 + l1 );
	}
}