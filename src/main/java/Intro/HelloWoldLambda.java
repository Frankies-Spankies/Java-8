package Intro;

public class HelloWoldLambda {
    public static void main(String[] args) {
        HelloWoldInterface helloWoldInterface = () ->  "Hola Mundo Lambda";
        
        System.out.println(helloWoldInterface.sayHello());
    }
    
}