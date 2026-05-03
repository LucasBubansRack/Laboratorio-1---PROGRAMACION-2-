package Empresa;
import java.util.Date;

public class Vendedores extends Empleados {
    private String medioVenta;
    private double totalVentasMes;
    private double sueldoBase = 30000.0;
    private double comision = 0.002; // 0.2% es 0.002

    public Vendedores(int legajo, String nombre, String apellido, Date fecha, String tel, String dir, String mail, String medioVenta, double totalVentasMes) {
        // super le pasa los datos al constructor del padre (Empleados)
        super(legajo, nombre, apellido, fecha, tel, dir, mail);
        this.medioVenta = medioVenta;
        this.totalVentasMes = totalVentasMes;
    }

    @Override
    public double calcularSueldoBruto() {
        return sueldoBase + (totalVentasMes * comision);
    }
}
