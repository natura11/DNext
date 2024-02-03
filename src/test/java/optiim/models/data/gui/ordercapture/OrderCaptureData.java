package optiim.models.data.gui.ordercapture;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OrderCaptureData {

    private static List<String> macAddressValues;
    private static List<String> serialNumberValues;
    private static BufferedReader br;

    public static String getMacAddress(String indexValue) throws IOException {


        br = readFile("macaddresscoax.txt");
        String line;
        macAddressValues = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            String macAddress = line.split(",")[1];
            macAddressValues.add(macAddress);
        }

        br.close();

        return macAddressValues.get(Integer.parseInt(indexValue));
    }

    public static String getSerialNumber(String indexValue) throws IOException {

        br = readFile("smartcardserialcoax.txt");
        String line;
        serialNumberValues = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            String serialNumber = line.split(",")[0];
            serialNumberValues.add(serialNumber);
        }

        br.close();

        return serialNumberValues.get(Integer.parseInt(indexValue));
    }

    public static BufferedReader readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        FileReader fileReader = new FileReader(file);

        BufferedReader br = new BufferedReader(fileReader);

        return br;
    }


}
