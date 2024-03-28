import java.io.*;

class  WriteDataFromKeyboard
{
	public static void main(String...s) throws IOException
	{
		DataInputStream din=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("WriteDataFromKeyboard.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		
		String str= " " ;
		while( ! str.equals("Stop"))
		{
			str=din.readLine();
			System.out.println(str);
			dout.writeBytes(str);
			//dout.writeUTF(str) ;			 //Unicode Text Format ------use for reciving data in file on decrypting format----------------------
			//dout.writeBytes(str);			
			//dout.writeChars(str);			
			dout.flush();
		}
		din.close();
		dout.close();
	}
}