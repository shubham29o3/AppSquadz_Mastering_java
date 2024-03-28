import java.io.*;

public class Emp extends Base implements Serializable
{
	private static final long seralVersionUID =1L;
	transient int a;
	static int b;
	String name;
	int age;
	int salary;
	//Base b1=new Base();
	Emp(String name,int age ,int salary, int a, int b, int z)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.a=a;
		this.b=b;
		this.z=z;
	}
}