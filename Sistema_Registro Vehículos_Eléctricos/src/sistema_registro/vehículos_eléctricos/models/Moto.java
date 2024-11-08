/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_registro.vehículos_eléctricos.models;

/**
 *
 * @author Cetecom
 */
public class Moto extends Vehiculo{
    //VARIABLES
    private int capacidadBateriaMoto;
    private boolean asistenciaModoEco;
    private int tiempoViaje;
    
    //CONSTRUCTORES
    public Moto() {
    }

    public Moto(int capacidadBateria, boolean asistenciaModoEco, int tiempoViaje) {
        this.capacidadBateriaMoto = capacidadBateria;
        this.asistenciaModoEco = asistenciaModoEco;
        this.tiempoViaje = tiempoViaje;
    }

    public Moto(int capacidadBateria, boolean asistenciaModoEco, String codigoVehiculo, boolean mantenimientoFinalDia, int horasAlquiler, int tiempoViaje) {
        super(codigoVehiculo, mantenimientoFinalDia, horasAlquiler);
        this.capacidadBateriaMoto = capacidadBateria;
        this.asistenciaModoEco = asistenciaModoEco;
        this.tiempoViaje = tiempoViaje;
    }
    
    //SETS
    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateriaMoto = capacidadBateria;
    }

    public void setAsistenciaModoEco(boolean asistenciaModoEco) {
        this.asistenciaModoEco = asistenciaModoEco;
    }

    public void setTiempoViaje(int tiempoViaje) {
        this.tiempoViaje = tiempoViaje;
    }
    
    
    
    //GETS
    public int getCapacidadBateria() {
        return capacidadBateriaMoto;
    }

    public boolean isAsistenciaModoEco() {
        return asistenciaModoEco;
    }

    public int getTiempoViaje() {
        return tiempoViaje;
    }
    
    
    
    //METODOS
    @Override
    public double costoFinalAlquiler() {
        double costo = valorHoraAlquiler*getHorasAlquiler();
        if(isAsistenciaModoEco() == true){
            double costoNuevo = 0;
            costoNuevo = costo*1.08;
            return costoNuevo;
        }
        return costo;
    }
    
    //MOSTRAR INFORMACION
    @Override
    public String toString() {
        return "Moto electrica: Codigo: " + getCodigoVehiculo() + " / " + "Capacidad de la bateria: " + getCapacidadBateria() + "mA" + " / " +
                "Modo ECO: " + (isAsistenciaModoEco() ? "Si" : "No") + " / " + "Tiempo de viaje: " + getTiempoViaje() + " / " + "Mantenimiento al final del dia: " + (isMantenimientoFinalDia() ? "Si" : "No") +
                " / " + "Horas en alquiler: " + getHorasAlquiler() + " / Costo total: " + costoFinalAlquiler();
    }
    
    
    
    
    
    
}
