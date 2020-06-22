package dp.compositeRepertory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	List<Component> components;
	
	public Composite(String _name) {
		super(_name);
		components = new ArrayList();
		
	}
	
	@Override
	public void Directories() {
		File file = new File(name);
		
		if(file.exists()) {
			
			File[] fileInDirectory = file.listFiles();
			
			for(File aFile:fileInDirectory) {
				
				Component theFileInDirectory;
				
				if(aFile.isDirectory()) {
				theFileInDirectory = new Composite(aFile.getAbsolutePath());
				theFileInDirectory.setIndentation(this.indentation+1);
					
				}else {
					
				theFileInDirectory = new AFile(aFile.getAbsolutePath());
				theFileInDirectory.setIndentation(this.indentation+1);
					
				}
								
				components.add(theFileInDirectory);
												
			}
			
		}
	
	}
	
	@Override
	public String Format(int _ind) {
		StringBuilder string = new StringBuilder();
			
		for(int i = 0; i < _ind; i++) {
			string.append('-');
		}
		
		string.append("Directory : " + name + "\n");
		
		for(Component aFile: components) {	
			aFile.Directories();
			string.append(aFile.Format(aFile.indentation));	
			
		}
		
		return string.toString();
			
	}
	
	public List<Component> getDirectories() {
		return components;
	}
	
	
}
				



