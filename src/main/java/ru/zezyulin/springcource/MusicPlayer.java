package ru.zezyulin.springcource;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private int volume;
    private String name;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void playMusicList(){
        for (Music music:musicList){
            System.out.println("Playing: " + music.getSong());
        }
    }
}
