package Intro;

public class HelloWorldTraditional implements HelloWoldInterface{

    @Override
    public String sayHello() {
        return "Hola Mundo";
    }

    public static void main(String[] args) {
        HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional(); 
        System.out.println(helloWorldTraditional.sayHello());
    }
    
} 