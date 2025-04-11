//This line defines a class named Main. In Java, everything must be inside a class.
//What is main()?It's the entry point of every Java application. When you run your program,
// Java looks for this method first and starts executing from here
public class Main {
    //This is a method called go that takes an integer age as a parameter.
    //  INCLUDE VOID BECAUSE IT WILL NOT RETURN ANYTHING
    public static void go(int age){
        if(age >= 18){
            System.out.println("GO VOTE!!!");
        }else{
            System.out.println("GO PLAY");
        }
    }

    public static void respond(char answer){
        if(answer == 'Y' || answer == 'y'){
            System.out.println("YUP YUP YUP");
        }else{
            System.out.println("NOPE NOPE NOPE");
        }
    }

    public static void drink(int age) {
        if(age < 21){
            System.out.println("juice");
        }else if(age < 50) {
            System.out.println("adult beverage");
        }else if(age < 77) {
            System.out.println("tea");
        }else{
            System.out.println("heavy beverage");
        }
    }
   // The main method — this is where the program starts. args is a list of command-line arguments.
    public static void main(String[] args) {
        drink(11); // juice
        drink(25); // adult beverage
        drink(51); // tea
        drink(99); // heavy beverage

        for(String a : args) {
            System.out.println(a);
        }

        go(13);
        go(21);

        respond('Y');
        respond('N');

    }
}