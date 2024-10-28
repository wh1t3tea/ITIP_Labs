import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    static final String fileToRead = "input.txt";
    static final String fileToWrite = "output.txt";

    public static void main(String[] args) {
        String toSave = "";
        try {
        Scanner scanner = new Scanner(new File(fileToRead));
        while (scanner.hasNextLine()) {
            toSave += scanner.nextLine() + "\n";
        }

        FileWriter toWrite = new FileWriter(fileToWrite);
        toWrite.write(toSave);
        toWrite.close();
        
        }catch (FileNotFoundException e){
            System.err.println("Ошибка открытия:" + e);
        }catch (IOException e) {
            System.err.println("Ошибка закрытия:" + e);
        }
        
    }
}

