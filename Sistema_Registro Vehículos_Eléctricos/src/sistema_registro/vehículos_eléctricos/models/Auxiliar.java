/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_registro.vehículos_eléctricos.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Auxiliar {
    //VARIABLES
    List<Vehiculo> listaVehiculos = new ArrayList<>();
    
    //VALIDAR CODIGO
    public boolean validarCodigo(Vehiculo parVehiculo){
        for(Vehiculo i : listaVehiculos){
            if(i.getCodigoVehiculo().equals(parVehiculo.getCodigoVehiculo())){
                System.out.println("Este Codigo ya esta en uso, intente nuevamente");
                return false;
            }
        }
        return true;
    }
    
    //AGREGAR
    public void agregarVehiculo(Vehiculo parVehiculo){
        listaVehiculos.add(parVehiculo);
        System.out.println("Vehiculo agregado correctamente");
    }
    
    //LISTAR
    public void mostrarVehiculos(){
        System.out.println(listaVehiculos);
    }
    
    //ENTREGAR LISTA
    public List entregarlista(){
        return listaVehiculos;
    }
    
    //CANTIDAD DE VEHICULOS
    public void cantidadVehiculos(){
        System.out.println("Hay un total de " + listaVehiculos.size() + " vehiculos en la flota");
    }
}
