package adapterPattern.antipattern;

public class AdapterMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");

        AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();
        advancedMediaPlayer.playMp4("alone.mp4");

        advancedMediaPlayer.playVlc("far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
