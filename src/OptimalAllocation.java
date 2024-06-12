import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class OptimalAllocation {

	public static void main(String[] args) {
		
		System.out.println("Program Starting");
		
		
		String path="D:\\Freelance\\Java Task\\eclipse-workspace\\eclipse-workspace\\FragmentAllocation\\src\\input.txt";
		System.out.println(path);
		try 
		{
			//Read Input file
			ArrayList<Fragment> fragments=readInput(path);
			
			//Find total Cost
			double totalCost=FindAllocation(fragments);
			
			//display rsults
			DisplayResults(fragments,totalCost);
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
	
	//get replica 
	public static String getReplicaSites(Fragment fragment) {
		
		StringBuilder stringbuilder=new StringBuilder();
		for(int i=0;i<fragment.ProbablitiesOfQuery.length;i++) {
			if(fragment.ProbablitiesOfQuery[i]>0) {
				stringbuilder.append(i+1).append(",");
			}
		}
		return stringbuilder.toString().substring(0,stringbuilder.length()-2);
	}

	//find Optimal Allocation
	public static double FindAllocation(ArrayList<Fragment> fragments) {
		double cost=0;
		//logic to find optimal allocaion for each fragmnet
		return cost;
	}

	//Read Input File
    private static ArrayList<Fragment> readInput(String filepath) throws Exception
    {
		ArrayList<Fragment> fragments=new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(filepath));
		
		//..Parsing Logic
		String line;
		int noOfFragments=0,noOfsites=0;
		
		while((line=reader.readLine()) != null) 
		{
		//Remove Whitespaces
			line=line.trim();
			
			//Comment lines
			if(line.startsWith("#"))
			{
				if(line.startsWith("#Total number of fragment"))
				{
					noOfFragments=Integer.parseInt(line.split(" ")[4]);
				}
				else if(line.startsWith("#Number of sites"))
				{
					noOfsites=Integer.parseInt(line.split(" ")[3]);
				}
			}
		}
		return fragments;
	}
    //display results
	public static void DisplayResults(ArrayList<Fragment> fragments,double totalCost) {
		
		System.out.println("Optimal Allocation:");
	    for (int i = 0; i < fragments.size(); i++) {
	      System.out.println("Fragment " + (i + 1) + ": Site(s) - " + getReplicaSites(fragments.get(i)));
	    }
	    System.out.println("Overall Cost: " + totalCost);
	}

}

