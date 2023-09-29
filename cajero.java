
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
double saldo = 5400;
        System.out.println("Bienvenido al cajero automático.");
        String usuario=leer.nextLine();
        System.out.println("¿Qué operación desea realizar? " + usuario);
        System.out.println("1. Consultar saldo");
        System.out.println("2. Hacer un depósito");
        System.out.println("3. Hacer un retiro");

        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Su saldo actual es: $" + saldo);
                break;
            case 2:
                System.out.println("Ingrese la cantidad a depositar:");
                double deposito = leer.nextDouble();
                saldo += deposito;
                System.out.println("El deposito se a realizado con exito. El saldo actual es de : $" + saldo);
                break;
            case 3:
                System.out.println("¿Que cantidad desea retirar?:");
                double retiro = leer.nextDouble();
                if (retiro > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso, el saldo actual ahora es de: $" + saldo);
                }
                break;
            default:
                System.out.println("saldo insuficiente.");
                break;
        }
    }
}

