import java.io.*;

class MyCharArrayWriterReader
{
	public static void main(String...args) throws IOException
	{
		CharArrayWriter caw=new CharArrayWriter();
		String s =" BHARAT mera Desh  MAHAN";
		char ch[]=s.toCharArray();
		
		for(int i=0 ; i<ch.length ; i++)
			caw.write( ch [i] ) ;
		
		caw.writeTo(new FileWriter("CHAR_ARRAY_WRITER_READER.txt"));
		System.out.println(caw.toString());
		
		char z[]= caw.toCharArray();
		CharArrayReader car=new CharArrayReader(z);
		int i=0;
		while((i=car.read())!=-1)
			System.out.print((char)i);
	}
}