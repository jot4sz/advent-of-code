package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day {

    public List<String> readsInput(){
        List<String> lines = new ArrayList<>();
        try {

            FileReader file = new FileReader("src/main/resources/inputs/".concat(this.getClass().getPackageName() + "/").concat(this.getClass().getSimpleName().toLowerCase().concat(".txt")));
            BufferedReader readFile = new BufferedReader(file);

            String line = readFile.readLine();
            while (line != null){
                lines.add(line);
                line = readFile.readLine();
            }

            return lines;
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        return lines;
    }
}
