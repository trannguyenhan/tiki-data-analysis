package services;

import java.util.List;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import models.Product;

public class HandleParquetFile {
	private List<Product> list;
	
	public HandleParquetFile(List<Product> list) {
		this.list = list;
	}
	
	// save list Products to parquet file in HDFS
	public void saveToHDFSParquetFile() {
		SparkSession spark = SparkSession.builder().appName("Write file parquet to HDFS").getOrCreate();
		
		Dataset<Row> listModelLogDF = spark.createDataFrame(list, Product.class);
		listModelLogDF.write().parquet("hdfs://127.0.0.1:9000/tiki");
	}
}
