
package trainee;

public class Moto extends Vehiculo {
    float cilindrada;

    public Moto() {
    }

    public Moto(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(float cilindrada, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
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
        return "Marca: "+this.getMarca()+ " // "+"Modelo: "+this.getModelo()+" // "+"Cilindrada: "+this.getCilindrada()+" // "+"Precio: "+String.format("$%.2f", this.getPrecio());
    }
    
    
}
