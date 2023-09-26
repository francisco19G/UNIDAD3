import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad");
        int cantidad1=leer.nextInt();
        if (cantidad1 % 2 == 0){
        System.out.println("la cantidad ingresada " + cantidad1 +" es par");
        }else{
            System.out.println("la cantidad " + cantidad1 + " es una cantidad impar");
            leer.close();
        }
        
    }
}
