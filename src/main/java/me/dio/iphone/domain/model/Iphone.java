package me.dio.iphone.domain.model;

import me.dio.iphone.domain.interfaces.Internet;

public class Iphone implements Internet {
    //Repodutor Musicial: tocar, pausar, selecionarMusica

    private boolean play;
    private Musics selectMusic;
    private Integer volume;

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

    public Integer getVolume() {
        if(this.volume.equals("+")) {
            return this.volume++;
        } else {
            return this.volume--;
        }
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String showPage() {
        return "Show the page";
    }

    public String addNewTab() {
        return "Add new Tab";
    }

    public String updatePage() {
        return "Update the page";
    }
}
