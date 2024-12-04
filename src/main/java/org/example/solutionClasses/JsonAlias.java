package org.example.solutionClasses;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.example.sampleClasses.Address;
import org.example.sampleClasses.Student;

public class JsonAlias {

    public static void useJsonAlias(){
        Address add = new Address("kumoluyi",13);
        Student student = new Student("lade",23,"maths","blue",add);
        String jsonString = "{\"name\":\"lade\",\"favoriteSubject\":\"maths\",\"houseColor\":\"blue\",\"address\":{\"streetName\":\"kumoluyi\",\"houseNumber\":13}}";
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            System.out.println(mapper.writeValueAsString(student));
            Student march = mapper.readValue(jsonString, Student.class);
            System.out.println(march.getFavoriteSubject());
            System.out.println(march.getAddress().getHouseNumber());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
