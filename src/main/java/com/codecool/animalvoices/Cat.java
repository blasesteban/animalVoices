package com.codecool.animalvoices;

public class Cat extends Animal {
    private String voice = "miau";

    @Override
    public String getVoice() {
        return voice;
    }

    @Override
    public void setVoice(String voice) {
        this.voice = voice;
    }
}
