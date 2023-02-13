
public class CuerpoTecnico extends Empleado{
    private String puesto;

    public CuerpoTecnico(String n, double s, String p) {
        super(n, s);
        puesto=p;
    }

    public String getPuesto() {
        return puesto;
    }
    
}
