package AdapterPattern;

/**
 * @Author
 * @Date 2023-08-11-10:49 pm
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlc file: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
