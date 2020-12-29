
package trainee;

import java.util.ArrayList;
import java.util.List;


public class Trainee {


    public static void main(String[] args) {
        
        //Inicializo valores
        Auto auto1 = new Auto(4, "Peugeot", "206", 200000); 
        Auto auto2 = new Auto(4, "Peugeot", "208", 250000); 
        Moto moto1 = new Moto(125, "Honda", "Titan", 60000); 
        Moto moto2 = new Moto(160, "Yamaha", "YBR", 80500.50);
        
        //meto los vehiculos en un arrayList
        List<Vehiculo> listaVehiculos = new ArrayList();
        listaVehiculos.add(moto1);
        listaVehiculos.add(moto2);
        listaVehiculos.add(auto1);
        listaVehiculos.add(auto2);
        
        //Empiezo a mostrar en consola..
        
        System.out.println(auto1.toString());
        System.out.println(moto1.toString());
        System.out.println(auto2.toString());
        System.out.println(moto2.toString());
        System.out.println("=============================");
        System.out.println("Vehículo más caro: "+vehiculoMasCaro(listaVehiculos));
        System.out.println("Vehículo más barato: "+vehiculoMasBarato(listaVehiculos));
        //Recorro una lista para ver todos los modelos que contienen Y -- Esto deberia hacerse para mayor y menor precio ya que pueden existir varios modelos con el menor o mayor valor
        List<Vehiculo> listaVehiculosConY = contieneLetraY(listaVehiculos);
        int largoContieneY = listaVehiculosConY.size();
        for(int i = 0; i < largoContieneY; i++){
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+ listaVehiculosConY.get(i).getMarca()+ " " + listaVehiculosConY.get(i).getModelo()+ " " + String.format("$%.2f",listaVehiculosConY.get(i).getPrecio()));
        }
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor: \f");
        OrdenarVehiculos(listaVehiculos);
        
}

    private static String vehiculoMasCaro(List<Vehiculo> listaVehiculos) {
        double precioMax = 0;
        String vehiculoCaro = "";
                
        for(Vehiculo vehiculo:listaVehiculos) {
            if (vehiculo.getPrecio() > precioMax){
                precioMax = vehiculo.getPrecio();
                vehiculoCaro = vehiculo.getMarca()+" "+vehiculo.getModelo();
            }
        }
       
        return vehiculoCaro;
        
    }
    
     private static String vehiculoMasBarato(List<Vehiculo> listaVehiculos) {
         //Asigno el primer valor a mis variables por si el primer vehiculo es el de menor valor
        double precioMin = listaVehiculos.get(0).getPrecio();
        String vehiculoBarato = listaVehiculos.get(0).getMarca()+" "+listaVehiculos.get(0).getModelo();
                
        for(Vehiculo vehiculo:listaVehiculos) {
            if (vehiculo.getPrecio() < precioMin){
                precioMin = vehiculo.getPrecio();
                vehiculoBarato = vehiculo.getMarca()+" "+vehiculo.getModelo();
            }
        }
       
        return vehiculoBarato;
        
    }

    private static List<Vehiculo> contieneLetraY(List<Vehiculo> listaVehiculos) {
        List<Vehiculo> contieneY = new ArrayList();
        
        int largo = 0;
        for(Vehiculo vehiculo:listaVehiculos){
            largo = vehiculo.getModelo().length();
            for ( int i = 0 ; i < largo; i++){
            if(vehiculo.getModelo().charAt(i) == 'Y'){
                contieneY.add(vehiculo);
            }
                }
        }
        
        return contieneY;
        
    }

    private static void OrdenarVehiculos(List<Vehiculo> listaVehiculos) {
        //Se puede ordenar con el metodo sort de la clase collections y fin, voy a ordenarlo sin collections con el metodo bubblet sort
        int indice;

        for (int i = 0; i < listaVehiculos.size(); i++) {
            for (int j = 1; j < listaVehiculos.size() - i; j++) {
                if (listaVehiculos.get(j - 1).getPrecio() < listaVehiculos.get(j).getPrecio()) {
                    Vehiculo aux = new Vehiculo();
                    aux = listaVehiculos.get(j - 1);
                    listaVehiculos.set(j - 1, listaVehiculos.get(j));
                    listaVehiculos.set(j, aux);
                }

            }
        }
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo.getMarca()+ " " + vehiculo.getModelo());
        }

    }
}
