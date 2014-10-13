/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mongoapp;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;

/**
 *
 * @author nuwan600
 */
public class DBManager {
    
    private static DB database;
	
	public static DB getDatabase() {
		if(database == null) {
			MongoClient mongo;
			try {
				mongo = new MongoClient("localhost", 27017);
				database = mongo.getDB("test");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return database;
        }
    
}
