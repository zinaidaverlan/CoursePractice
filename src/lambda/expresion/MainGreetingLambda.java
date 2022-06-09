package lambda.expresion;

public class MainGreetingLambda {
    public static void main(String[] args) {
        MyGreeting morningGreeting=(str) -> "Good morning "+str+"!";
        System.out.println(morningGreeting.processName("Eveline"));
    }
}
