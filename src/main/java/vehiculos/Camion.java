package vehiculo;

public class Camion extends  Vehiculo{
    int ejes;
    static int fabricados;
    public   Camion(String placa, String nombre, int precio, int peso,int puertas,Fabricante fabricante, int ejes){
        super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
        this.ejes=ejes;

    }
}