package Empresa;

import java.util.Date;

public class Vendedor extends Empleados{
    String medioVenta;
    double totalVentasMes;
    double sueldoBase = 30000.0;
    double comision = 0.002;



    public Vendedor(int legajo, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion, String mail, String medioVenta) {
        super(legajo, nombre, apellido, fechaNacimiento, telefono, direccion, mail);
        this.medioVenta = medioVenta;
    }

    @Override
    public double calcularSueldoBruto() {
        double sueldoComis = sueldoBase * comision;
        return (sueldoBase + sueldoComis);
    }

    @Override
    public String toString() {
        return super.toString() + "Medio Venta: " + medioVenta + "Total ventas mes: " + totalVentasMes + "Sueldo Base: " + sueldoBase + "Comision: " + sueldoBase*comision;
    }
}
