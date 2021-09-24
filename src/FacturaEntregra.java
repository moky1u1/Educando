import java.util.Date;

public class FacturaEntregra extends Item {
    private int numeroEntrada;
    private int numeroFactura;
    private Date fecha;
    private int tottalBienes;
    private int valorTotal;

    public FacturaEntregra(int codItem, String nombredelBien, int cantidadSolicitada, double undidadMedida, double valorUnitario, double valorTotal, int cantidadDespachada, int numeroEntrada, int numeroFactura, Date fecha, int tottalBienes, int valorTotal1) {
        super(codItem, nombredelBien, cantidadSolicitada, undidadMedida, valorUnitario, valorTotal, cantidadDespachada);
        this.numeroEntrada = numeroEntrada;
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.tottalBienes = tottalBienes;
        this.valorTotal = valorTotal1;
    }

    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(int numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTottalBienes() {
        return tottalBienes;
    }

    public void setTottalBienes(int tottalBienes) {
        this.tottalBienes = tottalBienes;
    }

    @Override
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }
}
