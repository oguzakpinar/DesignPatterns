package adapterPattern.antipattern;

import adapterPattern.pattern.MediaAdapter;

public class MediaPlayerImpl implements MediaPlayer{
    AudioPlayer audioPlayer = new AudioPlayer();
    AdvancedMediaAdaptor mediaPlayer = new AdvancedMediaAdaptor();
    @Override
    public void play(String format, String fileName) {
        if("mp3".equals(format)) {
            audioPlayer.play(format, fileName);
        } else if("mp4".equals(format) || "vlc".equals(format)) {
            mediaPlayer.play(format, fileName);
        } else {
            System.out.println("Invalid media. avi format not supported");
        }
    }
}
