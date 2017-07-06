package co.edu.icesi.eketal.automaton;

import co.edu.icesi.ketal.core.Automaton;
import co.edu.icesi.ketal.core.DefaultEqualsExpression;
import co.edu.icesi.ketal.core.Event;
import co.edu.icesi.ketal.core.Expression;
import co.edu.icesi.ketal.core.NamedEvent;
import co.edu.icesi.ketal.core.State;
import co.edu.icesi.ketal.core.Transition;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@SuppressWarnings("all")
public class SeqEventDetector {
  private static Automaton instance;
  
  public static Map<String, State> estados = new HashMap<String, State>();
  
  public static Automaton getInstance() {
    if(instance==null)
    	new SeqEventDetector();
    return instance;
  }
  
  private SeqEventDetector() {
    initialize();
  }
  
  private void initialize() {
    //Relación evento caracter
    Map<String, Character> mapping = new TreeMap<String, Character>();
    //Estado inicial
    State inicial = null;
    //lista de estados finales
    Set<State> estadosFinales = new HashSet();
    
    //conjunto de transiciones
    HashSet<Transition> transitionSet = new HashSet();
    //map de expresiones con caracteres
    Hashtable<Expression, Character> expressions = new Hashtable();
    
    int consecutivo = 65;
    Character caracter = (char)consecutivo;
    String nombreEvento = "";
    String estadoLlegada = "";
    
    //Definición del estado: initialState
    String estadoInitialState = "initialState";
    estados.put(estadoInitialState, new State());
    //start start 1
    //Estado inicial: initialState
    inicial = estados.get(estadoInitialState);
    //Definición del estado: secondState
    String estadoSecondState = "secondState";
    estados.put(estadoSecondState, new State());
    //Definición del estado: thirdState
    String estadoThirdState = "thirdState";
    estados.put(estadoThirdState, new State());
    //Definición del estado: fourState
    String estadoFourState = "fourState";
    estados.put(estadoFourState, new State());
    //Definición del estado: fiveState
    String estadoFiveState = "fiveState";
    estados.put(estadoFiveState, new State());
    //Definición del estado: deadState
    String estadoDeadState = "deadState";
    estados.put(estadoDeadState, new State());
    //Definición del estado: finalState
    String estadoFinalState = "finalState";
    estados.put(estadoFinalState, new State());
    //Transicion de mostrar1 -> secondState
    estadoLlegada = "secondState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoInitialState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar1";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition initialStateMostrar1 = new Transition(estados.get(estadoInitialState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(initialStateMostrar1);
    
    //Transicion de mostrar2 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoInitialState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar2";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition initialStateMostrar2 = new Transition(estados.get(estadoInitialState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(initialStateMostrar2);
    
    //Transicion de mostrar3 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoInitialState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar3";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition initialStateMostrar3 = new Transition(estados.get(estadoInitialState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(initialStateMostrar3);
    
    //Transicion de mostrar4 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoInitialState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar4";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition initialStateMostrar4 = new Transition(estados.get(estadoInitialState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(initialStateMostrar4);
    
    //Transicion de mostrar5 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoInitialState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar5";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition initialStateMostrar5 = new Transition(estados.get(estadoInitialState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(initialStateMostrar5);
    
    //Transicion de mostrar1 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoSecondState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar1";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition secondStateMostrar1 = new Transition(estados.get(estadoSecondState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(secondStateMostrar1);
    
    //Transicion de mostrar2 -> thirdState
    estadoLlegada = "thirdState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoSecondState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar2";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition secondStateMostrar2 = new Transition(estados.get(estadoSecondState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(secondStateMostrar2);
    
    //Transicion de mostrar3 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoSecondState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar3";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition secondStateMostrar3 = new Transition(estados.get(estadoSecondState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(secondStateMostrar3);
    
    //Transicion de mostrar4 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoSecondState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar4";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition secondStateMostrar4 = new Transition(estados.get(estadoSecondState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(secondStateMostrar4);
    
    //Transicion de mostrar5 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoSecondState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar5";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition secondStateMostrar5 = new Transition(estados.get(estadoSecondState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(secondStateMostrar5);
    
    //Transicion de mostrar1 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoThirdState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar1";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition thirdStateMostrar1 = new Transition(estados.get(estadoThirdState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(thirdStateMostrar1);
    
    //Transicion de mostrar2 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoThirdState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar2";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition thirdStateMostrar2 = new Transition(estados.get(estadoThirdState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(thirdStateMostrar2);
    
    //Transicion de mostrar3 -> fourState
    estadoLlegada = "fourState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoThirdState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar3";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition thirdStateMostrar3 = new Transition(estados.get(estadoThirdState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(thirdStateMostrar3);
    
    //Transicion de mostrar4 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoThirdState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar4";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition thirdStateMostrar4 = new Transition(estados.get(estadoThirdState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(thirdStateMostrar4);
    
    //Transicion de mostrar5 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoThirdState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar5";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition thirdStateMostrar5 = new Transition(estados.get(estadoThirdState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(thirdStateMostrar5);
    
    //Transicion de mostrar1 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoFourState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar1";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition fourStateMostrar1 = new Transition(estados.get(estadoFourState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(fourStateMostrar1);
    
    //Transicion de mostrar2 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoFourState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar2";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition fourStateMostrar2 = new Transition(estados.get(estadoFourState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(fourStateMostrar2);
    
    //Transicion de mostrar3 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoFourState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar3";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition fourStateMostrar3 = new Transition(estados.get(estadoFourState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(fourStateMostrar3);
    
    //Transicion de mostrar4 -> fiveState
    estadoLlegada = "fiveState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoFourState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar4";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition fourStateMostrar4 = new Transition(estados.get(estadoFourState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(fourStateMostrar4);
    
    //Transicion de mostrar5 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoFourState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar5";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition fourStateMostrar5 = new Transition(estados.get(estadoFourState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(fourStateMostrar5);
    
    //Transicion de mostrar1 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoFiveState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar1";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition fiveStateMostrar1 = new Transition(estados.get(estadoFiveState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(fiveStateMostrar1);
    
    //Transicion de mostrar2 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoFiveState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar2";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition fiveStateMostrar2 = new Transition(estados.get(estadoFiveState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(fiveStateMostrar2);
    
    //Transicion de mostrar3 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoFiveState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar3";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition fiveStateMostrar3 = new Transition(estados.get(estadoFiveState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(fiveStateMostrar3);
    
    //Transicion de mostrar4 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoFiveState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar4";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition fiveStateMostrar4 = new Transition(estados.get(estadoFiveState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(fiveStateMostrar4);
    
    //Transicion de mostrar5 -> finalState
    estadoLlegada = "finalState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoFiveState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar5";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition fiveStateMostrar5 = new Transition(estados.get(estadoFiveState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(fiveStateMostrar5);
    
    //Transicion de mostrar1 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoDeadState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar1";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition deadStateMostrar1 = new Transition(estados.get(estadoDeadState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(deadStateMostrar1);
    
    //Transicion de mostrar2 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoDeadState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar2";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition deadStateMostrar2 = new Transition(estados.get(estadoDeadState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(deadStateMostrar2);
    
    //Transicion de mostrar3 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoDeadState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar3";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition deadStateMostrar3 = new Transition(estados.get(estadoDeadState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(deadStateMostrar3);
    
    //Transicion de mostrar4 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoDeadState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar4";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition deadStateMostrar4 = new Transition(estados.get(estadoDeadState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(deadStateMostrar4);
    
    //Transicion de mostrar5 -> deadState
    estadoLlegada = "deadState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoDeadState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar5";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition deadStateMostrar5 = new Transition(estados.get(estadoDeadState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(deadStateMostrar5);
    
    //Transicion de mostrar6 -> finalState
    estadoLlegada = "finalState";
    if(!estados.containsKey(estadoLlegada)){
    	estados.put(estadoFinalState, new State());
    }
    caracter = (char)consecutivo;
    consecutivo++;
    nombreEvento = "mostrar6";
    if(!mapping.containsKey(nombreEvento)){
    	mapping.put(nombreEvento, caracter);
    	expressions.put(new DefaultEqualsExpression(new NamedEvent(nombreEvento)), mapping.get(nombreEvento));
    }
    Transition finalStateMostrar6 = new Transition(estados.get(estadoFinalState), estados.get(estadoLlegada), mapping.get(nombreEvento));
    transitionSet.add(finalStateMostrar6);
    
    //Estado final FinalState
    estados.get(estadoFinalState).setAccept(true);
    estadosFinales.add(estados.get(estadoFinalState));
    
    Automaton automata = new Automaton(transitionSet, inicial, estadosFinales, expressions){
    	@Override
    	    	public boolean evaluate(Event event){
    	    		if(event instanceof NamedEvent){
    	    			return super.evaluate(event);
    	    		}
    	    		return false;
    	    	}
    };
    automata.initializeAutomaton();
    instance = automata;
  }
}
