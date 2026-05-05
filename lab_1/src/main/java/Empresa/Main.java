package Empresa;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //Scanner in = new Scanner(System.in);
        Empleados[] empOper = new Empleados[1];
        Empleados[] empMark = new Empleados[1];
        Empleados[] empVend = new Empleados[1];


        JOptionPane.showMessageDialog(null, "Iniciando empresa...");

        //////// OPERARIOS //////////

        int cant = empOper.length;
        for (int i = 0; i < empOper.length; i++) {
            empOper[i] = cargarOperario(i, cant);
            cant--;
        }

        ////// MARKETING ///////
        cant = empMark.length;
        for (int i = 0; i < empMark.length; i++) {
            empMark[i] = cargarMarketing(i, cant);
            cant--;
        }

        ////////// VENDEDOR //////////
        cant = empVend.length;
        for (int i = 0; i < empVend.length; i++) {
            empVend[i] = cargarVenderor(i, cant);
            cant--;
        }

        ///////// MUESTRA DE DATOS DE LOS EMPLEADOS ///////////
        for (Empleados empleados : empOper) {
            System.out.println(empleados);
        }

        for (Empleados empleados : empMark) {
            System.out.println(empleados);
        }

        for (Empleados empleados : empVend) {
            System.out.println(empleados);
        }

    }

    public static Operario cargarOperario(int i, int cant){
        int legajo;
        String apellido, nombre, telefono, direccion, mail;

        JOptionPane.showMessageDialog(null, "Ingrese los datos del empleado " + (i+1));

        legajo = Integer.parseInt(JOptionPane.showInputDialog("OPERARIO " + cant +"\nLegajo"));
        nombre = JOptionPane.showInputDialog("OPERARIO " + cant +"\nNombre");
        apellido = JOptionPane.showInputDialog("OPERARIO " + cant +"\nApellido");

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;

        try {
            fechaNacimiento = format.parse(
                    JOptionPane.showInputDialog("OPERARIO " + cant +"\nFecha de nacimiento (dd/MM/yyyy)")
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto");
        }

        telefono = JOptionPane.showInputDialog("OPERARIO " + cant +"\nTelefono");
        direccion = JOptionPane.showInputDialog("OPERARIO " + cant +"\nDireccion");
        mail = JOptionPane.showInputDialog("OPERARIO " + cant +"\nMail");
        String area = JOptionPane.showInputDialog("OPERARIO " + cant +"\nArea");
        String puesto = JOptionPane.showInputDialog("OPERARIO " + cant +"\nPuesto");
        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("OPERARIO " + cant +"\nHoras Trabajadas"));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("OPERARIO " + cant +"\nValor de hora"));

        return new Operario(legajo, nombre, apellido, fechaNacimiento, telefono, direccion, mail, area, puesto, horasTrabajadas, valorHora);
    }

    public static Empleados cargarMarketing(int i,  int cant) {
        int legajo;
        String apellido, nombre, telefono, direccion, mail;

        JOptionPane.showMessageDialog(null, "Ingrese los datos del empleado " + (i+1));

        legajo = Integer.parseInt(JOptionPane.showInputDialog("Emp_MARKETING " + cant +"\nLegajo"));
        nombre = JOptionPane.showInputDialog("Emp_MARKETING " + cant +"\nNombre");
        apellido = JOptionPane.showInputDialog("Emp_MARKETING " + cant +"\nApellido");

                ////////// PIDO LA FECHA DE  NACIMIENTO /////////////
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;

        try {
            fechaNacimiento = format.parse(
                    JOptionPane.showInputDialog("Emp_MARKETING " + cant +"\nFecha de nacimiento (dd/MM/yyyy)")
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto");
        }
        telefono = JOptionPane.showInputDialog("Emp_MARKETING " + cant +"\nTelefono");
        direccion = JOptionPane.showInputDialog("Emp_MARKETING " + cant +"\nDireccion");
        mail = JOptionPane.showInputDialog("Emp_MARKETING " + cant +"\nMail");
        String horario = JOptionPane.showInputDialog("Emp_MARKETING " + cant +"\nHorario");

        return new Marketing(legajo, nombre, apellido, fechaNacimiento, telefono, direccion, mail, horario);
    }

    public static Empleados cargarVenderor(int i,  int cant) {
        int legajo;
        String apellido, nombre, telefono, direccion, mail;

        JOptionPane.showMessageDialog(null, "Ingrese los datos del empleado " + (i+1));

        legajo = Integer.parseInt(JOptionPane.showInputDialog("VENDEDOR " + cant +"\nLegajo"));
        nombre = JOptionPane.showInputDialog("VENDEDOR " + cant +"\nNombre");
        apellido = JOptionPane.showInputDialog("VENDEDOR " + cant +"\nApellido");

        ////////// PIDO LA FECHA DE  NACIMIENTO /////////////
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;

        try {
            fechaNacimiento = format.parse(
                    JOptionPane.showInputDialog("VENDEDOR " + cant +"\nFecha de nacimiento (dd/MM/yyyy)")
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto");
        }
        telefono = JOptionPane.showInputDialog("VENDEDOR " + cant +"\nTelefono");
        direccion = JOptionPane.showInputDialog("VENDEDOR " + cant +"\nDireccion");
        mail = JOptionPane.showInputDialog("VENDEDOR " + cant +"\nMail");
        String medioVenta = JOptionPane.showInputDialog("VENDEDOR " + cant +"\nMedio Venta");
        double ventasDelMes = Double.parseDouble(JOptionPane.showInputDialog("VENDEDOR " + cant +"\nTotal ventas del Mes"));

        return new Vendedor(legajo, nombre, apellido, fechaNacimiento, telefono, direccion, mail, medioVenta, ventasDelMes);
    }

}