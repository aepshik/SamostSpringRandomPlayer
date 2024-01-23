package ru.zezyulin.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        //MusicPlayer musicPlayer=new MusicPlayer(music);
        musicPlayer.playMusicList();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
