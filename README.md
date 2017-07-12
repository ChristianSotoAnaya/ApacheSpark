# Apache Spark
# Escuela Colombiana De Ingeniería Julio Garavito

En este repositorio se almacenarán los archivos de prueba de la aplicación de ejemplo "Word Count" ejecutado con Apache Spark-2.1.1-Pre-build for Apache Hadoop 2.7, se utilizará apache spark de modo clúster standalone


# Instrucciones
A continuación, se mostrará en los siguientes pasos como preparar apache spark y ejecutar las pruebas, se deberá tener clonado el repositorio en todos los equipos que conformen el clúster

1) Para ejecutar el maestro hay que ir a la carpeta "spark-2.1.1-bin-hadoop2.7" y ejecutar: "./bin/spark-class org.apache.spark.deploy.master.Master", después de esto accediendo a tu dirección IP: "YOUR_IP_ADDRESS:8080" o "localhost:8080" se mostrara la interfaz de usuario en el cual se podrá ver entre otras cosas la dirección del clúster, los trabajadores y tareas asignadas.

2) Ahora que el maestro está corriendo continuamos a conectar los trabajadores, para esto en la carpeta "spark-2.1.1-bin-hadoop2.7" ejecutar: "./bin/spark-class org.apache.spark.deploy.worker.Worker spark://YOUR_IP_MASTER:7077", se pueden conectar tantos trabajadores como equipos se disponga.

3) Luego de conectar a los trabajadores ya podemos ejecutar la aplicación, en la carpeta: "spark-2.1.1-bin-hadoop2.7", ejecutar: "./bin/spark-submit --class com.mycompany.sparkWordCount.Main --master spark://YOUR_IP_MASTER:7077 /PATH_TO_PROJECT/ApacheSpark/sparkWordCount/target/SparkWordCount-1.0-SNAPSHOT-jar-with-dependencies.jar /PATH_TO_PROJECT/ApacheSpark/Test/small.txt"


# Nota
En el repositorio se encuentran 2 archivos de prueba, 1 pequeño y uno mediano con respecto a la cantidad de palabras, adicionalmente hay un archivo de prueba grande el cual se encuentra almacenado en [MediaFire](http://www.mediafire.com/file/sa4di9p4dhsf9ia/large.txt)
