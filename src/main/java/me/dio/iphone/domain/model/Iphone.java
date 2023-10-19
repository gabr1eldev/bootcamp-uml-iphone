package me.dio.iphone.domain.model;

public class Iphone {
    //Repodutor Musicial: tocar, pausar, selecionarMusica

    private boolean play;
    private Musics selectMusic;
    private String volume;

    public String isPlay() {
        if(this.play) {
            return "Play the Music";
        } else {
            return "Stop the Music";
        }
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public void getSelectMusic() {
        for(Integer music : selectMusic.getMusics().keySet()){
            System.out.println(selectMusic.getMusics().get(music));
        }
    }

    public void setSelectMusic(Integer select) {
        this.selectMusic.getMusics().get(select);
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
