package com.utilities;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.*;

public class DbUtils {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;


    public static void createConnection() {
//        String dbUrl = ConfigurationReader.getProperty("dbUrl");
//        String dbUsername = ConfigurationReader.getProperty("dbUsername");
//        String dbPassword = ConfigurationReader.getProperty("dbPassword");
//        try {
//            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
       // }
        String uri = "mongodb+srv://uat_dnri_db:d1UFLK1wuphl@mongo-dnext-uat.c3sg4.mongodb.net/test";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("dnri_db");
            MongoCollection<Document> collection = database.getCollection("resource");
            Document doc = collection.find().first();
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
        }
    }

    //todo:1.AgencyController
    public static Object getRowAgencyId(String query) {
        return getQueryResultMap(query).get(0).get("id");
    }

    public static Object getRowAgencyTypeId(String query) {
        return getQueryResultMap(query).get(0).get("id");

    }

    //todo:4.SlotController

    public static Object getRowBrancIdSlotsQuery(String query) {
        return getQueryResultMap(query).get(0).get("id");
    }

    public static Object getRowSlotTimeSlotsQuery(String query) {
        return getQueryResultMap(query).get(0).get("slot_time");
    }

    /**
     * @param query
     * @return returns query result in a list of maps where the list represents
     * collection of rows and a map represents represent a single row with
     * key being the column name
     */
    public static List<Map<String, Object>> getQueryResultMap(String query) {
        executeQuery(query);
        List<Map<String, Object>> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                Map<String, Object> colNameValueMap = new HashMap<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    colNameValueMap.put(rsmd.getColumnName(i), resultSet.getObject(i));
                }
                rowList.add(colNameValueMap);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rowList;
    }

    private static void executeQuery(String query) {
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void destroyConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}