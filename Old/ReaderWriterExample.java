import java.io.*;

public class ReaderWriterExample {
    public static void main(String[] args) {
        // Define the file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Try-with-resources to automatically close the streams
        try (
                // Create a FileReader to read from the input file
                FileReader fileReader = new FileReader(inputFile);
                // Create a FileWriter to write to the output file
                FileWriter fileWriter = new FileWriter(outputFile)) {
            // Create a BufferedReader to efficiently read characters from the input file
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // Create a BufferedWriter to efficiently write characters to the output file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Read each line from the input file and write it to the output file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add a newline character after each line
            }

            System.out.println("File successfully copied.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
