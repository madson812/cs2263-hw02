package edu.isu.cs.cs2263;

import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class IOManager {
    private Gson gson = new Gson();

    //reference
    //Reader reader = Files.newBufferedReader(Paths.get(placeholder));

    public ArrayList<Student> readData(String file){
        try {
            FileReader reader = new FileReader(file);
            ArrayList<Student> students = new Gson().fromJson(reader, new com.google.common.reflect.TypeToken<ArrayList<Student>>() {}.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void writeData(String file, ArrayList<Student> students){
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            FileWriter finalWriter = writer;
            students.iterator().forEachRemaining((student) -> gson.toJson(student, finalWriter));
            finalWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
