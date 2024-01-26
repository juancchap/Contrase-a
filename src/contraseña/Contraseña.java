package contraseña;

import java.util.Scanner;

public class Contraseña {

    public static void main(String[] args) {
        int Contraseña;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita una contraseña: ");
        Contraseña = entrada.nextInt();

        if (Contraseña == 2024) 
        {
            System.out.println(" Bienvenido al sistema ");
        } else 
        {
            System.out.println("Aceso denegado");
        }
    }

}
