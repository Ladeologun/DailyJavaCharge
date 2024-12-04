package org.example.solutionClasses;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.sampleClasses.FootballPlayer;

public class DeserializeFootballPlayer {

    public static void  handleFootballerDeserialization(){
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\":\"kanu\",\"position\":\"midfielder\",\"jerseyNumber\":4}";

        try {
            FootballPlayer footballer = mapper.readValue(jsonString, FootballPlayer.class);
            System.out.println(footballer.getJerseyNumber());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
