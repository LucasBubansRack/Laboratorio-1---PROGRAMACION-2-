package Empresa;

/*La empresa MEG Insumos S.A. solicita el desarrollo de una aplicación para que el contador pueda liquidar los sueldos cada mes.
La empresa tiene diferentes tipos de empleados, a saber, 10 operarios, 2 encargados del marketing, posicionamiento web y en redes sociales, y 3 vendedores.
Cada empleado cumple diferentes cargas horarias, responsabilidades y por ende tiene diferencias en sus sueldos.
Los operarios tienen un valor fijo por hora, se registran sus horas trabajadas en el mes y se les paga por ellas.
Los empleados de marketing tienen un sueldo fijo.
Los vendedores tienen un sueldo fijo base y una comisión del 0,2% del total de ventas del mes.
La aplicación debe permitir cargar cada empleado con sus datos (legajo, apellido, nombre, fecha nacimiento, teléfono, dirección y mail), para los operarios se deberá registrar área, puesto, horas trabajadas y el valor por hora
 que es $120. Para los empleados de marketing se registrara horario (ya que uno trabaja de 7am a 3pm y el otro de 1pm a 9pm), siendo su sueldo bruto fijo de $50000. Para los vendedores se registrara su medio de venta
 (presencial, web, telefónico) y la suma de las ventas del mes, su sueldo base es de $30000.
La aplicación también permitirá mostrar toda la información registrada y realizar el calculo del sueldo neto para cada empleado aplicando los descuentos correspondientes (Jubilación 11%, PAMI 3%, Obra Social 3%,
Cuota sindical 2%) para luego mostrarlo.
 */


import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Empleados {
    // atributos protected para que las subclases los vean
    protected int legajo;
    protected String nombre;
    protected String apellido;
    protected Date fechaNacimiento;
    protected String telefono;
    protected String direccion;
    protected String mail;

    public abstract double calcularSueldoBruto();

    public Empleados() {

    }

    // constructor para usar las subclases
    public Empleados(int legajo, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion, String mail) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mail = mail;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMail() {
        return mail;
    }

    //public double calcularSueldoBruto(); // no lleva llaves porque la logica la pongo en cada hijo

    public double calcularDescuentos() {
        // todos descuentan el 19% (0.11 + 0.03 + 0.03 + 0.02)
        return this.calcularSueldoBruto() * 0.19;
    }

    // sueldoBruto - el descuento
    public double calcularSueldoNeto() {
        double bruto = calcularSueldoBruto();
        return bruto * 0.81;
    }

    @Override
    public String toString() {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        return "\nLegajo: " + getLegajo() +
                "\nNombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nFecha de nacimiento: " + formato.format(getFechaNacimiento()) +
                "\nTelefono: " + getTelefono() +
                "\nDireccion: " + getDireccion() +
                "\nMail: " + getMail() + "\n";
    }

}