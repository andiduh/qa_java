package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private FelineInterface feline;

    public Lion(FelineInterface feline) {
        this.feline = feline;
        hasMane = false;
    }

    public Lion(FelineInterface feline, String sex) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
