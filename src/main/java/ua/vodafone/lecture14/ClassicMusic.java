package ua.vodafone.lecture14;

public class ClassicMusic extends MusicStyles {
    private final String musician;
    private final String country;
    private final String songName;

    public ClassicMusic(String musician, String country, String songName) {
        this.musician = musician;
        this.country = country;
        this.songName = songName;
    }

    @Override
    public void playMusic() {
        System.out.println("Start playing '" + songName + "' from '" + musician + "' (" + country + ").");
    }
}
