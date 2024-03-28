import java.io.*;

class WriteInFile
{
	public static void main(String...s) throws IOException
	{
		//File f=new File("Write.txt");
		//f.createNewFile();
		FileWriter fw=new FileWriter("Write.txt");
		//FileWriter fw=new FileWriter("Write.txt" , true);
		
		fw.write(65);
		fw.write("ditya\n Jaiswal");
		fw.write('\n');
		char[] ch={'a','a','d','i'};
		fw.write(ch);
		//fw.flush();
		fw.close();
		System.out.println("Your file is created sucessfully");
	}
}