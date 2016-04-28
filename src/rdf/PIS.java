package rdf;

import java.util.ArrayList;

public class PIS{
	/* Predicate Interpretation System */
	
	static private PIS instance = null;
	
	
	
	/* method */
	
	public boolean isExclusive(String p0, String p1){
		return false;
	}

	public int getValue(String p0){
		return 0;
	}
	public int getMaxDegree(String p0){
		return 0;
	}
	public int getMinDegree(String p0){
		return 0;
	}
	
	public ArrayList<String> getPremises(String p){
		ArrayList<String> ans = new ArrayList<String>();
		
		return ans;
	}
	
	public boolean isDegreed(String p){
		return false;
	}
	
	/* accessor */
	
	static public PIS getInstance(){
		if( instance == null)
			instance = new PIS();
		
		return instance;
	}
	
	
}
