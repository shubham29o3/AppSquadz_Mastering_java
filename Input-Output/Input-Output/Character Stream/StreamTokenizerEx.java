import static java.io.StreamTokenizer.TT_EOF;
import static java.io.StreamTokenizer.TT_NUMBER;
import static java.io.StreamTokenizer.TT_WORD;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

class StreamTokenizerEx
{
	public static void main(String...args) throws IOException
	{
		String  str="this is my String example in  StreamTokenizer  45  , 65";
		StringReader sr=new StringReader(str);
		StreamTokenizer st=new StreamTokenizer(sr);
		try
		{
			while (st.nextToken()!=TT_EOF)
			{
				switch(st.ttype)
				{
					case TT_WORD:
					System.out.println("String value " + st.sval);
					break;
					
					case TT_NUMBER:
					System.out.println("Number value " + st.nval);
					break;
				}
			}
		}
		catch (IOException e){ e.printStackTrace();	}
	}
}