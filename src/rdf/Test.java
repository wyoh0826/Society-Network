package rdf;

public class Test {

	public static void main(String[] args){
		
		Node taro = new Node("taro");
		Node hanako = new Node("hanako");
		
		Triple t = new Triple(taro, "love",3, hanako);
		System.out.println(t);
	}
}
