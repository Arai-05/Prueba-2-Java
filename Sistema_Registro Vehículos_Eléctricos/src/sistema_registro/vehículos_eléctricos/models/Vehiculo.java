/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_registro.vehículos_eléctricos.models;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo implements Idatos{
    //VARIABLES
    private String codigoVehiculo;
    private boolean mantenimientoFinalDia;
    private int horasAlquiler;
    
    //CONSTRCUTORES
    public Vehiculo() {
    }

    public Vehiculo(String codigoVehiculo, boolean mantenimientoFinalDia, int horasAlquiler) {
        this.horasAlquiler = horasAlquiler;
        this.codigoVehiculo = codigoVehiculo;
        this.mantenimientoFinalDia = mantenimientoFinalDia;
    }
    
    //SETS
    public void setCodigoVehiculo(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public void setMantenimientoFinalDia(boolean mantenimientoFinalDia) {
        this.mantenimientoFinalDia = mantenimientoFinalDia;
    }

    public void setHorasAlquiler(int horasAlquiler) {
        this.horasAlquiler = horasAlquiler;
    }
    
    
    
    //GETS
    public String getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public boolean isMantenimientoFinalDia() {
        return mantenimientoFinalDia;
    }

    public int getHorasAlquiler() {
        return horasAlquiler;
    }
    
    
    //MOSTRAR INFORMACION
    @Override
    public abstract String toString();
    
    
}
