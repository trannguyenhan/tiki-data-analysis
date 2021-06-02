# tiki-data-analysis

Run project : 
- B1 : run hadoop, spark, kafka and create a topic "hello-kafka"
- B2 : Build file jar with mvn :  `mvn clean package`
- B3 : Run producer with spark : `spark-submit --class demo.KafkaStreamingReadDataDemo --master local[2] target/TikiData-V1-jar-with-dependencies.jar`
- B4 : Run consumer with Java Application : `in file KafkaSenDataDemo, choose Run As -> Java Application`
