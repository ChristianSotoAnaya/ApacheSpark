package co.edu.icesi.eketal.aspects;
		
import co.edu.icesi.eketal.automaton.*;
import co.edu.icesi.eketal.groupsimpl.*;
import co.edu.icesi.eketal.handlercontrol.*;
import co.edu.icesi.eketal.reaction.*;
import co.edu.icesi.ketal.core.Automaton;
import co.edu.icesi.ketal.core.Event;
import co.edu.icesi.ketal.core.NamedEvent;
import com.mycompany.sparkWordCount.*;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.SparkSession;

public aspect WordCount{
	
	final static Log logger = LogFactory.getLog(WordCount.class);
	//seqEventDetector
	//--------Evento: mostrar1-------------
	pointcut mostrar1():
		(pointCommycompanysparkWordCountJavaWordCountjavaRDD() && if(GroupsControl.host("localGroup")));
		
	//after() returning (Object o): mostrar1() {
	//	System.out.println("[Aspectj] Returned normally with " + o);
	//}
	//after() throwing (Exception e): mostrar1() {
	//	System.out.println("[Aspectj] Threw an exception: " + e);
	//}
	after(): mostrar1(){
		Automaton automata = SeqEventDetector.getInstance();
		Reaction.verifyAfter(automata);
		//System.out.println("[Aspectj] After: Returned or threw an Exception");
		logger.debug("[Aspectj] After: Returned or threw an Exception");
	}
	before(): mostrar1(){
		EventHandler distribuidor = EventHandler.getInstance();
		Automaton automata = SeqEventDetector.getInstance();
		Map map = new HashMap<String, Object>();
		//map.put("Automata", automata);
		Event event = new NamedEvent("mostrar1");
		event.setLocalization(distribuidor.getAsyncAddress());
		distribuidor.multicast(event, map);
		if(!automata.evaluate(event)){
			//System.out.println("[Aspectj] Before: Event not recognized by the automaton");
			logger.debug("[Aspectj] Before: Event not recognized by the automaton");
			//Debería parar
		}else{
			Reaction.verifyBefore(automata);
			//System.out.println("[Aspectj] Before: Returned or threw an Exception");
			logger.debug("[Aspectj] Before: Returned or threw an Exception");
		}
		//while(!automata.evaluate(event)){
		//	wait(100);
		//	
		//}
	}
	//--------Evento: mostrar2-------------
	pointcut mostrar2():
		(pointCommycompanysparkWordCountJavaWordCountflatMap() && if(GroupsControl.host("localGroup")));
		
	//after() returning (Object o): mostrar2() {
	//	System.out.println("[Aspectj] Returned normally with " + o);
	//}
	//after() throwing (Exception e): mostrar2() {
	//	System.out.println("[Aspectj] Threw an exception: " + e);
	//}
	after(): mostrar2(){
		Automaton automata = SeqEventDetector.getInstance();
		Reaction.verifyAfter(automata);
		//System.out.println("[Aspectj] After: Returned or threw an Exception");
		logger.debug("[Aspectj] After: Returned or threw an Exception");
	}
	before(): mostrar2(){
		EventHandler distribuidor = EventHandler.getInstance();
		Automaton automata = SeqEventDetector.getInstance();
		Map map = new HashMap<String, Object>();
		//map.put("Automata", automata);
		Event event = new NamedEvent("mostrar2");
		event.setLocalization(distribuidor.getAsyncAddress());
		distribuidor.multicast(event, map);
		if(!automata.evaluate(event)){
			//System.out.println("[Aspectj] Before: Event not recognized by the automaton");
			logger.debug("[Aspectj] Before: Event not recognized by the automaton");
			//Debería parar
		}else{
			Reaction.verifyBefore(automata);
			//System.out.println("[Aspectj] Before: Returned or threw an Exception");
			logger.debug("[Aspectj] Before: Returned or threw an Exception");
		}
		//while(!automata.evaluate(event)){
		//	wait(100);
		//	
		//}
	}
	//--------Evento: mostrar3-------------
	pointcut mostrar3():
		(pointCommycompanysparkWordCountJavaWordCountmapToPair() && if(GroupsControl.host("localGroup")));
		
	//after() returning (Object o): mostrar3() {
	//	System.out.println("[Aspectj] Returned normally with " + o);
	//}
	//after() throwing (Exception e): mostrar3() {
	//	System.out.println("[Aspectj] Threw an exception: " + e);
	//}
	after(): mostrar3(){
		Automaton automata = SeqEventDetector.getInstance();
		Reaction.verifyAfter(automata);
		//System.out.println("[Aspectj] After: Returned or threw an Exception");
		logger.debug("[Aspectj] After: Returned or threw an Exception");
	}
	before(): mostrar3(){
		EventHandler distribuidor = EventHandler.getInstance();
		Automaton automata = SeqEventDetector.getInstance();
		Map map = new HashMap<String, Object>();
		//map.put("Automata", automata);
		Event event = new NamedEvent("mostrar3");
		event.setLocalization(distribuidor.getAsyncAddress());
		distribuidor.multicast(event, map);
		if(!automata.evaluate(event)){
			//System.out.println("[Aspectj] Before: Event not recognized by the automaton");
			logger.debug("[Aspectj] Before: Event not recognized by the automaton");
			//Debería parar
		}else{
			Reaction.verifyBefore(automata);
			//System.out.println("[Aspectj] Before: Returned or threw an Exception");
			logger.debug("[Aspectj] Before: Returned or threw an Exception");
		}
		//while(!automata.evaluate(event)){
		//	wait(100);
		//	
		//}
	}
	//--------Evento: mostrar4-------------
	pointcut mostrar4():
		(pointCommycompanysparkWordCountJavaWordCountreduceByKey() && if(GroupsControl.host("localGroup")));
		
	//after() returning (Object o): mostrar4() {
	//	System.out.println("[Aspectj] Returned normally with " + o);
	//}
	//after() throwing (Exception e): mostrar4() {
	//	System.out.println("[Aspectj] Threw an exception: " + e);
	//}
	after(): mostrar4(){
		Automaton automata = SeqEventDetector.getInstance();
		Reaction.verifyAfter(automata);
		//System.out.println("[Aspectj] After: Returned or threw an Exception");
		logger.debug("[Aspectj] After: Returned or threw an Exception");
	}
	before(): mostrar4(){
		EventHandler distribuidor = EventHandler.getInstance();
		Automaton automata = SeqEventDetector.getInstance();
		Map map = new HashMap<String, Object>();
		//map.put("Automata", automata);
		Event event = new NamedEvent("mostrar4");
		event.setLocalization(distribuidor.getAsyncAddress());
		distribuidor.multicast(event, map);
		if(!automata.evaluate(event)){
			//System.out.println("[Aspectj] Before: Event not recognized by the automaton");
			logger.debug("[Aspectj] Before: Event not recognized by the automaton");
			//Debería parar
		}else{
			Reaction.verifyBefore(automata);
			//System.out.println("[Aspectj] Before: Returned or threw an Exception");
			logger.debug("[Aspectj] Before: Returned or threw an Exception");
		}
		//while(!automata.evaluate(event)){
		//	wait(100);
		//	
		//}
	}
	//--------Evento: mostrar5-------------
	pointcut mostrar5():
		(pointCommycompanysparkWordCountJavaWordCountcollect() && if(GroupsControl.host("localGroup")));
		
	//after() returning (Object o): mostrar5() {
	//	System.out.println("[Aspectj] Returned normally with " + o);
	//}
	//after() throwing (Exception e): mostrar5() {
	//	System.out.println("[Aspectj] Threw an exception: " + e);
	//}
	after(): mostrar5(){
		Automaton automata = SeqEventDetector.getInstance();
		Reaction.verifyAfter(automata);
		//System.out.println("[Aspectj] After: Returned or threw an Exception");
		logger.debug("[Aspectj] After: Returned or threw an Exception");
	}
	before(): mostrar5(){
		EventHandler distribuidor = EventHandler.getInstance();
		Automaton automata = SeqEventDetector.getInstance();
		Map map = new HashMap<String, Object>();
		//map.put("Automata", automata);
		Event event = new NamedEvent("mostrar5");
		event.setLocalization(distribuidor.getAsyncAddress());
		distribuidor.multicast(event, map);
		if(!automata.evaluate(event)){
			//System.out.println("[Aspectj] Before: Event not recognized by the automaton");
			logger.debug("[Aspectj] Before: Event not recognized by the automaton");
			//Debería parar
		}else{
			Reaction.verifyBefore(automata);
			//System.out.println("[Aspectj] Before: Returned or threw an Exception");
			logger.debug("[Aspectj] Before: Returned or threw an Exception");
		}
		//while(!automata.evaluate(event)){
		//	wait(100);
		//	
		//}
	}
	//--------Evento: mostrar6-------------
	pointcut mostrar6():
		(pointCommycompanysparkWordCountJavaWordCountprint() && if(GroupsControl.host("localGroup")));
		
	//after() returning (Object o): mostrar6() {
	//	System.out.println("[Aspectj] Returned normally with " + o);
	//}
	//after() throwing (Exception e): mostrar6() {
	//	System.out.println("[Aspectj] Threw an exception: " + e);
	//}
	after(): mostrar6(){
		Automaton automata = SeqEventDetector.getInstance();
		Reaction.verifyAfter(automata);
		//System.out.println("[Aspectj] After: Returned or threw an Exception");
		logger.debug("[Aspectj] After: Returned or threw an Exception");
	}
	before(): mostrar6(){
		EventHandler distribuidor = EventHandler.getInstance();
		Automaton automata = SeqEventDetector.getInstance();
		Map map = new HashMap<String, Object>();
		//map.put("Automata", automata);
		Event event = new NamedEvent("mostrar6");
		event.setLocalization(distribuidor.getAsyncAddress());
		distribuidor.multicast(event, map);
		if(!automata.evaluate(event)){
			//System.out.println("[Aspectj] Before: Event not recognized by the automaton");
			logger.debug("[Aspectj] Before: Event not recognized by the automaton");
			//Debería parar
		}else{
			Reaction.verifyBefore(automata);
			//System.out.println("[Aspectj] Before: Returned or threw an Exception");
			logger.debug("[Aspectj] Before: Returned or threw an Exception");
		}
		//while(!automata.evaluate(event)){
		//	wait(100);
		//	
		//}
	}
	
	pointcut pointCommycompanysparkWordCountJavaWordCountcollect(): execution(* com.mycompany.sparkWordCount.JavaWordCount.collect(JavaPairRDD<String, Integer>));
	pointcut pointCommycompanysparkWordCountJavaWordCountflatMap(): execution(* com.mycompany.sparkWordCount.JavaWordCount.flatMap(JavaRDD<String>));
	pointcut pointCommycompanysparkWordCountJavaWordCountjavaRDD(): execution(* com.mycompany.sparkWordCount.JavaWordCount.javaRDD(SparkSession,String));
	pointcut pointCommycompanysparkWordCountJavaWordCountmapToPair(): execution(* com.mycompany.sparkWordCount.JavaWordCount.mapToPair(JavaRDD<String>));
	pointcut pointCommycompanysparkWordCountJavaWordCountprint(): execution(* com.mycompany.sparkWordCount.JavaWordCount.print(String));
	pointcut pointCommycompanysparkWordCountJavaWordCountreduceByKey(): execution(* com.mycompany.sparkWordCount.JavaWordCount.reduceByKey(JavaPairRDD<String, Integer>));
}
