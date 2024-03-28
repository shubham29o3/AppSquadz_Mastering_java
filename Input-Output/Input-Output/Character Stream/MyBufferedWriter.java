import java.io.*;

class MyBufferedWriter
{
	public static void main(String...args) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bfr=new BufferedReader(isr) ;
		
		FileWriter fw=new FileWriter("MyBufferedWriter.txt");
		BufferedWriter bfw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bfw);
		
		String s=" "; 
		while (!s.equals("Stop"))
		{
			s=bfr.readLine();
			//bfw.wite(s);
			//bfw.write(" ");
			pw.println(s);
			//bfw.flush();
		}
		bfr.close();
		bfw.close();
	}               
}