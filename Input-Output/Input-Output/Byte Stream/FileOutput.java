import java.io.*;

class FileOutput
{
	public static void main (String...s) throws IOException 
	{
		FileOutputStream fo=new FileOutputStream("FileOutput.txt");			//Write Mode  -----------> override text                                                                                                                                               
		//FileOutputStream f1=new FileOutputStream("FileOutput.txt" , true);	//Appnd mode ---------> it create new text		
		String str=" Literal String,Aaj pdhe Output satream or input stream ,jisme fileinput or output stream tha ...fileinput stream ka istmal kr k hum new file generate kr skte hai ...durga sie se file object pdhe hai jisme file bnane k liye createNewfile() keyword ka use krna pdta hai ,,or Folderk liye .mkdir(); ka pr isme nhi use krna pdta hai  isme fileInputStream ka use krne se hi file bn jata hai ; mujhe array bhi colete krna hai ..set priority se hum thread ki aane ki sambhawna bdha skte hai ...maai abhi sath sath swing bhi pdh rha hu thread + io+array + swing kaise manage kru thoda disturb hu but mai inlogo k trh nhi hu main alg hu islye mai ye sb kr skta hu...THEY THINK I AM HIDING IN THE DARK....BUT I AM THE DARK......." ;

		byte by[] = str.getBytes();
		//fo.write(by); //method for printing without using loop
	
		 for(int i=0; i<by.length ; i++)
		{
			fo.write(by[i]);
		}
		fo.close();
		System.out.println("File Created") ;
	}
}