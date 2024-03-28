import java.io.File;

class AllDriveSpace
{
	public static void  main(String...s)
	{
		
		File [] roots = File.listRoots();
		
		double d=1024*1024*1024;
		
		for(int i=0 ; i<roots.length ; i++)
		{
			System.out.println(roots[i]);
			System.out.println("Free Space = " + roots[i].getFreeSpace()/d + " Gb ");
			System.out.println("Usable Space= "+ roots[i].getUsableSpace()/d + "Gb");
			System.out.println("Total Space = " + roots[i].getTotalSpace()/d + "Gb");     
		}
	}
}