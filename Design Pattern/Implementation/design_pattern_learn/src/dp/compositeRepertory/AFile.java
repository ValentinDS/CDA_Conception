package dp.compositeRepertory;

public class AFile extends Component {

	public AFile(String _name) {
		super(_name);
		
	}

	@Override
	public void Directories() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String Format(int _ind) {
		
		StringBuilder string = new StringBuilder();	
		
		for(int i = 0; i < _ind; i++) {
			string.append('-');
		}
		
		string.append(" File : " + name + "\n");
		
		return string.toString();
		
	}

}
