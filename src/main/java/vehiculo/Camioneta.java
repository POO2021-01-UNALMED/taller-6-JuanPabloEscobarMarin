package vehiculo;

public class Camioneta extends Vehiculo {
    Boolean volco;
    static int fabricados;
    public   Camioneta(String placa, String nombre, int precio, int peso,int puertas,Fabricante fabricante, boolean volco){
        super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
        this.volco=volco;

    }

}
