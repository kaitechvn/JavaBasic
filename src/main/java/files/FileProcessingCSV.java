package files;

import java.io.*;

public class FileProcessingCSV {

    public static void main(String[] args) {

        String inputFile = "src/input.csv";
        String outputFile = "src/output.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                try {
                    // Process each line
                    String[] parts = line.split(",");
                    if (parts.length != 3) {
                        System.err.println("Skipping malformed line " + lineNumber + ": " + line);
                        continue;
                    }

                    String name = parts[0].trim();

                    int age;
                    try {
                        age = Integer.parseInt(parts[1].trim());
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid age format on line " + lineNumber + ": " + parts[1].trim());
                        continue;
                    }

                    String city = parts[2].trim();
                    String country = "USA";

                    // Filter by age
                    if (age >= 21) {
                        // Write to output file
                        writer.write(name + ", " + age + ", " + city + ", " + country);
                        writer.newLine();
                    }
                } catch (Exception e) {
                    System.err.println("Error processing line " + lineNumber + ": " + e.getMessage());
                }
            }

            System.out.println("File processing completed. Check " + outputFile);
        } catch (IOException e) {
            System.err.println("An error occurred during file processing: " + e.getMessage());
        }
    }
}
