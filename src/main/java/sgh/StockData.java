package sgh;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class StockData {

    public static void getAndProcessChange(String stock) throws IOException {
        String filePath = "data_in/" + stock + ".csv";
        // Checking if the files already exists"
        String fileName = stock + ".csv";
        File myFile = new File(fileName);
        if myFile.exists();
        else{
        download("https://query1.finance.yahoo.com/v7/finance/download/" + stock +
                                "?period1=1554504399&period2=1586126799&interval=1d&events=history",
                        filePath);}
        // foreach loop: for each file in the folder
        String folderPath = "data_in";
        File dir = new File(folderPath);
        File[] directoryListing = dir.listFiles();
        for(File f: directoryListing){
            // reading the file line by line:
            Scanner scanner = new Scanner(myFile);
            int i = 0;
            while (scanner.hasNextLine()) {
                String myLine = scanner.nextLine();
                i++;
                System.out.println("Line " + i + " : " + myLine);
            }
           public static int all(List<List<Integer>> matrix){

            }


        }
    }

    public static void download(String url, String fileName) throws IOException {
        try (InputStream in = URI.create(url).toURL().openStream()) {
            Files.copy(in, Paths.get(fileName));
        }
    }

    public static void main(String[] args) throws IOException {
        String[] stocks = new String[] { "IBM", "MSFT", "GOOG" };
        for (String s : stocks) {
            getAndProcessChange(s);
        }
    }
}
