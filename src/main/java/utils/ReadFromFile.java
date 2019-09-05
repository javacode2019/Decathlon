package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
    public void readFile() {
        try {
            Scanner scanner = new Scanner(new File(getFileName()));
            PointsCalculation pointsCalculation = new PointsCalculation();
            List<String[]> a = new ArrayList<>();
            while (scanner.hasNext()) {
                String data = scanner.nextLine();
                String[] values = data.split(";");
                a.add(values);
            }
            pointsCalculation.athleteCalc(a);
        } catch (FileNotFoundException e) {
            System.out.println("No file found");
        }
    }

    private String getFileName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input data file name with extension(examples: data.txt  input.csv):");
        return scanner.nextLine();
    }
}