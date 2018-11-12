import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		//Implementation of example DFA
		Vertex a = new Vertex();
		Vertex b = new Vertex();
		Vertex c = new Vertex();
		Vertex d = new Vertex();
		Vertex e = new Vertex();
		
		ArrayList<Vertex> acceptingStates = new ArrayList<Vertex>();
		acceptingStates.add(d);
		acceptingStates.add(e);
		
		Edge e1 = new Edge('0', a, b);
		Edge e2 = new Edge('1', a, c);
		
		Graph graph = new Graph(acceptingStates, a);
	}
}
