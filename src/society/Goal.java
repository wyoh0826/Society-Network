package society;

import java.util.ArrayList;

import rdf.Node;
import rdf.Triple;

public class Goal extends Triple{
	
	private static ArrayList<Goal> list = new ArrayList<Goal>();
	int value;
	
	public Goal(Node s,String p, int d, Node o,int v){
		subject = s;
		object = o;
		predicate = p;
		value = v;
		degree = d;
		
		if(checkDegree()){
			list.add(this);
		}
		
	}
	
	public boolean isAcheved(){
		int rd = subject.is(predicate, object);
		
		if( degree > 0 )	return rd >= degree;
		else				return rd <= degree;
	}
	
	public String toString(){
		return super.toString()+" value:"+value;
	}
	
}
