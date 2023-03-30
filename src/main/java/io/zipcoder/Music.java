package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int nextSong = 0;
        int lastSong = 0;
        for (int i  = startIndex; i<= playList.length; i++){
            if (i== playList.length){
                i=0;
            }
            nextSong++;
            if (playList[i] == selection){
                break;
            }
        }for (int j = startIndex; j>-1; j--){
            if (j == -1){
                j = playList.length -1;
            }
            lastSong++;
            if (playList[j] == selection){
                break;
            }
        }
        if (nextSong < lastSong){
            return nextSong;
        }else {
            return lastSong;
        }

    }
}
