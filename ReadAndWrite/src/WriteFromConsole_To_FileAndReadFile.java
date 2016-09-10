import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteFromConsole_To_FileAndReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n ;
		InputStreamReader in = new InputStreamReader(System.in);
		File f = new File("/Users/hyleung/Self/Code/","input.txt");

		FileWriter fw = new FileWriter(f);
		FileReader fr = new FileReader(f);
		while((n= in.read())!= '\n')
		{
			fw.write(n);
		}
		in.close();
		fw.close();
		
		char ch[] = new char[(int)f.length()];
		fr.read(ch);
		for(int i = 0; i<ch.length; i++)
		{
			System.out.print(ch[i]);
		}
		
	}

}
