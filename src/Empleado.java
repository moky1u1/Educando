public class Empleado {
    private int codigoEmpleado;
    protected int cedula;
    protected String nombre;

    public Empleado(int codigoEmpleado, int cedula, String nombre) {
        this.codigoEmpleado = codigoEmpleado;
        this.cedula = cedula;
        this.nombre = nombre;
    }


    private int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    private void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
