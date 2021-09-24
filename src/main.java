import java.util.Calendar;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado(011,101505,"Miguel Siles");

        Solicitud solicitud = new Solicitud(011, empleado.cedula, empleado.nombre, 1, Calendar.getInstance().getTime(),"sadasd","dsadasdsdasdasd");

        Item item = new Item(0111,"papel",20,20,2.5,50,20);

        FacturaEntregra facturaEntregra = new FacturaEntregra(item.getCodItem(),item.nombredelBien,item.cantidadSolicitada,item.undidadMedida,item.valorUnitario,item.valorTotal,item.cantidadDespachada,1,024564,Calendar.getInstance().getTime(),1, (int) item.valorTotal);

        System.out.println("Responsable de la solicitud: " + solicitud.nombre + ", CI: " + solicitud.cedula + ", Fecha de Solicictud: " + solicitud.getFechaSolicitud()+", " +"numero de solicictud: " + solicitud.getNumeroSolicitud() +", Centro de Costos: " + solicitud.getCentroCostos() + ", Rubro Presupuestal: "+ solicitud.getRubropresupusetal() );
        System.out.println(" ");
        System.out.println("Item: "+ item.nombredelBien + ", Cantidad Solicitada: "+ item.cantidadSolicitada + ", Unidad Media: " + item.undidadMedida + ", Valor unitario: "+ item.valorUnitario + ", Valor Total:" + item.valorTotal + ", Cantidad Despachada: "+ item.cantidadDespachada + facturaEntregra.getNumeroEntrada() );
    }
}
