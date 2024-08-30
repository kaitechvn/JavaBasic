package files;

import java.io.*;

public class FileProcessingExample {

    public static void main(String[] args) {
        String inputFile = "src/input.txt";
        String outputFile = "src/output.txt";

        try {
            // Reading from the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            // Writing to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line (for example, convert to uppercase)
                String processedLine = line.toLowerCase().trim();
                writer.write(processedLine);
                writer.newLine(); // Add a new line after each processed line
            }

            // Closing resources
            reader.close();
            writer.close();

            System.out.println("File processing completed successfully.");

        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: IO exception - " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: Unexpected exception - " + e.getMessage());
        }

        finally {
            System.out.println("Continue doing things");
        }
    }
}
