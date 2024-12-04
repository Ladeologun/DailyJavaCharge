package org.example.sampleClasses;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name;
    @JsonIgnore
    private Integer age = 12;
    @JsonAlias({"fav_subject"})
    private String favoriteSubject;
    private String houseColor;

    private Address address;

    public Student(String name, Integer age){
        this.name = name;
        this.age = age;

    }
}
