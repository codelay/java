import java.io.File;


public class FileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/Users/hyleung/Documents/To do folder/","ir6104.pdf");
		FileClass.fileInfo(f);		
	}
	
	public static void fileInfo(File f)
	{
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getParent());
		System.out.println(f.getAbsolutePath());
	}

}
