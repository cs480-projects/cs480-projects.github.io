package com.database.test.databasetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoIterable;
import static com.mongodb.client.model.Filters.*;

@SpringBootApplication
public class DatabasetestApplication {

	public static void main(String[] args) {
		String connectionString = "mongodb+srv://Shiina:IanJordan1*@cluster0.elfhy1n.mongodb.net/?retryWrites=true&w=majority";

		MongoClient client = MongoClients.create(connectionString);
	}

}
