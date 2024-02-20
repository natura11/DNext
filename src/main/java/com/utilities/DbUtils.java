package com.utilities;

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
        String dbUrl = ConfigurationReader.getProperty("dbUrl");
        String dbUsername = ConfigurationReader.getProperty("dbUsername");
        String dbPassword = ConfigurationReader.getProperty("dbPassword");
        try {
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //todo:1.AgencyController
    public static Object getRowAgencyId(String query) {
        return getQueryResultMap(query).get(0).get("id");
    }

    public static Object getRowAgencyTypeId(String query) {
        return getQueryResultMap(query).get(0).get("id");

    }

    //todo:2.AllocateTypeController

    public static Object getRowAllocateTypeIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("id");
    }

    //todo:3.AppointmentController

    public static Object getRowAppointmentIdApplicantQuery(String query) {
        return getQueryResultMap(query).get(0).get("appointment_id");
    }

    public static Object getRowApplicantIdApplicantQuery(String query) {
        return getQueryResultMap(query).get(0).get("id");
    }

    public static Object getRowAppointmentIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("id");
    }

    public static Object getRowSlotIdAppointmentQuery(String query) {
        return getQueryResultMap(query).get(0).get("slot_id");
    }

    public static Object getRowApplicantIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("id");
    }

    public static Object getRowSlotTableBranchIdQuery(String query) {
        //appointment ve slot controller'da kullanilacak
        return getQueryResultMap(query).get(0).get("branch_id");
    }

    public static Object getRowSlotTableSlotIdQuery(String query) {
        //appointment ve slot controller'da kullanilacak
        return getQueryResultMap(query).get(0).get("id");
    }

    public static Object getRowDefinitionsTableApplicantTypeIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("code");
    }

    public static Object getRowApplicationTypeTableApplicationTypeIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("id");
    }

    public static Object getRowVisaCategoriesTableVisaTypeIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("id");
    }

    public static Object getRowCountryTableNationalityQuery(String query) {
        return getQueryResultMap(query).get(0).get("id");
    }

    public static Object getRowDefinitionsTableGenderIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("code");
    }

    public static Object getRowDefinitionsTableRelationshipIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("code");
    }

    public static Object getRowDefinitionsTableInsuranceTypeIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("code");
    }

    public static Object getRowAppointmentApplicantTableAppointmentIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("appointment_id");
    }

    public static Object getRowAppointmentApplicantTableBranchIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("branch_id");
    }

    public static Object getRowAppointmentApplicantTableNationalityIdQuery(String query) {
        return getQueryResultMap(query).get(0).get("nationality_id");
    }

    public static Object getRowAppointmentApplicantTablePassportNumberQuery(String query) {
        return getQueryResultMap(query).get(0).get("passport_number");
    }

    public static Object getRowAppointmentApplicantTableApplicantIdQuery(String query) {
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