package vehiculos;
import java.util.ArrayList;

public class Fabricante {

    String nombre;
    Pais pais;
    int vendidos;
    static  ArrayList<Fabricante> ArrayFabricantes= new ArrayList<>();
    public  Fabricante(String nombre,Pais pais){
        this.nombre=nombre;
        this.pais=pais;
        ArrayFabricantes.add(this);

    }
    public Fabricante(){

    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return  nombre;
    }
    public void setPais(Pais pais){
        this.pais=pais;
    }
    public Pais getPais(){
        return  pais;
    }
    public static Fabricante fabricaMayorVentas(){
        int mayor = 0;
        for(Fabricante fabricante : ArrayFabricantes){
            if (fabricante.vendidos > mayor){
                mayor = fabricante.vendidos;
            }
        }
        Fabricante FabricanteMasVendido = new Fabricante();
        for(Fabricante fabricante : ArrayFabricantes){
            if(fabricante.vendidos == mayor){
                FabricanteMasVendido = fabricante;
            }
        }
        return FabricanteMasVendido;
    }

}
