package Empresa;

import java.util.Date;

public class Marketing extends Empleados{

    String horario;
    double sueldoFijo = 50000.0;

    public Marketing(int legajo, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion, String mail,  String horario) {
        super(legajo, nombre, apellido, fechaNacimiento, telefono, direccion, mail);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {

    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }


    @Override
    public double calcularSueldoBruto() {
        return sueldoFijo;
    }

    @Override
    public String toString() {
        return super.toString() + "Horario: " + horario + "\nSueldo neto: " + calcularSueldoNeto();
    }
}