package enterprise.sequence.attacks.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import enterprise.sequence.attacks.SybilAttackSimulatorMe;
import org.jgrapht.Graph;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import com.sun.javafx.geom.AreaOp.AddOp;

import attacks.OriginalWalkBasedAttackSimulator;
import enterprise.sequence.attacks.SequenceOriginalWalkBasedAttackSimulator;
import enterprise.sequence.attacks.SequenceRobustAttackSimulator;
import enterprise.sequence.generators.BarabasiAlbertSequenceGenerator;

public class SequenceOriginalWalkBasedAttackDemo {

    private static ArrayList<Double> originalWalkedBased_initial = new ArrayList<>();

    private static ArrayList<Double>originalWalkedBased_1 = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_2 = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_3 = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_4 = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_5 = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_6 = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_7 = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_8 = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_9 = new ArrayList<>();

    private static ArrayList<Double>hybrid_1 = new ArrayList<>();
    private static ArrayList<Double>hybrid_2 = new ArrayList<>();
    private static ArrayList<Double>hybrid_3 = new ArrayList<>();
    private static ArrayList<Double>hybrid_4 = new ArrayList<>();
    private static ArrayList<Double>hybrid_5 = new ArrayList<>();
    private static ArrayList<Double>hybrid_6 = new ArrayList<>();
    private static ArrayList<Double>hybrid_7 = new ArrayList<>();
    private static ArrayList<Double>hybrid_8 = new ArrayList<>();
    private static ArrayList<Double>hybrid_9 = new ArrayList<>();

    private static ArrayList<Double>robust_1 = new ArrayList<>();
    private static ArrayList<Double>robust_2 = new ArrayList<>();
    private static ArrayList<Double>robust_3 = new ArrayList<>();
    private static ArrayList<Double>robust_4 = new ArrayList<>();
    private static ArrayList<Double>robust_5 = new ArrayList<>();
    private static ArrayList<Double>robust_6 = new ArrayList<>();
    private static ArrayList<Double>robust_7 = new ArrayList<>();
    private static ArrayList<Double>robust_8 = new ArrayList<>();
    private static ArrayList<Double>robust_9 = new ArrayList<>();

    private static ArrayList<Double>originalWalkedBased_1_a = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_2_a = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_3_a = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_4_a = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_5_a = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_6_a = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_7_a = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_8_a = new ArrayList<>();
    private static ArrayList<Double>originalWalkedBased_9_a = new ArrayList<>();

    private static ArrayList<Double>hybrid_1_a = new ArrayList<>();
    private static ArrayList<Double>hybrid_2_a = new ArrayList<>();
    private static ArrayList<Double>hybrid_3_a = new ArrayList<>();
    private static ArrayList<Double>hybrid_4_a = new ArrayList<>();
    private static ArrayList<Double>hybrid_5_a = new ArrayList<>();
    private static ArrayList<Double>hybrid_6_a = new ArrayList<>();
    private static ArrayList<Double>hybrid_7_a = new ArrayList<>();
    private static ArrayList<Double>hybrid_8_a = new ArrayList<>();
    private static ArrayList<Double>hybrid_9_a = new ArrayList<>();

    private static ArrayList<Double>robust_1_a = new ArrayList<>();
    private static ArrayList<Double>robust_2_a = new ArrayList<>();
    private static ArrayList<Double>robust_3_a = new ArrayList<>();
    private static ArrayList<Double>robust_4_a = new ArrayList<>();
    private static ArrayList<Double>robust_5_a = new ArrayList<>();
    private static ArrayList<Double>robust_6_a = new ArrayList<>();
    private static ArrayList<Double>robust_7_a = new ArrayList<>();
    private static ArrayList<Double>robust_8_a = new ArrayList<>();
    private static ArrayList<Double>robust_9_a = new ArrayList<>();
    private static ArrayList<String> frequency_values = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        //All attacks with graphs of 100 nodes, edges per node 4, 20 snaspshots, 5% addition after snapshots, and 0.5 noise %
        //executeExperiment(1000,10,4,100,25,50,5.0,0.5,1, 5);
        //executeExperiment(1000,10,4,100,25,20,5.0,0.5,2, 5);
        //executeExperiment(1000,10,4,100,25,20,5.0,0.5,3, 5);
        //executeExperiment(1000,10,4,100,25,20,5.0,0.5,4, 5);
       // executeExperiment(1000,10,4,100,25,20,5.0,0.5,5, 5);
        //All attacks with graphs of 200 nodes, edges per node 4, 20 snaspshots, 5% addition after snapshots, and 0.5 noise %
        //executeExperiment(1000,10,4,200,50,20,5.0,0.5,1, 5);
        //executeExperiment(1000,10,4,200,50,20,5.0,0.5,2, 5);
       // executeExperiment(1000,10,4,200,50,20,5.0,0.5,3, 5);
        //executeExperiment(1000,10,4,200,50,20,5.0,0.5,4, 5);
        //executeExperiment(1000,10,4,200,50,20,5.0,0.5,5, 5);
        //All attacks with graphs of 500 nodes, edges per node 4, 20 snaspshots, 5% addition after snapshots, and 0.5 noise %
        //executeExperiment(1000,10,4,200,125,20,5.0,0.5,1, 5);
        //executeExperiment(1000,10,4,200,125,20,5.0,0.5,2, 5);
        //executeExperiment(1000,10,4,200,125,20,5.0,0.5,3, 5);
        //executeExperiment(1000,10,4,200,125,20,5.0,0.5,4, 5);
        //executeExperiment(1000,10,4,200,125,20,5.0,0.5,5, 5);

