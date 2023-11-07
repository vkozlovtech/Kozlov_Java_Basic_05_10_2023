package ua.vodafone.lecture14;

public class PopMusic extends MusicStyles {

    private final String bandName;
    private final String country;
    private final String albumName;

    public PopMusic(String bandName, String country, String albumName) {
        this.bandName = bandName;
        this.country = country;
        this.albumName = albumName;
    }

    @Override
    public void playMusic() {
        System.out.println("Start playing album '" + albumName + "' from '" + bandName + "' (" + country + ").");
    }
}
