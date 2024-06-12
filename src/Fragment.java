
public class Fragment {
	
	//Expected Cost Of Query
	public double CostOfQuery;
	//Expected Cost Of Update
	public double CostOfUpdate;
	//Array to store expected probablities of each site that query to this fragment
	public double[] ProbablitiesOfQuery;
	//Array to store expected probablities of each site that update this fragment
	public double[] ProbablitiesOfUpdate;
	
	//Constructor
	public Fragment(double costOfQuery,double costOfUpdate,int noOfSites) 
	{
		this.CostOfQuery=costOfQuery;
		this.CostOfUpdate=costOfUpdate;
		this.ProbablitiesOfQuery=new double[noOfSites];
		this.ProbablitiesOfUpdate=new double[noOfSites];
	}
	
	//Getters and setters for cost and update
	 public double getQueryCost() 
	 {
		    return CostOfQuery;
     }
	 public double getUpdateCost() 
	 {
		    return CostOfUpdate;
     }
	 
}
