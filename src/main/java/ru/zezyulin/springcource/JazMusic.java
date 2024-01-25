package ru.zezyulin.springcource;

import java.util.ArrayList;
import java.util.List;

public class JazMusic implements Music{
    List<String> songs=new ArrayList<>();
    {
        songs.add("xxx");
        songs.add("sss");
    }
    @Override
    public List<String> getSong() {
        return songs;
    }
}
