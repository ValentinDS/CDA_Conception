package design_pattern_learn;

import dp.composite.Composite;
import dp.composite.Leaf;

public class CompositeTest {

	public static void main(String[] args) {
		
		Composite componentOne = new Composite("LePremierComposite");
		Composite componentTwo = new Composite("LeDeuxiemeComposite");
		Leaf fileOne = new Leaf("LeFichier");
		
		
		componentOne.addComponent(componentTwo);
		componentOne.addComponent(new Leaf("LeFichierSecret"));
		componentTwo.addComponent(fileOne);
		
		componentOne.operation();
		
	}

}
