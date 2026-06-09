package com.example;

import java.util.List;

public interface FelineInterface {

    List<String> getFood(String animalKind) throws Exception;

    List<String> eatMeat() throws Exception;

    int getKittens();

}
