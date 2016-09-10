import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		
		try{
			System.out.println("Plz input something");
			while((c = in.read())!= '\n')
				out.write(c);
			out.close();
			in.close();
		}catch(IOException e){
			System.out.println("Input fail");
		}
	}

}
