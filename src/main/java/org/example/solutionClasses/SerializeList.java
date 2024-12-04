package org.example.solutionClasses;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class SerializeList {

    public static void handleSerializeList(){
        List<String> carModels = new ArrayList<>();
        carModels.add("benz");
        carModels.add("volve");
        carModels.add("volkswage");

        ObjectMapper mapper = new ObjectMapper();
        try {
            String models = mapper.writeValueAsString(carModels);
            System.out.println(models);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
