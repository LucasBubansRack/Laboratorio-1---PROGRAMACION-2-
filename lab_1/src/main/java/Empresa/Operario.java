package Empresa;

import java.util.Date;

public class Operario extends Empleados{

    String area;
    String puesto;
    int horasTrabajadas;
    double valorHora = 120.0;


    public Operario(int legajo, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion, String mail, String area) {
        super(legajo, nombre, apellido, fechaNacimiento, telefono, direccion, mail); // 👈 clave
        this.area = area;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    @Override
    public double calcularSueldoBruto() {
        return horasTrabajadas * valorHora;
    }


    @Override
    public String toString() {
        return super.toString() + " Area: " + area + "Puesto: " + puesto + "Sueldo: " + calcularSueldoBruto();
    }
}
