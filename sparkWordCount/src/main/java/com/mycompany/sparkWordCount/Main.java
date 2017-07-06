package com.mycompany.sparkWordCount;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.SparkSession;

public class Main {

	public static void main(String[] args) {
		//String arg="/home/estudiante/Downloads/prueba.txt";
		
		SparkSession spark=SparkSession.builder().appName("JavaWordCount").getOrCreate();
		//System.out.println("-------------------Cargando archivo al RDD---------------------");
		JavaRDD<String> lines =JavaWordCount.javaRDD(spark, args[0]);
		//System.out.println("------------------- Separando palabras ---------------------");
		JavaRDD<String> words=JavaWordCount.flatMap(lines);
		//System.out.println("------------------- Creando tuplas por palabras ---------------------");
		JavaPairRDD<String, Integer> ones = JavaWordCount.mapToPair(words);
		//System.out.println("------------------- Sumando las palabras repetidas ---------------------");
		JavaPairRDD<String, Integer> counts = JavaWordCount.reduceByKey(ones);
		//System.out.println("------------------- Mostrando resultado ---------------------");
		JavaWordCount.collect(counts);
		//System.out.println("------------------- Deteniendo Spark ---------------------");
		spark.stop();
		
		

	}

}
