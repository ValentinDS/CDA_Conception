package dp.composite;

import java.util.ArrayList;
import java.util.List;


public class Composite extends Component{
	
	private List<Component> components;
	
	public Composite(String _name) {
		super(_name);
		components = new ArrayList<Component>();
		
	}
	
	public void addComponent(Component compo) {
		compo.level = this.level + 1;
		components.add(compo);
	}
	
	public void removeComponent(Component compo) {
		components.remove(compo);
	}
	
	public void addComponent(List component) {
		for(Component compo:components) {
			compo.level = this.level + 1;
			components.add(compo);
		}
				
	}
	
	public void removeComponent(List component) {
		components.removeAll(component);
		
	}
	
	public List<Component> getChild(){
		return components;
	}
	
	@Override
	public void operation() {
		StringBuffer tab = new StringBuffer();
		
		for (int i = 0; i < level; i++) {
			tab.append("--");
		}
		System.out.println(tab + " Composite : " + name);
		for (Component c : components) {
			c.operation();
		}
		
		
		
		
		
	}
	
}
