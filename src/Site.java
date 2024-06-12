public class Site {
	
	//Array to store expected probablities of this site that query to each fragment
	public double[] ProbablitiesOfQuery;
	
	//Array to store expected probablities of this site that update each fragment
	public double[] ProbablitiesOfUpdate;
		
	//Constructor
	public Site(int totalfragments) 
	{
		this.ProbablitiesOfQuery=new double[totalfragments];
		this.ProbablitiesOfUpdate=new double[totalfragments];
	}
	
	//Getters and setters 
	public double[] getQueryProbablities() 
	{
		return ProbablitiesOfQuery;
	}
	public double[] getUpdateProbablities() 
	{
		return ProbablitiesOfUpdate;
    }
		 
}
