import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//create program that asks name when given the names alice and bob print a greeting
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("What is thou name");

        name = input.next();

        if(name.equalsIgnoreCase("Alice")){
            System.out.println("Salutations " + name);
        }else if(name.equalsIgnoreCase("Bob")){
            System.out.println("Salutations " + name);
        }else{
            System.out.println("Fuck off");
        }
    }
}