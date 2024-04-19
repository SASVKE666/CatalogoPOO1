package main.Clases.Products.PantalonF;
import main.Clases.Products.Pantalon;

public class Jeans extends Pantalon{

    //  attrinutes
    private String corte;

    //  constructors
    public Jeans(){
        super();
    }

    public Jeans(String nombre, double precio, String color, String marca, int talla, String tela, String corte){
        super(nombre, precio, color, marca, talla, tela);
        this.corte = corte;
    }

    //  getters
    public String getCorte(){
        return this.corte;
    }

    //  setters
    public void setCorte(String corte){
        this.corte = corte;
    }

    //  toString method
    @Override
    public String toString(){
        return 
        super.toString() +
        "\nCorte: " + this.corte;
    }
    
}
