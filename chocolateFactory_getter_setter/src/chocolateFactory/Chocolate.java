package chocolateFactory;

public class Chocolate {
	private int barCode;
	private String name;
	private double weight;
	private double cost;
	
	Chocolate(){
		setBarCode(101);
		setName("Dairymilk");
		setWeight(20);
		setCost(10);
	}
	
	Chocolate( int barCode, String name, double weight, double cost){
		this.setBarCode(barCode);
		this.setName(name);
		this.setWeight(weight);
		this.setCost(cost);
	}
	
	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	void display()
	{
		System.out.println(barCode);
		System.out.println(name);
		System.out.println(weight);
		System.out.println(cost);
		System.out.println("\n");
	}

}
