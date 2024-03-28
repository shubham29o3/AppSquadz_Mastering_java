import java.io.*;

class DataInputOutputStream
{
	public static void main(String...s) throws IOException
	{
		//--------------output--------------
		FileOutputStream fout=new FileOutputStream("CreatedFile.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeInt(10);
		dout.writeLong(1245L);
		dout.writeBoolean(false);
		dout.writeDouble(12.12);
		dout.close();
		//_____________________INPUT___________________________
		FileInputStream fin=new FileInputStream("CreatedFile.txt");
		DataInputStream din=new DataInputStream(fin);
		int in = din.readInt();
		long lg = din.readLong();
		boolean bl = din.readBoolean();
		double db = din.readDouble();

		System.out.println(in);
		System.out.println(lg);
		System.out.println(bl);
		System.out.println(db);
	}
}