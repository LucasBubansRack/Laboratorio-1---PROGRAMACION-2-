package Empresa;

import java.util.Date;

public class Operario extends Empleados{

    String area;
    String puesto;
    int horasTrabajadas;
    double valorHora;

    public Operario() {

    }

    public Operario(String area, String puesto, int horasTrabajadas, double valorHora) {
        this.area = area;
        this.puesto = puesto;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public Operario(int legajo, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion, String mail, String area, String puesto, int horasTrabajadas, double valorHora) {
        super(legajo, nombre, apellido, fechaNacimiento, telefono, direccion, mail); // 👈 clave
        this.area = area;
        this.puesto = puesto;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
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
    public double calcularSueldoNeto() {
        return super.calcularSueldoNeto();
    }

   @Override
    public String toString() {
        return super.toString() + "Area de Trabajo: " + area + "\nPuesto: " + puesto  + "\nHoras trabajadas: " + horasTrabajadas + "\nValor por hora: " + valorHora + "\nSueldo: " + calcularSueldoNeto();
    }
}
