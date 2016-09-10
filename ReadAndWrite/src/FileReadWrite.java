import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 */

/**
 * @author hyleung
 *
 */
public class FileReadWrite {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/Users/hyleung/git/java/ReadAndWrite/src","FileClass.java");
		FileInputStream fis = new FileInputStream(f);
		byte[] b = new byte[(int)f.length()];
		fis.read(b);
		File fi = f.createTempFile("Copyclass", ".java",new File("/Users/hyleung/Self/Code/"));
		FileOutputStream fou = new FileOutputStream(fi);
		fou.write(b);
		fou.close();
		fis.close();
		

	}

}
