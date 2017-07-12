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
	
	pointcut pointCommycompanysparkWordCountJavaWordCountflatMap(): execution(* com.mycompany.sparkWordCount.JavaWordCount.flatMap(JavaRDD<String>));
}
