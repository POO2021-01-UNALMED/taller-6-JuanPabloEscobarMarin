package vehiculos;

public class Automovil extends Vehiculo {
    int puestos;
    static int fabricados;
    public Automovil(String placa, String nombre, int precio, int peso,int puestos,Fabricante fabricante) {
       super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
        this.puestos=puestos;
        fabricados++;
    }



}
