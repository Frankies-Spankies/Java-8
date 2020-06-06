package Intro;

public class ConcatenateLambda {
    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (a, b) -> a + " " + b;
        System.out.println(concatenateInterface.sconcatenate("Hola", "Mundo"));
    }
}
