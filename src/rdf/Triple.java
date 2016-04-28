package rdf;

import java.util.ArrayList;

public class Triple {

	// subject -- predicate --> object
	
	private static ArrayList<Triple> list = new ArrayList<Triple>();
	
	protected Node subject;
	protected Node object;

	protected String predicate;
	
	protected int degree = 1;

	public Triple(){
		
	}
	public Triple(Node s,String p, int d, Node o){
		degree = d;
		
		subject = s;
		object = o;
		predicate = p;
		
		if(checkDegree()){
			s.addSubjectOf(this);
			o.addObjectOf(this);
			list.add(this);
		}
	}
	
	
	/* method */
	
	public void remove(){
		subject.getSubjectOf().remove(this);
		object.getObjectOf().remove(this);
		list.remove(this);
	}
	
	public boolean checkDegree(){
		if( degree > PIS.getInstance().getMaxDegree(predicate) ){
			System.out.println("error!: Triple <"+ toString() +"> over the MAX Limit.");
			return false;
		}
		if( degree < PIS.getInstance().getMinDegree(predicate) ){
			System.out.println("error!: Triple <"+ toString() +"> over the min Limit.");
			return false;
		}
		
		return true;
	}
	
	public String toString(){
		return subject.getName() + " " + predicate +"["+degree+"] "+ object.getName();
		
	}
	/* accessor */
	
	public Node getSubject() {
		return subject;
	}

	public Node getObject() {
		return object;
	}

	public String getPredicate() {
		return predicate;
	}

	public int getDegree() {
		return degree;
	}



}
