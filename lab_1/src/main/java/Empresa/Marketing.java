package Empresa;

public class Marketing extends Empleados{

    String horario;
    double sueldoFijo = 50000.0;

    public Marketing() {
    }

    public Marketing(String horario, double sueldoFijo) {
        this.horario = horario;
        this.sueldoFijo = sueldoFijo;
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
}
