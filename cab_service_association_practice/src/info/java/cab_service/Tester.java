package info.java.cab_service;

class CabServiceProvider{
    //Implement your code here
    private String cabServiceName;
    private int totalCabs;
    
    String getCabserviceName()
    {
        return cabServiceName;
    }
    void setCabServiceName(String cabServiceName)
    {
        this.cabServiceName = cabServiceName;
    }
    
    int getToatlCabs()
    {
        return totalCabs;
    }
    void setTotalCabs(int totalCabs)
    {
        this.totalCabs = totalCabs;
    }
    
    CabServiceProvider(String cabServiceName, int totalCabs )
    {
        this.cabServiceName = cabServiceName;
        this.totalCabs = totalCabs;
    }
    public double calculateRewardPrice(Driver driver)
    {
    	float rewardPrice = 0.0f;
        float averageRating = driver.getAverageRating();
        if(cabServiceName =="Halo")
        {
        	if(averageRating >=4.5 && averageRating <=5)
            {
            	rewardPrice = 10*averageRating;
            }
            else if(averageRating <4.5 && averageRating >=4)
            {
            	rewardPrice = 5*averageRating;
            }
        
        }else if (cabServiceName =="Aber")
        {
        	if(averageRating >=4.5 && averageRating <=5)
            {
            	rewardPrice = 8*averageRating;
            }
            else if(averageRating <4.5 && averageRating >=4)
            {
            	rewardPrice = 3*averageRating;
            }
        }
        return rewardPrice;
    }
}

class Driver {
	
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public void setDriverName(String driverName){
		this.driverName=driverName;
	}
	
	public float getAverageRating(){
		return this.averageRating;
	}
	
	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}

class Tester {
	
	public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);
	    //Association exaple
		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		Driver driver4 = new Driver("Shree",5f);
		Driver driver5 = new Driver("Shailesh",4.8f);
		Driver driver6 = new Driver("Nayan",4f);
		Driver driver7 = new Driver("Monika",4.6f);
		
		Driver[] driversList = { driver1, driver2, driver3, driver4, driver5, driver6, driver7 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!\n");
		}
		
		//Create more objects of CabServiceProvider and Driver classes for testing your code
		
	}
}
