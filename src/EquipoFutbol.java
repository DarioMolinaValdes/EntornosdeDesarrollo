
import java.util.*;

public class EquipoFutbol {

    private String nombre;
    private List<Empleado> empleados;
    private double presupuesto;

    public EquipoFutbol(String n, double p) {
        nombre = n;
        presupuesto = p;
        empleados = new ArrayList<Empleado>();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void addEmpleados(Empleado e) {
        empleados.add(e);
    }

    public void pagarSueldoEmpleados() throws CabreoException {
        boolean presupuestoInsuficiente = false;
        for (Empleado i : empleados) {
            if (presupuesto < 0 && !presupuestoInsuficiente) {
                int jugadoresRestantes = empleados.size();
                double sueldoDividido = presupuesto / jugadoresRestantes;
                System.out.println("No hay presupuesto suficiente para pagar a todos los empleados."
                        + " Se dividirá el presupuesto restante de " + presupuesto + " entre " 
                        + jugadoresRestantes + " empleados y se les abonará " + sueldoDividido + " a cada uno.");
                presupuestoInsuficiente = true;
            }
            if (i instanceof EmpleadoPrimable ep) {
                double sueldo = i.getSueldo();
                i.cobrar((sueldo * 1.10));
                presupuesto = -(sueldo * 1.10);
            }

            double sueldo = i.getSueldo();
            i.cobrar(sueldo);
            presupuesto = -sueldo;
        }
    }
}
