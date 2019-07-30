package GraphGeneratorsDemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

import org.jgrapht.Graph;
import org.jgrapht.event.VertexSetListener;
import org.jgrapht.generate.*;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.io.CSVExporter;
import org.jgrapht.io.ExportException;
import org.jgrapht.io.GraphExporter;
import org.jgrapht.io.GraphMLExporter;
import org.jgrapht.io.MatrixExporter;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.util.SupplierUtil;

import com.sun.javafx.geom.Edge;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import GraphGeneratorsDemo.BarabasiAlbertGraphMLDemo.CustomVertex;
import attacks.OriginalWalkBasedAttackSimulator;
//import sun.launcher.resources.launcher;
import sun.security.provider.certpath.Vertex;


public class BarabasiAlbertDemo {
	static final int m0=10;
	static final int m=2;
	static final int n=20;
	static final Random seed = new Random();
	
	 public static void main(String[] args) throws FileNotFoundException, ExportException
	    {
		 
	        // Create the VertexFactory so the generator can create vertices
	        Supplier<String> vSupplier = new Supplier<String>()
	        {
	            private int id = 0;

	            @Override
	            public String get()
	            {
	                return "" + id++;
	            }
	        };

	        //@example:generate:begin
	        // Create the graph object
	        Graph<String, DefaultEdge> barabasiAlbertGraph =
	            new SimpleGraph<>(vSupplier, SupplierUtil.createDefaultEdgeSupplier(), false);

	        BarabasiAlbertGraphGenerator<String, DefaultEdge> BAGenerator =
    	            new BarabasiAlbertGraphGenerator<>(m0, m, n, 200);
        	
	        BAGenerator.generateGraph(barabasiAlbertGraph);
	        
	        PrintStream o = new PrintStream(new File("barabasiBeforeAddingEdges.txt"));
	        System.setOut(o);
	        // Print out the graph to be sure it's really complete
//	        Iterator<String> iter = new DepthFirstIterator<>(barabasiAlbertGraph);
//	        while (iter.hasNext()) {
//	            String vertex = iter.next();
//	            System.out.println(	
//	                "Vertex " + vertex + " is connected to: "
//	                    + barabasiAlbertGraph.edgesOf(vertex).toString());
//	        }
	        
	        Set<String> vertexSet = barabasiAlbertGraph.vertexSet();
	        ArrayList<String> vertexList = new ArrayList<String>();
	        vertexList.addAll(vertexSet);
	        for(int index = 0; index < vertexList.size(); index++) {
	        	Set <DefaultEdge> la =  barabasiAlbertGraph.edgesOf(vertexList.get(index));
	        	//ArrayList<DefaultEdge> hamza = new ArrayList<DefaultEdge>();
	        	
	        	for (DefaultEdge defaultEdge : la) {
	        		//if(!checkEqual(defaultEdge, hamza)) {
	        			//hamza.add(defaultEdge);
	        		
	        			System.out.println(defaultEdge.toString());
	        		}
	        
	        		//System.out.println(defaultEdge.toString());
	        	}
	        	
	        	
//		      	System.out.println(	
//			                "Vertex " + vertexList.get(index) + " is connected to: "
//			         
//			                 +  barabasiAlbertGraph.edgesOf(vertexList.get(index)).toString());
	        
	       
	        
	       
	       
	        HelperClass.sequenceGenerator(barabasiAlbertGraph, 25);
	    }
	 
/*
 * public static boolean checkEqual(DefaultEdge old,ArrayList<DefaultEdge> ne) {
 * if(ne == null) return false; for(DefaultEdge newVal : ne) {
 * if(old.toString().equalsIgnoreCase(newVal.toString())) { return true; } }
 * return false; }
 */
}
