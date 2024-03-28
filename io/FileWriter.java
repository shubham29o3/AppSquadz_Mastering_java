import java.io.*;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        FileOutputStream fw = new FileOutputStream("newfile.txt");
        //FileOutputStream fw = new FileOutputStream("newfile.txt", true);
       // FileOutputStream fw = new FileOutputStream(new File("d:\\appsqa\\nesfile.txt"));
       // FileOutputStream fw = new FileOutputStream(("d:\\appsqa\\nesfile.txt"), true);

        String s = "On Thursday, Google introduced Gemini, a smartphone app that behaves like a talking digital assistant as well as a conversational chatbot. Responding to voice and text requests, it can answer questions, write poetry, generate images, draft emails, analyze personal photos and take other actions, like setting a timer or placing a phone call.\n" +
                "\n" +
                "Immediately available to English speakers in more than 150 countries and territories, including the United States, Gemini replaces Bard and Google Assistant. It is underpinned by artificial intelligence technology that the company has been developing since early last year.\n" +
                "\n" +
                "The new app is designed to do an array of tasks, including serving as a personal tutor, helping computer programmers with coding tasks and even preparing job hunters for interviews, Google said.\n" +
                "\n" +
                "It can help you role-play in a variety of scenarios, said Sissie Hsiao. a Google vice president in charge of the company’s Google Assistant unit, during a briefing with reporters.";
        byte ch[] = s.getBytes();
        fw.write(ch);
        for (int i = 0; i < ch.length; i++)
            fw.write(ch[i]);
        fw.close();
        System.out.println("file created successfully");
    }
}

class FileReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("newfile.txt");
        //FileInputStream fr = new FileInputStream((new File("d:\\appsqa\\nesfile.txt")));
        int i = 0;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);
        fr.close();
    }
}