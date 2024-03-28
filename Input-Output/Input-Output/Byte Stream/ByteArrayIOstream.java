import java.io.*;

class ByteArrayIOstream
{
	public static void main (String...args)  throws IOException
	{
		FileOutputStream is=new FileOutputStream("ByteArray1.txt");
		//ByteArrayInputStream ba=new ByteArrayInputStream(is);
		ByteArrayOutputStream ba=new ByteArrayOutputStream();
		String s="Bharat is My Country";                                                                                                                                                                                                 
		byte ch[]=s.getBytes();
		for(int i=0 ; i<ch.length ; i++)
			ba.write(ch[i]);				//-------------or------------ ba.write(ch);
		//ba.writeTo(OutputStream o);
		ba.writeTo(is);                 //	  "ByteArray01.txt" 		FILE
		ba.writeTo(new FileOutputStream("ByteArray2.txt"));
		System.out.println(ba.toString());
		System.out.println(ba.toString());
		byte [] z=ba.toByteArray();
		ByteArrayInputStream bai=new ByteArrayInputStream(z);
		int i=0;
		while((i=bai.read())!=-1)
			System.out.print((char)i);
	}
}