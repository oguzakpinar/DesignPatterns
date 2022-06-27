package adapterPattern.antipattern;

public class AdapterMain {
    public static void main(String[] args) {
        MediaPlayerImpl mediaPlayer = new MediaPlayerImpl();
        mediaPlayer.play("mp3", "beyond the horizon.mp3");
        mediaPlayer.play("mp4", "alone.mp4");
        mediaPlayer.play("vlc", "far far away.vlc");
        mediaPlayer.play("avi", "mind me.avi");
    }
}
