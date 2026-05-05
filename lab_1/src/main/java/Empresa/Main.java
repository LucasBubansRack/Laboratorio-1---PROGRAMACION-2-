package Empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Empleados empOper[] = new Empleados[10];
        Empleados empMark[] = new Empleados[2];
        Empleados empVend[] = new Empleados[3];

        System.out.println("Iniciando empresa...");

        for (int i = 0; i < empOper.length; i++) {
            System.out.println("[" + i + "]_Empleado:\n\n");
            System.out.print("Legajo: ");
            in = new Scanner(System.in);
            
            System.out.print("Nombre: " + empOper[i].getNombre());
            sc = new Scanner(System.in);
            System.out.print("Apellido: " + empOper[i].getApellido());
            System.out.print("Fecha de nacimiento: " + empOper[i].getFechaNacimiento());
            System.out.print("Telefono: " + empOper[i].getTelefono());
            System.out.print("Direccion: " + empOper[i].getDireccion());
            System.out.print("Mail: " + empOper[i].getMail());
        }







    }



}
