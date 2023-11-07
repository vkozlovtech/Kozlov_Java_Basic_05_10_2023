package ua.vodafone.lecture14.musicstyles;

public class MusicRunner {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = {
                new PopMusic("BTS", "South Korea", "Wings"),
                new RockMusic("Bring Me The Horizon", "Great Britain", "That's the Spirit"),
                new ClassicMusic("Ludwig van Beethoven", "Germany", "Bagatelle No. 25")
        };
        for (MusicStyles style : musicStyles) {
            style.playMusic();
        }
    }
}
