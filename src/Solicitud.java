import java.util.Date;

public class Solicitud extends Empleado {
    private int numeroSolicitud;
    private Date fechaSolicitud;
    private String centroCostos;
    private String rubropresupusetal;

    public Solicitud(int codigoEmpleado, int cedula, String nombre, int numeroSolicitud, Date fechaSolicitud, String centroCostos, String rubropresupusetal) {
        super(codigoEmpleado, cedula, nombre);
        this.numeroSolicitud = numeroSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.centroCostos = centroCostos;
        this.rubropresupusetal = rubropresupusetal;
    }

    public int getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(int numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getCentroCostos() {
        return centroCostos;
    }

    public void setCentroCostos(String centroCostos) {
        this.centroCostos = centroCostos;
    }

    public String getRubropresupusetal() {
        return rubropresupusetal;
    }

    public void setRubropresupusetal(String rubropresupusetal) {
        this.rubropresupusetal = rubropresupusetal;
    }
}



