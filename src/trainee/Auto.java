
package trainee;


public class Auto extends Vehiculo {
    int puertas;

    public Auto() {
    }

    public Auto(int puertas) {
        this.puertas = puertas;
    }

    public Auto(int puertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: "+this.getMarca()+ " // "+"Modelo: "+this.getModelo()+" // "+"Puertas: "+this.getPuertas()+" // "+"Precio: "+String.format("$%.2f", this.getPrecio());
    }
    
    
    
    
    
}
