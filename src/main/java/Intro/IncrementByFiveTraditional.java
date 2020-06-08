package Intro;

public class IncrementByFiveTraditional implements IncrementByFiveInterface {

    public Integer incrementByFive(int a) {
        return a+5;
    }
    
    public static void main(String[] args) {
        IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
        System.out.println(incrementByFiveTraditional.incrementByFive(2));
    }
}