package com.database.test.databasetest;

import org.bson.Document;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class DatabasetestApplication {

	public static void main(String[] args) {
		String connectionString = "mongodb+srv://dbtest:abcd1234@cluster0.elfhy1n.mongodb.net/?retryWrites=true&w=majority";

		MongoClient client = (MongoClient) MongoClients.create(connectionString);

		MongoDatabase db = client.getDatabase("sampleDB");
		MongoCollection col = db.getCollection("sampleCollection");

		Document sampleDoc = new Document("_id", "1").append("name", "John Smith");
		col.insertOne(sampleDoc);
	}

}
