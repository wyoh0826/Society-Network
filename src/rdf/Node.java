package rdf;

import java.util.ArrayList;

public class Node {

	protected ArrayList<Triple> subjectOf = new ArrayList<Triple>();
	protected ArrayList<Triple> objectOf = new ArrayList<Triple>();
	
	private String name;
	
	public Node(String name){
		this.name = name;
	}
	
	
	
	
	
	

	/* method */
	public int is(String predicate, Node object){
		for(Triple t: subjectOf){
			if( t.getPredicate().equals(predicate) && t.getSubject().equals(object)){
				return t.getDegree();
			}
		}
		return 0;
	}
	public boolean addSubjectOf(Triple p){
		return subjectOf.add(p);
	}
	
	public boolean addObjectOf(Triple p){
		return objectOf.add(p);
	}
	
	/* accessor */
	
	public ArrayList<Triple> getSubjectOf() {
		return subjectOf;
	}
	public ArrayList<Triple> getObjectOf() {
		return objectOf;
	}
	
	public String getName(){
		return name;
	}
	
	
	
}
