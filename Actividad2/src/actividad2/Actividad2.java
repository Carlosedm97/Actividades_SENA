/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2;

import java.util.Scanner;

/**
 *
 * @author Carlos Lopez
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre_cliente, nombre_producto1, nombre_producto2, nombre_producto3;
        int valor_unitario1, valor_unitario2, valor_unitario3, cant_1, cant_2, cant_3, valor_total, total1, total2, total3;
        
        // Peticion de datos por pantalla...
        System.out.print("Nombre del cliente: ");
        nombre_cliente = sc.nextLine();
        
        System.out.print("Nombre produto 1: ");
        nombre_producto1 = sc.nextLine();
        System.out.print("Valor unitario producto 1: ");
        valor_unitario1 = sc.nextInt();
        System.out.print("Cantidad producto 1: ");
        cant_1 = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nombre producto 2: ");
        nombre_producto2 = sc.nextLine();
        System.out.print("Valor unitario producto 2: ");
        valor_unitario2 = sc.nextInt();
        System.out.print("Cantidad producto 2: ");
        cant_2 = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nombre producto 3: ");
        nombre_producto3 = sc.nextLine();
        System.out.print("Valor unitario producto 3: ");
        valor_unitario3 = sc.nextInt();
        System.out.print("Cantidad producto 3: ");
        cant_3 = sc.nextInt();
        
        // Calculos...
        total1 = valor_unitario1 * cant_1;
        total2 = valor_unitario2 * cant_2;
        total3 = valor_unitario3 * cant_3;
        valor_total = total1 + total2 + total3;
        
        // Salida de datos...
        
        System.out.println(" ");
        System.out.println("Nombre cliente: "+ nombre_cliente);
        System.out.println("Producto         Valor unitario         Cantidad         Valor total");
        System.out.println(nombre_producto1 + "            $" + valor_unitario1 + "                  " + cant_1 + "                $" + total1);
        System.out.println(nombre_producto2 + "            $" + valor_unitario2 + "                  " + cant_2 + "                $" + total2);
        System.out.println(nombre_producto3 + "      $" + valor_unitario3 + "                  " + cant_3 + "                $" + total3);
        System.out.println("                                        Total            $" + valor_total);
    }
    
}
