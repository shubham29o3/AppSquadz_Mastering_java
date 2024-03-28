import java.io.*;

public class ByteWriter {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream fw = new ByteArrayOutputStream();
        String s = "Gemini is what researchers call a large language model, or L.L.M., a mathematical system that can learn skills by analyzing vast amounts of data, including books, computer programs and online chatter. By identifying patterns in all that text, an L.L.M. can learn to generate text on its own. That means it can write poetry, generate computer code and even carry on a conversation.";
        byte ch[] = s.getBytes();
        for (int i = 0; i < ch.length; i++)
            fw.write(ch[i]); //fw.write(ch)
            //fw.writeTo(OutputStream o);
            fw.writeTo(new FileOutputStream("newfile2.txt"));
            fw.writeTo(new FileOutputStream("newfile3.txt"));
            System.out.println(fw.toString());
            byte z[] = fw.toByteArray();
            ByteArrayInputStream fr = new ByteArrayInputStream(z);
            int i = 0;
            while ((i = fr.read())!= -1)
                System.out.print((char) i);
        }
    }