        //All attacks with graphs of 100 nodes, edges per node 12, 20 snaspshots, 10% addition after snapshots, and 1.0 noise %
        //executeExperiment(1000,15,12,100,25,20,10.0,1.0,1, 5);
        //executeExperiment(1000,15,12,100,25,20,10.0,1.0,2, 5);
        //executeExperiment(1000,15,12,100,25,20,10.0,1.0,3, 5);
//  executeExperiment(1000,15,12,100,25,20,10.0,1.0,4, 5);
        //executeExperiment(1000,15,12,100,25,20,10.0,1.0,5, 5);
//        //All attacks with graphs of 200 nodes, edges per node 12, 20 snaspshots, 10% addition after snapshots, and 1.0 noise %
       // executeExperiment(1000,15,12,200,50,20,10.0,1.0,1, 5);
//        executeExperiment(1000,15,12,200,50,20,10.0,1.0,2, 5);
//       executeExperiment(1000,15,12,200,50,20,10.0,1.0,3, 5);
//       executeExperiment(1000,15,12,200,50,20,10.0,1.0,4, 5);
  //     executeExperiment(1000,15,12,200,50,20,10.0,1.0,5, 5);
//        //All attacks with graphs of 500 nodes, edges per node 12, 20 snaspshots, 10% addition after snapshots, and 1.0 noise %
//        executeExperiment(1000,15,12,500,125,20,10.0,1.0,1, 5);
//       executeExperiment(1000,15,12,500,125,20,10.0,1.0,2, 5);
//       executeExperiment(1000,15,12,500,125,20,10.0,1.0,3, 5);
//      executeExperiment(1000,15,12,500,125,20,10.0,1.0,4, 5);executeExperiment(1000,15,12,500,125,20,10.0,1.0,5, 5);



    }

    private static void executeExperiment(int numberOfGraphs, int initialNodes, int edgesPerNode, int finalNodes, int initialVictimCount,
                                          int snapshotsPerGraph, double percentageOfAdditions, double percentageOfNoise, int attackConfiguration, int frequencyOfAverage) throws IOException {

        // Keep in mind that 'snapshotsPerGraph' should be divisible by 'frequencyOfAverage'

        String fileName = "results/Graph_" + finalNodes + "vertices_"+ edgesPerNode +"edgesPerNode_Noise_" + percentageOfNoise +"_InitialVictimNo_ " +initialVictimCount +"_%AdditionPerSnapshot_" + percentageOfAdditions+ "%_attack_Configuration_" + attackConfiguration + ".txt";
        FileWriter fw = new FileWriter(fileName);

        for (int i = 1; i <= numberOfGraphs; i++) { // 50 is number of graphsar
            // Clear lists
            clearAllLists();


            BarabasiAlbertSequenceGenerator<String, DefaultEdge> sequenceGenerator = new BarabasiAlbertSequenceGenerator<>(initialNodes, edgesPerNode, finalNodes);
            sequenceGenerator.initialize(1);
            SimpleGraph<String, DefaultEdge> noisyGraph;

            SequenceOriginalWalkBasedAttackSimulator attackSimulator = new SequenceOriginalWalkBasedAttackSimulator();

            attackSimulator.createInitialAttackerSubgraph(initialVictimCount);

            double successProbability_originalwalkbased_inital =
                    attackSimulator.currentSuccessProbability_attack0(BarabasiAlbertSequenceGenerator.getGraph(), BarabasiAlbertSequenceGenerator.getGraph(),
                            false, false);

            originalWalkedBased_initial.add(successProbability_originalwalkbased_inital);

            double successProbability_originalwalkbased;
            double successProbability_hybrid;
            double successProbability_robust;


            for (int index = 0; index < snapshotsPerGraph; index++) {

                switch (attackConfiguration) {
                    case 1:// Attack Configuration with random victims and logN sybils
                        attackSimulator.evolveAttackerSubgraph(0, 0, 2);
                        attackSimulator.evolveAttackerSubgraph(0, 0, 4);
                        sequenceGenerator.makeSnapshot(percentageOfAdditions);
                        noisyGraph = sequenceGenerator.getNoisyGraph(percentageOfNoise, BarabasiAlbertSequenceGenerator.getGraph());

                        successProbability_originalwalkbased = attackSimulator.currentSuccessProbability_attack0(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, false);
                        successProbability_hybrid = attackSimulator.currentSuccessProbability_attack1(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, false);
                        successProbability_robust = attackSimulator.currentSuccessProbability_attack2(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, false, false);
                        originalWalkedBased_1.add(successProbability_originalwalkbased);
                        hybrid_1.add(successProbability_hybrid);
                        robust_1.add(successProbability_robust);
                        originalWalkedBased_1_a.add(successProbability_originalwalkbased);
                        hybrid_1_a.add(successProbability_hybrid);
                        robust_1_a.add(successProbability_robust);

                        successProbability_originalwalkbased = attackSimulator.currentSuccessProbability_attack0(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, false, false);
                        successProbability_hybrid = attackSimulator.currentSuccessProbability_attack1(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, false, false);
                        successProbability_robust = attackSimulator.currentSuccessProbability_attack2(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, false, false);
                        originalWalkedBased_2.add(successProbability_originalwalkbased);
                        hybrid_2.add(successProbability_hybrid);
                        robust_2.add(successProbability_robust);
                        originalWalkedBased_2_a.add(successProbability_originalwalkbased);
                        hybrid_2_a.add(successProbability_hybrid);
                        robust_2_a.add(successProbability_robust);

                        if (originalWalkedBased_1.size() % frequencyOfAverage == 0 && hybrid_1.size() % frequencyOfAverage == 0 && robust_1.size() % frequencyOfAverage == 0) {
                            String avg5snapshotsOriginal = "OriginalWalkedBased with intersection - Average after " + originalWalkedBased_1.size() + " snapshots is: " + calculateAverage(originalWalkedBased_1);
                            frequency_values.add(avg5snapshotsOriginal);

                            String avg5snapshotsOriginalNoIntersaction = "OriginalWalkedBased without intersection - Average after each " + originalWalkedBased_1.size() + " snapshot is: " + calculateAverage(originalWalkedBased_2);
                            frequency_values.add(avg5snapshotsOriginalNoIntersaction);

                            String avg5snapshotsHybridIntersect = "Hybrid attack with intersection - Average after " + hybrid_1.size() + " snapshots is: " + calculateAverage(hybrid_1);
                            frequency_values.add(avg5snapshotsHybridIntersect);

                            String avg5snapshotsHybrid = "Hybrid attack without intersection - Average after " + hybrid_2.size() + " snapshot is: " + calculateAverage(hybrid_2);
                            frequency_values.add(avg5snapshotsHybrid);

                            String avg5snapshotsRobustIntersect = "Robust attack with intersection - Average after each " + robust_1.size() + " snapshots is: " + calculateAverage(robust_1);
                            frequency_values.add(avg5snapshotsRobustIntersect);

                            String avg5snapshotsRobust = "Robust attack without intersection - Average after each " + robust_2.size() + " snapshots is: " + calculateAverage(robust_2);
                            frequency_values.add(avg5snapshotsRobust);
                        }
                        break;
                    case 2: //Attack Configuration with random victims and random sybils
                        attackSimulator.evolveAttackerSubgraph(0, 0, 2);
                        attackSimulator.evolveAttackerSubgraph(0, 0, 1);
                        sequenceGenerator.makeSnapshot(percentageOfAdditions);
                        noisyGraph = sequenceGenerator.getNoisyGraph(percentageOfNoise, BarabasiAlbertSequenceGenerator.getGraph());
                        successProbability_originalwalkbased = attackSimulator.currentSuccessProbability_attack0(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, false);
                        successProbability_hybrid = attackSimulator.currentSuccessProbability_attack1(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, false);
                        successProbability_robust = attackSimulator.currentSuccessProbability_attack2(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, true, false);
                        originalWalkedBased_3.add(successProbability_originalwalkbased);
                        hybrid_3.add(successProbability_hybrid);
                        robust_3.add(successProbability_robust);
                        originalWalkedBased_3_a.add(successProbability_originalwalkbased);
                        hybrid_3_a.add(successProbability_hybrid);
                        robust_3_a.add(successProbability_robust);

                        successProbability_originalwalkbased = attackSimulator.currentSuccessProbability_attack0(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, false, false);
                        successProbability_hybrid = attackSimulator.currentSuccessProbability_attack1(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, false, false);
                        successProbability_robust = attackSimulator.currentSuccessProbability_attack2(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, false, false);
                        originalWalkedBased_4.add(successProbability_originalwalkbased);
                        hybrid_4.add(successProbability_hybrid);
                        robust_4.add(successProbability_robust);
                        originalWalkedBased_4_a.add(successProbability_originalwalkbased);
                        hybrid_4_a.add(successProbability_hybrid);
                        robust_4_a.add(successProbability_robust);

                        if (originalWalkedBased_3.size() % frequencyOfAverage == 0 && hybrid_3.size() % frequencyOfAverage == 0 && robust_3.size() % frequencyOfAverage == 0) {
                            String avg5snapshotsOriginal = "OriginalWalkedBased with intersection - Average after " + originalWalkedBased_3.size() + " snapshots is: " + calculateAverage(originalWalkedBased_3);
                            frequency_values.add(avg5snapshotsOriginal);

                            String avg5snapshotsOriginalNoIntersaction = "OriginalWalkedBased without intersection - Average after each " + originalWalkedBased_4.size() + " snapshot is: " + calculateAverage(originalWalkedBased_4);
                            frequency_values.add(avg5snapshotsOriginalNoIntersaction);

                            String avg5snapshotsHybridIntersect = "Hybrid attack with intersection - Average after " + hybrid_3.size() + " snapshots is: " + calculateAverage(hybrid_3);
                            frequency_values.add(avg5snapshotsHybridIntersect);

                            String avg5snapshotsHybrid = "Hybrid attack without intersection - Average after " + hybrid_4.size() + " snapshot is: " + calculateAverage(hybrid_4);
                            frequency_values.add(avg5snapshotsHybrid);

                            String avg5snapshotsRobustIntersect = "Robust attack with intersection - Average after each " + robust_3.size() + " snapshots is: " + calculateAverage(robust_3);
                            frequency_values.add(avg5snapshotsRobustIntersect);

                            String avg5snapshotsRobust = "Robust attack without intersection - Average after each " + robust_4.size() + " snapshots is: " + calculateAverage(robust_4);
                            frequency_values.add(avg5snapshotsRobust);
                        }
                        break;
                    case 3://Attack Configuration with hardest to find victim and logN sybils
                        attackSimulator.evolveAttackerSubgraph(0, 0, 4);
                        sequenceGenerator.makeSnapshot(percentageOfAdditions);
                        noisyGraph = sequenceGenerator.getNoisyGraph(percentageOfNoise, BarabasiAlbertSequenceGenerator.getGraph());
                        successProbability_originalwalkbased = attackSimulator.currentSuccessProbability_attack0(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, true);
                        successProbability_hybrid = attackSimulator.currentSuccessProbability_attack1(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, true);
                        successProbability_robust = attackSimulator.currentSuccessProbability_attack2(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, true, true);
                        originalWalkedBased_5.add(successProbability_originalwalkbased);
                        hybrid_5.add(successProbability_hybrid);
                        robust_5.add(successProbability_robust);
                        originalWalkedBased_5_a.add(successProbability_originalwalkbased);
                        hybrid_5_a.add(successProbability_hybrid);
                        robust_5_a.add(successProbability_robust);

                        successProbability_originalwalkbased = attackSimulator.currentSuccessProbability_attack0(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, false, true);
                        successProbability_hybrid = attackSimulator.currentSuccessProbability_attack1(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, false, true);
                        successProbability_robust = attackSimulator.currentSuccessProbability_attack2(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, false, true);
                        originalWalkedBased_6.add(successProbability_originalwalkbased);
                        hybrid_6.add(successProbability_hybrid);
                        robust_6.add(successProbability_robust);
                        originalWalkedBased_6_a.add(successProbability_originalwalkbased);
                        hybrid_6_a.add(successProbability_hybrid);
                        robust_6_a.add(successProbability_robust);

                        if (originalWalkedBased_5.size() % frequencyOfAverage == 0 && hybrid_5.size() % frequencyOfAverage == 0 && robust_5.size() % frequencyOfAverage == 0) {
                            String avg5snapshotsOriginal = "OriginalWalkedBased with intersection - Average after " + originalWalkedBased_5.size() + " snapshots is: " + calculateAverage(originalWalkedBased_5);
                            frequency_values.add(avg5snapshotsOriginal);

                            String avg5snapshotsOriginalNoIntersaction = "OriginalWalkedBased without intersection - Average after each " + originalWalkedBased_5.size() + " snapshot is: " + calculateAverage(originalWalkedBased_5);
                            frequency_values.add(avg5snapshotsOriginalNoIntersaction);

                            String avg5snapshotsHybridIntersect = "Hybrid attack with intersection - Average after each  " + hybrid_5.size() + " snapshot is: " + calculateAverage(hybrid_5);
                            frequency_values.add(avg5snapshotsHybridIntersect);

                            String avg5snapshotsHybrid = "Hybrid attack without intersection - Average after each " + hybrid_6.size() + " snapshot is: " + calculateAverage(hybrid_6);
                            frequency_values.add(avg5snapshotsHybrid);

                            String avg5snapshotsRobustIntersect = "Robust attack with intersection - Average after each " + robust_5.size() + " snapshot is: " + calculateAverage(robust_5);
                            frequency_values.add(avg5snapshotsRobustIntersect);

                            String avg5snapshotsRobust = "Robust attack without intersection - Average after each" + robust_6.size() + " snapshot is: " + calculateAverage(robust_6);
                            frequency_values.add(avg5snapshotsRobust);
                        }
                        break;
                    case 4://Attack Configuration with hardest to find victim and random sybils
                        attackSimulator.evolveAttackerSubgraph(0, 0, 1);
                        sequenceGenerator.makeSnapshot(percentageOfAdditions);
                        noisyGraph = sequenceGenerator.getNoisyGraph(percentageOfNoise, BarabasiAlbertSequenceGenerator.getGraph());
                        successProbability_originalwalkbased = attackSimulator.currentSuccessProbability_attack0(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, true);
                        successProbability_hybrid = attackSimulator.currentSuccessProbability_attack1(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, true);
                        successProbability_robust = attackSimulator.currentSuccessProbability_attack2(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, true, true);
                        originalWalkedBased_7.add(successProbability_originalwalkbased);
                        hybrid_7.add(successProbability_hybrid);
                        robust_7.add(successProbability_robust);
                        originalWalkedBased_7_a.add(successProbability_originalwalkbased);
                        hybrid_7_a.add(successProbability_hybrid);
                        robust_7_a.add(successProbability_robust);

                        successProbability_originalwalkbased = attackSimulator.currentSuccessProbability_attack0(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, false, true);
                        successProbability_hybrid = attackSimulator.currentSuccessProbability_attack1(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, false, true);
                        successProbability_robust = attackSimulator.currentSuccessProbability_attack2(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, false, true);
                        originalWalkedBased_8.add(successProbability_originalwalkbased);
                        hybrid_8.add(successProbability_hybrid);
                        robust_8.add(successProbability_robust);
                        originalWalkedBased_8_a.add(successProbability_originalwalkbased);
                        hybrid_8_a.add(successProbability_hybrid);
                        robust_8_a.add(successProbability_robust);


                        if (originalWalkedBased_7.size() % frequencyOfAverage == 0 && hybrid_7.size() % frequencyOfAverage == 0 && robust_7.size() % frequencyOfAverage == 0) {
                            String avg5snapshotsOriginal = "OriginalWalkedBased with intersection - Average after " + originalWalkedBased_7.size() + " snapshots is: " + calculateAverage(originalWalkedBased_7);
                            frequency_values.add(avg5snapshotsOriginal);

                            String avg5snapshotsOriginalNoIntersaction = "OriginalWalkedBased without intersection - Average after each " + originalWalkedBased_8.size() + " snapshot is: " + calculateAverage(originalWalkedBased_8);
                            frequency_values.add(avg5snapshotsOriginalNoIntersaction);

                            String avg5snapshotsHybridIntersect = "Hybrid attack with intersection - Average after each  " + hybrid_7.size() + " snapshot is: " + calculateAverage(hybrid_7);
                            frequency_values.add(avg5snapshotsHybridIntersect);

                            String avg5snapshotsHybrid = "Hybrid attack without intersection - Average after each " + hybrid_8.size() + " snapshot is: " + calculateAverage(hybrid_8);
                            frequency_values.add(avg5snapshotsHybrid);

                            String avg5snapshotsRobustIntersect = "Robust attack with intersection - Average after each " + robust_7.size() + " snapshot is: " + calculateAverage(robust_7);
                            frequency_values.add(avg5snapshotsRobustIntersect);

                            String avg5snapshotsRobust = "Robust attack without intersection - Average after each" + robust_8.size() + " snapshot is: " + calculateAverage(robust_8);
                            frequency_values.add(avg5snapshotsRobust);
                        }
                        break;

                    case 5: //Attack Configuration without evolve methods, running attack on a noisy graph
                        sequenceGenerator.makeSnapshot(percentageOfAdditions);
                        noisyGraph = sequenceGenerator.getNoisyGraph(percentageOfNoise, BarabasiAlbertSequenceGenerator.getGraph());
                        successProbability_originalwalkbased = attackSimulator.currentSuccessProbability_attack0(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, false, false);
                        successProbability_hybrid = attackSimulator.currentSuccessProbability_attack1(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, false, false);
                        successProbability_robust = attackSimulator.currentSuccessProbability_attack2(BarabasiAlbertSequenceGenerator.getGraph(), noisyGraph, true, false, false);
                        originalWalkedBased_9.add(successProbability_originalwalkbased);
                        hybrid_9.add(successProbability_hybrid);
                        robust_9.add(successProbability_robust);
                        originalWalkedBased_9_a.add(successProbability_originalwalkbased);
                        hybrid_9_a.add(successProbability_hybrid);
                        robust_9_a.add(successProbability_robust);


                        if (originalWalkedBased_9.size() % frequencyOfAverage == 0 && hybrid_9.size() % frequencyOfAverage == 0 && robust_9.size() % frequencyOfAverage == 0) {
                            String avg5snapshotsOriginal = "OriginalWalkedBased attack without evolve methods - Average after " + originalWalkedBased_9.size() + " snapshots is: " + calculateAverage(originalWalkedBased_9);
                            frequency_values.add(avg5snapshotsOriginal);


                            String avg5snapshotsHybridIntersect = "Hybrid attack without evolve methods - Average after each  " + hybrid_9.size() + " snapshot is: " + calculateAverage(hybrid_9);
                            frequency_values.add(avg5snapshotsHybridIntersect);


                            String avg5snapshotsRobustIntersect = "Robust attack without evolve methods - Average after each " + robust_9.size() + " snapshot is: " + calculateAverage(robust_9);
                            frequency_values.add(avg5snapshotsRobustIntersect);

                        }
                        break;


                }
            }



            switch (attackConfiguration) {
                case 1:
                    try {
                        int count=1;
                        int count1=1;
                        int count2=1;
                        int count3=1;
                        int count4=1;
                        int count5=1;
                        fw.write("Graph no." + i + "_Random victims + log N sybil's");
                        fw.write(System.lineSeparator());

                        for (double value : originalWalkedBased_1) {
                            fw.write("Probability of Original Walk Based Attack using intersection and adding random victims and log n sybils after " + count + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count++;
                        }
                        fw.write("=====================================================");

                        for (double value : originalWalkedBased_2) {

                            fw.write("Probability of Original Walk Based Attack after adding random victims and log n sybils after " + count1 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count1++;
                        }
                        fw.write("=====================================================");

                        for (double value : hybrid_1) {

                            fw.write("Probability of Original Walk Based Attack after adding random victims and log n sybils after " + count2 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count2++;
                        }
                        fw.write("=====================================================");

                        for (double value : hybrid_2) {

                            fw.write("Probability of Hybrid Attack after after adding random victims and log n sybils after " + count3+ " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count3++;

                        }
                        fw.write("=====================================================");

                        for (double value : robust_1) {

                            fw.write("Probability of Robust Attack after using intersection and adding random victims and log n sybils after " + count4 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count4++;

                        }
                        fw.write("=====================================================");

                        for (double value : robust_2) {
                            fw.write("Probability of Robust Attack  after adding random victims and log n sybils after " + count5 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count5++;
                        }
                        fw.write("=====================================================");
                        fw.write(System.lineSeparator());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    try {
                        int count=1;
                        int count1=1;
                        int count2=1;
                        int count3=1;
                        int count4=1;
                        int count5=1;
                        fw.write("Graph no." + i + "_Random number of victims + random number of sybil's");
                        fw.write(System.lineSeparator());

                            for (double value : originalWalkedBased_3) {
                                fw.write("Probability of original Walk Based Attack using intersection and adding random victims and random sybils after " + count + " snapshot is : " + value);
                                fw.write(System.lineSeparator());
                                count++;
                            }

                        for (double value : originalWalkedBased_4) {

                            fw.write("Probability of original Walk Based Attack adding random victims and random sybils after " + count1 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count1++;
                        }
                        for (double value : hybrid_3) {

                            fw.write("Probability of original Walk Based Attack using intersection and adding random victims and random sybils after " + count2 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count2++;
                        }
                        for (double value : hybrid_4) {

                            fw.write("Probability of Hybrid Attack after after adding random victims and random sybils after " + count3+ " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count3++;

                        }
                        for (double value : robust_3) {

                            fw.write("Probability of Robust Attack after using intersection and adding random victims and random sybils after " + count4 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count4++;

                        }
                        for (double value : robust_4) {
                            fw.write("Probability of Robust Attack after adding random victims and random sybils after " + count5 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count5++;
                        }


//                        for (String line : frequency_values) {
//                            fw.write(line);
//                            fw.write(System.lineSeparator());
//                        }
//                        fw.write("Average probability of Original Walk Based Attack using intersection and adding random victims and random sybils after " + snapshotsPerGraph + " snapshots:" + calculateAverage(originalWalkedBased_3));
//                        fw.write(System.lineSeparator());
//                        fw.write("Average probability of Original Walk Based Attack after adding random victims and random sybils after " + snapshotsPerGraph + " snapshots:" + calculateAverage(originalWalkedBased_4));
//                        fw.write(System.lineSeparator());
//                        fw.write("Average probability of Hybrid Attack after using intersection and adding random victims and random sybils after " + snapshotsPerGraph + " snapshots:" + calculateAverage(hybrid_3));
//                        fw.write(System.lineSeparator());
//                        fw.write("Average probability of Hybrid Attack after after adding random victims and random sybils after " + snapshotsPerGraph + " snapshots:" + calculateAverage(hybrid_4));
//                        fw.write(System.lineSeparator());
//                        fw.write("Average probability of Robust Attack after using intersection and adding random victims and random sybils after " + snapshotsPerGraph + " snapshots:" + calculateAverage(robust_3));
//                        fw.write(System.lineSeparator());
//                        fw.write("Average probability of Robust Attack after after adding random victims and random sybils after " + snapshotsPerGraph + " snapshots:" + calculateAverage(robust_4));
//                        fw.write(System.lineSeparator());
                        fw.write("=====================================================");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case 3:
                    try {
                        int count=1;
                        int count1=1;
                        int count2=1;
                        int count3=1;
                        int count4=1;
                        int count5=1;
                        fw.write("Graph no." + i + "_Hardest to find victims + log N sybil's");
                        fw.write(System.lineSeparator());

                        for (double value : originalWalkedBased_5) {
                            fw.write("Probability of Original Walk Based Attack using intersection with hardest to find victim and log N sybils, after " + count + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count++;
                        }
                        fw.write("=====================================================");


                        for (double value : originalWalkedBased_6) {

                            fw.write("Probability of Original Walk Based Attack with hardest to find victim and log N sybils after " + count1 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count1++;
                        }
                        fw.write("=====================================================");

                        for (double value : hybrid_5) {

                            fw.write("Probability of Hybrid Attack after using intersection with hardest to find victim and log N sybils, after  " + count2 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count2++;
                        }
                        fw.write("=====================================================");

                        for (double value : hybrid_6) {

                            fw.write("Probability of Hybrid Attack with  hardest to find victim and log N sybils, after " + count3+ " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count3++;

                        }
                        fw.write("=====================================================");

                        for (double value : robust_5) {

                            fw.write("Probability of Robust Attack after using intersection with hardest to find victim and log N sybils, after  " + count4 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count4++;

                        }
                        fw.write("=====================================================");

                        for (double value : robust_6) {
                            fw.write("Probability of Robust Attack with hardest to find victim and log N sybils after" + count5 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count5++;
                        }


                        fw.write("=====================================================");
                        fw.write(System.lineSeparator());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        int count=1;
                        int count1=1;
                        int count2=1;
                        int count3=1;
                        int count4=1;
                        int count5=1;
                        fw.write("Graph no." + i + "_Hardest to find victims + random number of sybil's");
                        fw.write(System.lineSeparator());
                        for (double value : originalWalkedBased_7) {
                            fw.write("Probability of Original Walk Based Attack using intersection with hardest to find victim and adding random n sybils, after " + count + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count++;
                        }
                        fw.write("=====================================================");


                        for (double value : originalWalkedBased_8) {

                            fw.write("Probability of Original Walk Based Attack with hardest to find victim and adding random n sybils, after " + count1 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count1++;
                        }
                        fw.write("=====================================================");

                        for (double value : hybrid_7) {

                            fw.write("Probability of Hybrid Attack after using intersection with hardest to find victim and adding random n sybils, after  " + count2 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count2++;
                        }
                        fw.write("=====================================================");

                        for (double value : hybrid_8) {

                            fw.write("Probability of Hybrid Attack with hardest to find victim and adding random n sybils, after " + count3+ " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count3++;

                        }
                        fw.write("=====================================================");

                        for (double value : robust_7) {

                            fw.write("Probability of Robust Attack after using intersection with hardest to find victim and adding random n sybils, after  " + count4 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count4++;

                        }
                        fw.write("=====================================================");

                        for (double value : robust_8) {
                            fw.write("Probability of Robust Attack with hardest to find victim and adding random n sybils, after" + count5 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count5++;
                        }


                        fw.write("=====================================================");

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;

                case 5:
                    try {
                        int count=1;
                        int count1=1;
                        int count2=1;

                        fw.write("Graph no." + i + "_No Evolve Methods");
                        fw.write(System.lineSeparator());
                        for (double value : originalWalkedBased_9) {
                            fw.write("Probability of Original Walk Based Attack after noise and without evolve methods " + count + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count++;
                        }
                        fw.write("=====================================================");

                        for (double value : hybrid_9) {
                            fw.write("Probability of Hybrid Attack after noise and without evolve methods " + count1 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count1++;
                        }
                        fw.write("=====================================================");

                        for (double value : robust_9) {
                            fw.write("Probability of Hybrid Attack after noise and without evolve methods " + count2 + " snapshot is : " + value);
                            fw.write(System.lineSeparator());
                            count2++;
                        }

                         fw.write("=====================================================");

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
            }
        }
        fw.close();

        String fileName_final = "results/Averages_for_" + numberOfGraphs +"graphs with attack configuration " + attackConfiguration + ".txt";
        FileWriter fw_final = new FileWriter(fileName_final);


        switch (attackConfiguration) {
            case 1:
                try {
                    fw_final.write("Averages for " + numberOfGraphs + "graphs_Random victims + log N sybil's");
                    fw_final.write(System.lineSeparator());
                    for (String line : frequency_values) {
                        fw_final.write(line);
                        fw_final.write(System.lineSeparator());
                    }
                    fw_final.write("Average probability of Original Walk Based Attack using intersection and adding random victims and log n sybils after  snapshots:" + calculateAverage(originalWalkedBased_1_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Original Walk Based Attack after adding random victims and log n sybils after  snapshots:" + calculateAverage(originalWalkedBased_2_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Hybrid Attack after using intersection and adding random victims and log n sybils after  snapshots:" + calculateAverage(hybrid_1_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Hybrid Attack after after adding random victims and log n sybils after snapshots:" + calculateAverage(hybrid_2_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Robust Attack after using intersection and adding random victims and log n sybils after snapshots:" + calculateAverage(robust_1_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Robust Attack after after adding random victims and log n sybils after  snapshots:" + calculateAverage(robust_2_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("===============================================================================================================");

                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;
            case 2:
                try {
                    fw_final.write("Averages for " + numberOfGraphs+ "graphs _Random number of victims + random number of sybil's");
                    fw_final.write(System.lineSeparator());
                    for (String line : frequency_values) {
                        fw_final.write(line);
                        fw_final.write(System.lineSeparator());
                    }
                    fw_final.write("Average probability of Original Walk Based Attack using intersection and adding random victims and random sybils after  snapshots:" + calculateAverage(originalWalkedBased_3_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Original Walk Based Attack after adding random victims and random sybils after  snapshots:" + calculateAverage(originalWalkedBased_4_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Hybrid Attack after using intersection and adding random victims and random sybils after  snapshots:" + calculateAverage(hybrid_3_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Hybrid Attack after after adding random victims and random sybils after  snapshots:" + calculateAverage(hybrid_4_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Robust Attack after using intersection and adding random victims and random sybils after  snapshots:" + calculateAverage(robust_3));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Robust Attack after after adding random victims and random sybils after  snapshots:" + calculateAverage(robust_4_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("===============================================================================================================");

                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;
            case 3:
                try {
                    fw_final.write("Averages for " + numberOfGraphs + "graphs_Hardest to find victims + log N sybil's" );
                    fw_final.write(System.lineSeparator());
                    for (String line : frequency_values) {
                        fw_final.write(line);
                        fw_final.write(System.lineSeparator());
                    }
                    fw_final.write("Average probability of Original Walk Based Attack using intersection with hardest to find victim and log N sybils, after  snapshots:" + calculateAverage(originalWalkedBased_5_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Original Walk Based Attack with hardest to find victim and log N sybils after  snapshots:" + calculateAverage(originalWalkedBased_6_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Hybrid Attack after using intersection with hardest to find victim and log N sybils, after  snapshots:" + calculateAverage(hybrid_5_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Hybrid Attack with  hardest to find victim and log N sybils, after  snapshots:" + calculateAverage(hybrid_6_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Robust Attack after using intersection with hardest to find victim and log N sybils, after  snapshots:" + calculateAverage(robust_5_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Robust Attack with hardest to find victim and log N sybils after,  snapshots:" + calculateAverage(robust_6_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("===============================================================================================================");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                try {
                    fw_final.write("Averages for " + numberOfGraphs + "graphs_Hardest to find victims + random number of sybil's");
                    fw_final.write(System.lineSeparator());
                    for (String line : frequency_values) {
                        fw_final.write(line);
                        fw_final.write(System.lineSeparator());
                    }
                    fw_final.write("Average probability of Original Walk Based Attack using intersection with hardest to find victim and adding random n sybils, after  snapshots:" + calculateAverage(originalWalkedBased_7_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Original Walk Based Attack with hardest to find victim and adding random n sybils, after  snapshots:" + calculateAverage(originalWalkedBased_8_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Hybrid Attack after using intersection with hardest to find victim and adding random n sybils, after snapshots:" + calculateAverage(hybrid_7_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Hybrid Attack with hardest to find victim and adding random n sybils, after snapshots:" + calculateAverage(hybrid_8_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Robust Attack after using intersection with hardest to find victim and adding random n sybils, after  snapshots:" + calculateAverage(robust_7_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Robust Attack with hardest to find victim and adding random n sybils, after snapshots:" + calculateAverage(robust_8_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("===============================================================================================================");

                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;

            case 5:
                try {
                    fw_final.write("Averages for " + numberOfGraphs + "graphs_No_Evolve_Methods");
                    fw_final.write(System.lineSeparator());
                    for (String line : frequency_values) {
                        fw_final.write(line);
                        fw_final.write(System.lineSeparator());
                    }

                    fw_final.write("Average probability of Original Walk Based Attack after noise  snapshots:" + calculateAverage(originalWalkedBased_9_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Hybrid Attack after noise  snapshots:" + calculateAverage(hybrid_9_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("Average probability of Robust Attack after noise  snapshots:" + calculateAverage(robust_9_a));
                    fw_final.write(System.lineSeparator());
                    fw_final.write("===============================================================================================================");


                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;
        }

        fw_final.close();
    }

    private static double calculateAverage(ArrayList <Double> probabilities) {
        Double sum = 0.0;
        if(!probabilities.isEmpty()) {
            for (Double mark : probabilities) {
                sum += mark;
            }
            return sum / probabilities.size();
        }
        return sum;
    }

    private static void clearAllLists(){
        originalWalkedBased_initial.clear();
        frequency_values.clear();

        originalWalkedBased_1.clear();
        originalWalkedBased_2.clear();
        originalWalkedBased_3.clear();
        originalWalkedBased_4.clear();
        originalWalkedBased_5.clear();
        originalWalkedBased_6.clear();
        originalWalkedBased_7.clear();
        originalWalkedBased_8.clear();
        originalWalkedBased_9.clear();

        hybrid_1.clear();
        hybrid_2.clear();
        hybrid_3.clear();
        hybrid_4.clear();
        hybrid_5.clear();
        hybrid_6.clear();
        hybrid_7.clear();
        hybrid_8.clear();
        hybrid_9.clear();

        robust_1.clear();
        robust_2.clear();
        robust_3.clear();
        robust_4.clear();
        robust_5.clear();
        robust_6.clear();
        robust_7.clear();
        robust_8.clear();
        robust_9.clear();
    }

}