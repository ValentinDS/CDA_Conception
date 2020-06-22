import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import dp.compositeRepertory.*;

public class ApplicationDirectories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Composite filetest = new Composite("absolute link");
		
		filetest.Directories();
		
		System.out.println(filetest.Format(filetest.getIndentation()));
		


		
	}

}
