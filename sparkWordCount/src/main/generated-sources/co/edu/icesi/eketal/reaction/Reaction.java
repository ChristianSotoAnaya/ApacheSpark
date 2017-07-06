package co.edu.icesi.eketal.reaction;

import co.edu.icesi.ketal.core.Automaton;
import co.edu.icesi.ketal.core.State;

@SuppressWarnings("all")
public class Reaction {
  public static void reactionseqEventDetectordeadState() {
    String msg = "DEAD STATE";
    System.out.println();
    System.out.println("----------------------------------------");
    System.out.println("----------------------------------------");
    System.out.println(msg);
    System.out.println("----------------------------------------");
    System.out.println("----------------------------------------");
    System.out.println();
  }
  
  public static void reactionseqEventDetectorinitialState() {
    String msg = "Reaction detected initialState  -----  Cargando archivo al RDD";
    System.out.println();
    System.out.println("--------------------------------------------------------------------");
    System.out.println(msg);
    System.out.println("--------------------------------------------------------------------");
    System.out.println();
  }
  
  public static void reactionseqEventDetectorsecondState() {
    String msg = "Reaction detected secondState  -----  Separando palabras";
    System.out.println();
    System.out.println("--------------------------------------------------------------------");
    System.out.println(msg);
    System.out.println("--------------------------------------------------------------------");
    System.out.println();
  }
  
  public static void reactionseqEventDetectorthirdState() {
    String msg = "Reaction detected thirdState  -----  Creando tuplas por palabras";
    System.out.println();
    System.out.println("--------------------------------------------------------------------");
    System.out.println(msg);
    System.out.println("--------------------------------------------------------------------");
    System.out.println();
  }
  
  public static void reactionseqEventDetectorfourState() {
    String msg = "Reaction detected fourState  -----  Sumando las palabras repetidas";
    System.out.println();
    System.out.println("--------------------------------------------------------------------");
    System.out.println(msg);
    System.out.println("--------------------------------------------------------------------");
    System.out.println();
  }
  
  public static void reactionseqEventDetectorfiveState() {
    String msg = "Reaction detected fiveState  -----  Sumando las palabras repetidas";
    System.out.println();
    System.out.println("--------------------------------------------------------------------");
    System.out.println(msg);
    System.out.println("--------------------------------------------------------------------");
    System.out.println();
  }
  
  public static void reactionseqEventDetectorfinalState() {
    String msg = "Reaction detected finalState  Mostrando Resultado";
    System.out.println();
    System.out.println("--------------------------------------------------------------------");
    System.out.println(msg);
    System.out.println("--------------------------------------------------------------------");
    System.out.println();
  }
  
  public static void verifyBefore(final Automaton automaton) {
    State actual = automaton.getCurrentState();
    if(actual.equals(co.edu.icesi.eketal.automaton.SeqEventDetector.estados.get("initialState"))){
    	reactionseqEventDetectorinitialState();
    }
    if(actual.equals(co.edu.icesi.eketal.automaton.SeqEventDetector.estados.get("secondState"))){
    	reactionseqEventDetectorsecondState();
    }
    if(actual.equals(co.edu.icesi.eketal.automaton.SeqEventDetector.estados.get("deadState"))){
    	reactionseqEventDetectordeadState();
    }
    if(actual.equals(co.edu.icesi.eketal.automaton.SeqEventDetector.estados.get("thirdState"))){
    	reactionseqEventDetectorthirdState();
    }
    if(actual.equals(co.edu.icesi.eketal.automaton.SeqEventDetector.estados.get("fourState"))){
    	reactionseqEventDetectorfourState();
    }
    if(actual.equals(co.edu.icesi.eketal.automaton.SeqEventDetector.estados.get("finalState"))){
    	reactionseqEventDetectorfinalState();
    }
    if(actual.equals(co.edu.icesi.eketal.automaton.SeqEventDetector.estados.get("fiveState"))){
    	reactionseqEventDetectorfiveState();
    }
  }
  
  public static void verifyAfter(final Automaton automaton) {
    
  }
}
