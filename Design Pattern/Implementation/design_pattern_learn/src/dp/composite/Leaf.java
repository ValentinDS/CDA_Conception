package dp.composite;

public class Leaf extends Component {

	public Leaf(String _name) {
		super(_name);
		
	}

	@Override
	public void operation() {
		StringBuilder stringb = new StringBuilder();
		
		for (int i = 0; i < level; i++) {
			stringb.append("--");
		}
		
		System.out.println(stringb + " Element : " + this.name);
		
	}
	
}
