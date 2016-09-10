import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



public class Write_And_Read_BothRun {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new FileWriter(new File("/Users/hyleung/Self/Code/","input2.txt")));
	
		String input = null;
		System.out.println("end means stopping");
		
		while(!(input = bfr.readLine()).equals("end")){
			bfw.write(input);
			bfw.newLine();
		}
		bfr.close();
		bfw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
