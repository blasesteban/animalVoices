package com.codecool.animalvoices;

public class Cow extends Animal {
    private String voice = "muuu";

    @Override
    public String getVoice() {
        return voice;
    }

    @Override
    public void setVoice(String voice) {
        this.voice = voice;
    }
}
