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
public class Comercio021 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        String nombreEmpresa; // Variable incorporada
        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;
        
        double productividad;
        double coeficiente = 0.6;
        double bono  = 0;
        
        // Variable para identificar la región mediante un número (menú)
        int region;
        double porcentajeSeguro = 0; 
        double adicionalSeguro;
        
        double sueldoFinal; 
        
        System.out.println("Ingrese el nombre de la empresa por favor");
        nombreEmpresa = entrada.nextLine();
        
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
        
        // Menú para seleccionar la región con una variable numérica
        System.out.println("Ingrese la región de procedencia:");
        System.out.println("1. Sierra");
        System.out.println("2. Costa");
        System.out.println("3. Oriente");
        System.out.println("4. Insular");
        region = entrada.nextInt();
        
        // Calcular la productividad
        productividad = numeroProductos * coeficiente;
        
        if (productividad <= 30){
            bono = 25; // $25
        } else {
            if (productividad > 30 && productividad < 80){
                bono = 50;
            } else {
                if (productividad >= 80 && productividad < 200) {
                    bono = 100;
                } else {
                    if (productividad >= 200 && productividad <= 500){
                        bono = 200;
                    } else {
                        bono = 300;
                    }
                }
            }
        }
        
        // Asignar el porcentaje del seguro según la opción numérica elegida
        if (region == 1) {
            porcentajeSeguro = 10; // Sierra
        } else {
            if (region == 2) {
                porcentajeSeguro = 12; // Costa
            } else {
                if (region == 3) {
                    porcentajeSeguro = 15; // Oriente
                } else {
                    if (region == 4) {
                        porcentajeSeguro = 30; // Insular
                    } else {
                        porcentajeSeguro = 8; 
                        /*
                        Le estamos dando el número 8 para darle si o si
                        un porcentaje al seguro si ha estado mal escrito o
                        el usuario es extranjero.
                        */
                    }
                }
            }
        }
       
        adicionalSeguro = (sueldoBasico * porcentajeSeguro) / 100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;
        
        System.out.printf("Reporte de Empresa: %s\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Opción de Región elegida: %d\n"
                + "Porcentaje de seguro: %.0f%%\n"
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
                region,
                porcentajeSeguro,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);
        }
    }
/*
De acuerdo a nueva normativa el porcentaje del seguro es variable, si el enviado
es de la Sierra, el porcentaje del seguro es 10%, Costa 12%, Oriente 15%, 
Insular 30%. Acoplar la solución para que considere la nueva normativa.
*/