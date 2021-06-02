package services;

import java.util.List;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import models.Product;

public class HandleParquetFile {
	
	// save list Products to parquet file in HDFS
	public void saveToHDFSParquetFile(List<Product> list) {
		SparkSession spark = SparkSession.builder().appName("Write file parquet to HDFS").getOrCreate();
		
		Dataset<Row> listModelLogDF = spark.createDataFrame(list, Product.class);
		listModelLogDF.write().mode("append").parquet("hdfs://127.0.0.1:9000/tiki");
	}
}
