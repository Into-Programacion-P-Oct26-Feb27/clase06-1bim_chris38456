/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Comercio012 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2

        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;

        double productividad;
        double coeficiente = 0.6;
        double bono = 0;

        double porcentajeSeguro = 8;
        double adicionalSeguro;

        double sueldoFinal;
        
        String nombreEmpresa;

        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();

        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();

        System.out.println("Ingrese el número de productos vendidos por favor");
        numeroProductos = entrada.nextInt();
        
        // Limpiar el búfer del Scanner después de leer un número entero
        entrada.nextLine(); 

        System.out.println("Ingrese el nombre de la empresa por favor");
        nombreEmpresa = entrada.nextLine();

        // Calcular la productividad
        productividad = numeroProductos * coeficiente;

        adicionalSeguro = (sueldoBasico * porcentajeSeguro) / 100;

        // Estructura de condiciones para calcular el bono y sueldo final
        if (productividad <= 30) {
            bono = 25;
        } else {
            if (productividad > 30 && productividad < 80) {
                bono = 50;
            } else {
                if (productividad >= 80 && productividad < 200) {
                    bono = 100;
                } else {
                    if (productividad >= 200 && productividad <= 500) {
                        bono = 200;
                    } else {
                        bono = 300;
                    }
                }
            }
        }

        // Cálculo del sueldo final con base en el bono obtenido
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;

        // Impresión única del reporte para evitar repetir código
        System.out.printf("\nReporte de Empleado %s\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductividad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n",
                nombreEmpresa,
                nombre,
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);

        entrada.close();
    }
}
