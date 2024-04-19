package main.Clases.Products.PantalonF;
import main.Clases.Products.Pantalon;

public class Otros extends Pantalon{

    //  atributes
    private String estilo;

    // constructors
    public Otros(){
        super();
    }

    public Otros(String nombre, double precio, String color, String marca, int talla, String tela, String estilo){
        super(nombre, precio, color, marca, talla, tela);
        this.estilo = estilo;
    }

    //  getters
    public String getEstilo(){
        return this.estilo;
    }

    //  setters 
    public void setEstilo(String estilo){
        this.estilo = estilo;
    }

    //  toString method
    @Override
    public String toString(){
        return 
        super.toString() +
        "\nEstilo: " + this.estilo;
    }
    
}
