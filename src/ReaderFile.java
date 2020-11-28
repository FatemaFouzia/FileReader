import java.io.*;

public class ReaderFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        BufferedReader bfr = null;
        try {
            FileReader fr = new FileReader(file);
            bfr = new BufferedReader(fr);

            String line;
            while ((line = bfr.readLine()) != null) ;
            {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file" + file.toString());
        }
        try {
            bfr.close();
        }
        catch (IOException e) {
            System.out.println("unable to close file" + file.toString());
        }


    }
}
