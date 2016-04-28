package society;

import java.util.ArrayList;

import rdf.Node;
import rdf.Triple;

public class Person extends Node{
	
	public Person(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	protected ArrayList<Goal> goals = new ArrayList<Goal>();
	
}
