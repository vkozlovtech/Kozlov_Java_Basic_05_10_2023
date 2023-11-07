package ua.vodafone.lecture14.musicstyles;

public class ClassicMusic extends MusicStyles {
    private final String musician;
    private final String songName;

    public ClassicMusic(String musician, String country, String songName) {
        this.musician = musician;
        MusicStyles.country = country;
        this.songName = songName;
    }

    @Override
    public void playMusic() {
        System.out.println("Start playing '" + songName + "' from '" + musician + "' (" + country + ").");
    }
}
