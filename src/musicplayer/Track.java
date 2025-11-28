package musicplayer;

public class Track {
    private final String title;
    private final String artist;
    private final int duration;
    private final String filepath;

    public String getFormattedDuration() {
        long minutes = duration / 60;
        long seconds = duration % 60;

        return String.format("%02d:%02d", minutes, seconds);
    }

    public Track(String title, String artist, int Duration, String filepath) {
        this.title = title;
        this.artist = artist;
        this.duration = Duration;
        this.filepath = filepath;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public float getDuration() {
        return duration;
    }

    public String getFilepath() {
        return filepath;
    }

    @Override
    public String toString() {
        return  "Title = " + title + '\n' +
                "Artist(s) = " + artist + '\n' +
                "Duration = " + getFormattedDuration();
    }
}

