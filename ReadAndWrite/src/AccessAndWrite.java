import java.io.DataOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccessAndWrite {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("/Users/hyleung/Self/Code/","Test.txt");
		byte[] bf = new byte[(int)f.length()];
		RandomAccessFile rf = new RandomAccessFile (f, "rw");
		
		
		try{
			rf.read(bf);
			for(int i=0;i<bf.length; i++)
			{
				bf[i] = (byte) (bf[i]+12);
			}
//			rf.setLength(0);    
//			rf.write(bf);
//			rf.seek(3);
//			System.out.println((char)rf.read());
			
//			RandomAccessFile is linked with bf 
			
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		File f1 = new File("/Users/hyleung/Self/Code/","Test.txt");
		File f2 = new File("/Users/hyleung/Self/Code/","Decode.txt");
		RandomAccessFile rf2 = new RandomAccessFile (f2, "rw");
		
		byte[] bf1 = new byte[(int)f1.length()];
		try{
			
			for(int i=0;i<bf1.length; i++)
			{
				bf1[i] = (byte) (bf[i]-12);
			}
			
			rf2.setLength(0);
			rf2.write(bf1);
			
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}

}
