import java.io.*;

class Emp  extends Base implements Externalizable
{
	//private static final long seralVersionUID =1L;
	String name;
	static int a;
	transient int b;
	int age;
	int salary;
	public Emp()
	{
		System.out.println("Constructor");
	}
	
	Emp(String name, int a, int b, int age ,int z)
	{
		this.name=name;
		this.a=a;
		this.b=b;
		this.age=age;
		this.z=z;
	}
	public void writeExternal(ObjectOutput out) throws IOException
	{
		System.out.println("WriteExternal ");
		out.writeObject(name);
		out.writeInt(a);
		out.writeInt(b);
	}
	public void readExternal(ObjectInput oin)throws IOException, ClassNotFoundException
	{
		System.out.println("ReadExternal");
		name=(String)oin.readObject();
		a=oin.readInt();
		b=oin.readInt();
	}
	public String toString()
	{
		return("name " + name + "\n A" + a + "\n b" + b);
	}
}