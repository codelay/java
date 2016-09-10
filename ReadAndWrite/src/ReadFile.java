import java.io.*;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s;
		FileInputStream is;
		InputStreamReader ir;
		BufferedReader in;
		
		try{
			is = new FileInputStream("/Users/hyleung/git/java/ReadAndWrite/src/AccessAndWrite.java");
			ir = new InputStreamReader(is);
			in = new BufferedReader(ir);
			while((s= in.readLine())!= null)
				System.out.println(s);
			
		}catch(FileNotFoundException e){
			System.out.println("File not Found");
			System.exit(-2);
		}catch(IOException e){
			System.out.println("Error:" + e);
			System.exit(-3);
		}
	}

}
