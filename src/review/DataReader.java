package review;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class DataReader {

    public static void main(String[] args) throws IOException {

        // given you have a text file in your machine
        // read that text file, and store every word of the text file into a ArrayList
        // and store also in a HashMap where the word is your key and how many time it occured if your value


        String tmpContainer;
        String finalText = "";

        FileReader fileReader = new FileReader("src/review/data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((tmpContainer = bufferedReader.readLine()) != null) {
            finalText = finalText + "\n" + tmpContainer;
        }


        String[] data = finalText.replace("\n", " ").split(" ");

        ArrayList<String> dataList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            dataList.add(data[i]);
        }
        dataList.remove("");

        System.out.println(dataList);

        HashMap<String, Integer> mapOfData = new HashMap<>();

        for (int i = 0; i < dataList.size(); i++) {
            Integer counter = mapOfData.get(dataList.get(i));
            if (counter == null) {
                counter = 1;
            } else {
                counter = counter + 1;
            }
            mapOfData.put(dataList.get(i), counter);

        }


        System.out.println(mapOfData);
    }
}
