package View;
import java.util.Scanner;
import Model.Empleado;
public class EmpleadoView {
    private Scanner sc = new Scanner(System.in);
    public Empleado capturarDatos() {
        System.out.println("Nombre del empleado:");
        String nombre = sc.nextLine();
        System.out.println("Horas trabajadas:");
        int horas = sc.nextInt();
        System.out.println("Pago por hora:");
        double pagoHora = sc.nextDouble();
        sc.nextLine();
        return new Empleado(nombre, horas, pagoHora);
    }

    public void mostrarResultado(Empleado empleado) {
        System.out.println("\nEmpleado: " + empleado.getNombre());
        System.out.println("Salario calculado: $" + empleado.calcularSalario());
        System.out.println(empleado.clasificarSalario());
    }

    public void cerrarScanner() {
        sc.close();
    }
}
