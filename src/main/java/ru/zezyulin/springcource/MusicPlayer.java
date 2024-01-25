package ru.zezyulin.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
    public void playMusic(MusicGenre musicGenre){
        Random random=new Random();
        int randomNumber= random.nextInt(3);
        if (musicGenre==MusicGenre.CLASSICAL){
            System.out.println(classicalMusic.getSong().get(randomNumber));
        }
        else {
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
    }
}