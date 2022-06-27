package adapterPattern.antipattern;

public class AdvancedMediaAdaptor implements MediaPlayer{
    AdvancedMediaPlayer player = new AdvancedMediaPlayer();

    @Override
    public void play(String format, String fileName) {
        if("vlc".equals(format)) {
            player.playVlc(fileName);
        } else if("mp4".equals(format)) {
            player.playMp4(fileName);
        }
    }
}
