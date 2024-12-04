package org.example.solutionClasses;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.sampleClasses.FootballPlayer;

import java.io.File;
import java.io.IOException;

public class SerializeFootballPlayer {

    public static void handleFootballerSerialization(){

        FootballPlayer kanu = new FootballPlayer("kanu","midfielder",4);
        ObjectMapper mapper = new ObjectMapper();

        String path = "/Users/ladeologun/Downloads/jacksonObjectSerialization/src/main/resources/outfile.json";

        try {
            String jsonString = mapper.writeValueAsString(kanu);
            mapper.writeValue(new File(path), kanu);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
