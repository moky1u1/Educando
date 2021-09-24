public class Item {
    private int codItem;
    protected String nombredelBien;
    protected int cantidadSolicitada;
    protected double undidadMedida;
    protected double valorUnitario;
    protected double valorTotal;
    protected int cantidadDespachada;

    public Item(int codItem, String nombredelBien, int cantidadSolicitada, double undidadMedida, double valorUnitario, double valorTotal, int cantidadDespachada) {
        this.codItem = codItem;
        this.nombredelBien = nombredelBien;
        this.cantidadSolicitada = cantidadSolicitada;
        this.undidadMedida = undidadMedida;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.cantidadDespachada = cantidadDespachada;
    }


    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public String getNombredelBien() {
        return nombredelBien;
    }

    public void setNombredelBien(String nombredelBien) {
        this.nombredelBien = nombredelBien;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public double getUndidadMedida() {
        return undidadMedida;
    }

    public void setUndidadMedida(double undidadMedida) {
        this.undidadMedida = undidadMedida;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getCantidadDespachada() {
        return cantidadDespachada;
    }

    public void setCantidadDespachada(int cantidadDespachada) {
        this.cantidadDespachada = cantidadDespachada;
    }
}
