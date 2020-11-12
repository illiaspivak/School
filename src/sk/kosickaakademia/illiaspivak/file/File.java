package sk.kosickaakademia.illiaspivak.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class File {
    public void copyFile(String fileName){
        BufferedReader reader;
        try {
            FileReader fread = new FileReader(fileName);

            File file = new File("otput/"+getFileName());
            file.createNewFile();

            FileWriter fwriter = new FileWriter( file );

            reader = new BufferedReader(fread);
            String line;
            while((line=reader.readLine())!=null){
                line=line,toUpperCase();
                System.out.println(Line);
                fwriter.write(line+'');
            }

        }
    }
}
