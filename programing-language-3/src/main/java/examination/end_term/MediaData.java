package examination.end_term;

abstract class MediaData {
    protected String title;

    public abstract void play();
}

class MusicData extends MediaData {
    MusicData(String title) {
        super.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing the music: " + title);
    }
}

class VideoData extends MediaData {
    VideoData(String title) {
        super.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing the video: " + title);
    }
}

class PlayList {
    private MediaData[] components = new MediaData[128];
    private int num = 0;

    void add(MediaData data) {
        components[num] = data;
        num++;
    }

    void playAll() {
        for (int i = 0; i < num; i++) {
            components[i].play();
        }
    }
}
