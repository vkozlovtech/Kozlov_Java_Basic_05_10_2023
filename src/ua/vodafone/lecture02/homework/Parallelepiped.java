package ua.vodafone.lecture02.homework;

public class Parallelepiped {
    public static void main(String[] args) {
        int length = 12;
        int height = 10;
        int width = 8;
        System.out.println("Parallelepiped parameters: length " + length + "cm, height " + height + "cm, width " + width + "cm.");
        int volume = length * height * width;
        System.out.println("Volume of a parallelepiped = " + volume + "cm³.");
        int totalLength = 4 * (length + height + width);
        System.out.println("The total length of the sides of the parallelepiped = " + totalLength + "cm.");
    }
}
