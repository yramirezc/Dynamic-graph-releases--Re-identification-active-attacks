package attacks;

import java.util.List;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

public class SnapshotInformation {
	
	private SimpleGraph<String, DefaultEdge> graph;
	private List<String> victimList;
	private List<String[]> candidateAttackersList;
	
	public SnapshotInformation(SimpleGraph<String, DefaultEdge> graph, List<String> victimList, List<String[]> candidateAttackersList) {
		this.graph = graph;
		this.victimList = victimList;
		this.candidateAttackersList = candidateAttackersList;
	}

	public SimpleGraph<String, DefaultEdge> getGraph() {
		return graph;
	}

	public void setGraph(SimpleGraph<String, DefaultEdge> graph) {
		this.graph = graph;
	}

	public List<String> getVictimList() {
		return victimList;
	}

	public void setVictimList(List<String> victimList) {
		this.victimList = victimList;
	}

	public List<String[]> getCandidateAttackersList() {
		return candidateAttackersList;
	}

	public void setCandidateAttackersList(List<String[]> candidateAttackersList) {
		this.candidateAttackersList = candidateAttackersList;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return graph + " - " + victimList + " - " + candidateAttackersList;
	}
}
