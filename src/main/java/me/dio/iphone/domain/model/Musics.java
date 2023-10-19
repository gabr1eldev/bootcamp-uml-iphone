package me.dio.iphone.domain.model;

import java.util.Map;

public class Musics {

    private Map<Integer,String> musics;

    public Map<Integer, String> getMusics() {
        return musics;
    }

    public void setMusics(Map<Integer, String> musics) {
        musics.put(1 , " - Oceans (Where Feet May Fail) - Hillsong UNITED - Live in Israel");
        musics.put(2 , " - Metallica: Nothing Else Matters");
        musics.put(3 , " - Audioslave - Like a Stone");
        musics.put(4 , " - Chris Cornell - Nothing Compares 2 U");
        musics.put(5 , " - Chris Stapleton - Tennessee Whiskey");
        musics.put(6 , " - Ben E King - Stand by Me");
        musics.put(7 , " - Elvis Presley - My Way (Aloha From Hawaii, Live in Honolulu, 1973)");
        musics.put(8 , " - Bon Jovi - Livin' On A Prayer");
    }
}
