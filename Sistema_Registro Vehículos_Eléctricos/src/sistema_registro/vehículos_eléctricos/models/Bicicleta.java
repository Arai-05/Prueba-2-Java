/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_registro.vehículos_eléctricos.models;

/**
 *
 * @author Cetecom
 */
public class Bicicleta extends Vehiculo{
    //VARIABLES
    private String tipoFrenos;
    private int capacidadBateriaBici;
    
    //CONSTRCUTORES
    public Bicicleta() {
    }

    public Bicicleta(String tipoFrenos, int capacidadBateriaBici) {
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateriaBici = capacidadBateriaBici;
    }

    public Bicicleta(String tipoFrenos, int capacidadBateriaBici, String codigoVehiculo, boolean mantenimientoFinalDia, int horasAlquiler) {
        super(codigoVehiculo, mantenimientoFinalDia, horasAlquiler);
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateriaBici = capacidadBateriaBici;
    }
    
    //SETS
    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public void setCapacidadBateriaBici(int capacidadBateriaBici) {
        this.capacidadBateriaBici = capacidadBateriaBici;
    }
    
    //GETS
    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public int getCapacidadBateriaBici() {
        return capacidadBateriaBici;
    }
    
    //METODOS

    @Override
    public double costoFinalAlquiler() {
        double costo = valorHoraAlquiler*getHorasAlquiler();
        if(getCapacidadBateriaBici() < 20){
            double costoNuevo = 0;
            costoNuevo = costo*0.95;
            return costoNuevo;
        }
        return costo;
    }    
    
    //MOSTRAR INFORMACION
    @Override
    public String toString() {
        return "Bicicleta electtrica: Codigo: " + getCodigoVehiculo() + " / " + "Tipo de frenos: " + getTipoFrenos() + " / " +
                "Capacidad de la bateria: " + getCapacidadBateriaBici() + "mA" + " / " + "Mantenimiento al final del dia: " + (isMantenimientoFinalDia() ? "Si" : "No") +
                " / " + "Horas en alquiler: " + getHorasAlquiler() + " / Costo total: " + costoFinalAlquiler();
    }
    
    
    
    
    
    
}
