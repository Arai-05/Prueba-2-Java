/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_registro.vehículos_eléctricos.models;

/**
 *
 * @author Cetecom
 */
public class Auto extends Vehiculo{
    //VARIABLES
    private int cantPasajeros;
    private boolean disponeAutopilot;
    
    //CONSTRUCTORES
    public Auto() {
    }

    public Auto(int cantPasajeros, boolean disponeAutopilot) {
        this.cantPasajeros = cantPasajeros;
        this.disponeAutopilot = disponeAutopilot;
    }

    public Auto(int cantPasajeros, boolean disponeAutopilot, String codigoVehiculo, boolean mantenimientoFinalDia, int horasAlquiler) {
        super(codigoVehiculo, mantenimientoFinalDia, horasAlquiler);
        this.cantPasajeros = cantPasajeros;
        this.disponeAutopilot = disponeAutopilot;
    }
    
    //SETS
    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public void setDisponeAutopilot(boolean disponeAutopilot) {
        this.disponeAutopilot = disponeAutopilot;
    }
    
    //GETS
    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public boolean isDisponeAutopilot() {
        return disponeAutopilot;
    }
    
    //METODOS
    @Override
    public double costoFinalAlquiler() {        
        double costo = getHorasAlquiler()*valorHoraAlquiler;
        if(isDisponeAutopilot() == true){
           double costoNuevo = 0;
           costoNuevo = costo*1.10;
           return costoNuevo;
        }
        return costo;        
    }
            
    //MOSTRAR INFORMACION
    @Override
    public String toString() {
        return "Auto Electrico: Codigo: " + getCodigoVehiculo() + " / " + "Cantidad de pasajares a soportar: " + getCantPasajeros() +
                " / " + "Piloto automatico: " + (isDisponeAutopilot() ? "Si" : "No" ) + " / " + "Mantenimiento al final del dia: " + (isMantenimientoFinalDia() ? "Si" : "No") +
                " / " + "Horas en alquiler: " + getHorasAlquiler() + " / Costo total: " + costoFinalAlquiler();
    }
           
    

    
    
    
    
    
    
}
