package chocolateFactory;

public class ChocolateTester {
	public static void main(String[] args)
	{
		// display content using get methods
		Chocolate ch = new Chocolate();
		System.out.println(ch.getBarCode());
		System.out.println(ch.getName());
		System.out.println(ch.getWeight());
		System.out.println(ch.getCost());
		System.out.println("\n");
		
		//Parameterized constructor and use of display method
		Chocolate ch1 = new Chocolate(102,"Silk", 50, 100.0);
		/*ch.setBarCode(102);
		ch.setName("silk");
		ch.setWeight(50);
		ch.setCost(100.0);*/
		ch1.display();
	}

}
