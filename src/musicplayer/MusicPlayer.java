package musicplayer;

import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;

public class MusicPlayer {

    private Track[] tracks;
    private Clip clip;
    private String status;
    private AudioInputStream audioInputStream;
    private int trackNumber;
    private boolean loop;
    private Scanner scanner;
    private boolean uiNeedsRefresh = false;
    private boolean manualSkip;

    public MusicPlayer() throws Exception {
        scanner = new Scanner(System.in);
        status = "paused";
        loop = false;
        trackNumber = 0;
        manualSkip = false;

        tracks = new Track[]{
                new Track("Walk On Water", "NCT, Southby, Emily J", 220, "src/musicplayer/walkonwater.wav"),
                new Track("Harinezumi", "waera", 117, "/home/ares/Music/harinezumi.aiff"),
                new Track("Heroes Tonight", "Janji, Johnning", 208, "/home/ares/Music/heroestonight.wav")
        };

        loadClip();
    }

    private void loadClip() throws Exception {

        audioInputStream = AudioSystem.getAudioInputStream(
                new File(tracks[trackNumber].getFilepath())
        );

        clip = AudioSystem.getClip();

        clip.addLineListener(event -> {
            if (!loop && event.getType() == LineEvent.Type.STOP && !status.equals("paused")) {
                if(manualSkip) {
                    manualSkip = false;
                    return;
                }
                try {
                    nextTrackInternal();
                    uiNeedsRefresh = true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        clip.open(audioInputStream);
    }

    private void nextTrackInternal() throws Exception {
        trackNumber = (trackNumber + 1) % tracks.length;
        loadClip();
        play();
    }

    public void nextTrack() throws Exception {
        manualSkip = true;
        clip.stop();
        nextTrackInternal();
    }

    public void prevTrack() throws Exception {
        manualSkip = true;
        clip.stop();
        trackNumber = (trackNumber - 1 + tracks.length) % tracks.length;
        loadClip();
        play();
    }

    public void play() {
        clip.start();
        status = "play";
    }

    public void pause() {
        if (status.equals("paused")) return;
        clip.stop();
        status = "paused";
    }

    public void stop() {
        clip.stop();
        status = "paused";
    }

    public void restart() throws Exception {
        status = "paused";
        clip.stop();
        clip.setFramePosition(0);
        play();
    }

    public void repeat() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        loop = true;
    }

    public void noRepeat() {
        clip.loop(0);
        loop = false;
    }

    public void render() {
        System.out.println("------------ Music Player ------------");
        System.out.println("Track #" + trackNumber);
        System.out.println(tracks[trackNumber]);
        System.out.println("--------------------------------------");
        System.out.println("1. " + (status.equals("play") ? "Pause" : "Play"));
        System.out.println("2. Restart");
        System.out.println("3. Stop");
        System.out.println("4. " + (loop ? "No Repeat" : "Repeat"));
        System.out.println("5. Next");
        System.out.println("6. Previous");
        System.out.println("7. Exit");
        System.out.println("--------------------------------------");
        System.out.print("Choice: ");
    }

    public void handleInput() throws Exception {
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> { if (status.equals("play")) pause(); else play();}
            case 2 -> restart();
            case 3 -> stop();
            case 4 -> { if (loop) noRepeat(); else repeat();}
            case 5 -> nextTrack();
            case 6 -> prevTrack();
            case 7 -> System.exit(0);
            default -> System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) throws Exception {

        MusicPlayer player = new MusicPlayer();

        while (true) {
            if (player.uiNeedsRefresh) {
                player.uiNeedsRefresh = false;
                player.render();
                continue;
            }

            player.render();
            player.handleInput();
        }
    }
}
