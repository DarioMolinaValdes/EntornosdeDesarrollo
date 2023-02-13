
public class EmpleadoPrimable extends Empleado{
    private boolean primable;

    public EmpleadoPrimable(String n, double s){
        super(n, s);
        primable=true;
    }
    public boolean esPrimado(){
        return primable;
    }
}
