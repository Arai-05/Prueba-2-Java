/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_registro.vehículos_eléctricos;

import java.util.Scanner;
import sistema_registro.vehículos_eléctricos.models.Auto;
import sistema_registro.vehículos_eléctricos.models.Auxiliar;
import sistema_registro.vehículos_eléctricos.models.Bicicleta;
import sistema_registro.vehículos_eléctricos.models.Moto;

/**
 *
 * @author Cetecom
 */
public class Sistema_RegistroVehículos_Eléctricos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        int opc = 0;
        int opc2 = 0;
        String autopilot;
        String mantencion;
        String asistenciaEco;
        int contadorAuto = 0;
        int contadorMoto = 0;
        int contadorBicicleta = 0;
        
        //INPUT
        Scanner ingresar = new Scanner(System.in);
        
        //OBEJTOS
        Auxiliar aux = new Auxiliar();
        
        //MENU
        while(opc != 9){
            System.out.println("** SISTEMA DE REGISTRO DE VEHICULOS ELECTRICOS **");
            System.out.println("[1] Agregar Vehiculo");
            System.out.println("[2] Listar Vehiculos");
            System.out.println("Ingrese una opcion:");
            opc = ingresar.nextInt();
            
            switch(opc){
                case 1:
                    while(opc2 != 4){
                        System.out.println("Seleccione un tipo de vehiculo:");
                        System.out.println("[1] Agregar auto");
                        System.out.println("[2] Agrear moto");
                        System.out.println("[3] Agregar bicicleta");
                        System.out.println("[4] Volver");
                        System.out.println("Ingrese una opcion:");
                        opc2 = ingresar.nextInt();
                        
                        switch(opc2){
                            case 1:
                                Auto auto = new Auto();
                                
                                while(true){
                                    System.out.println("Ingrese un codigo unico: ");
                                    auto.setCodigoVehiculo(ingresar.next());                                    
                                    
                                    if(aux.validarCodigo(auto)!= false){
                                        System.out.println("Codigo valido");
                                        break;
                                    }
                                }
                                                                                                                                
                                System.out.println("Ingrese la cantidad de pasajeros a soportar: ");
                                auto.setCantPasajeros(ingresar.nextInt());
                                
                                System.out.println("Dispone piloto automatico Si/No: ");
                                autopilot = ingresar.next();
                                if(autopilot.equals("Si") || autopilot.equals("si")){
                                    auto.setDisponeAutopilot(true);
                                }else if(autopilot.equals("No") || autopilot.equals("no")){
                                    auto.setDisponeAutopilot(false);
                                }
                                
                                System.out.println("Ingrese la cantidad de horas en alquiler: ");
                                auto.setHorasAlquiler(ingresar.nextInt());
                                
                                System.out.println("Requiere mantencion al final del dia Si/No: ");
                                mantencion = ingresar.next();
                                if(mantencion.equals("Si") || mantencion.equals("si")){
                                    auto.setMantenimientoFinalDia(true);
                                }else if(mantencion.equals("No") || mantencion.equals("no")){
                                    auto.setMantenimientoFinalDia(false);
                                }
                                
                                contadorAuto += 1;
                                if(contadorAuto > 3 ){
                                    System.out.println("Alcanzo el limite de autos a agregar");
                                    break;
                                }else{
                                    aux.agregarVehiculo(auto);
                                    break;
                                }                                                                
                                
                            case 2:
                                Moto moto = new Moto();
                                
                                while(true){
                                    System.out.println("Ingrese un codigo unico: ");
                                    moto.setCodigoVehiculo(ingresar.next());                                    
                                    
                                    if(aux.validarCodigo(moto)!= false){
                                        System.out.println("Codigo valido");
                                        break;
                                    }
                                }
                                
                                System.out.println("Ingrese la capacidad de la bateria mA: ");
                                moto.setCapacidadBateria(ingresar.nextInt());
                                
                                System.out.println("Cuenta con asistencia Eco Si/No: ");
                                asistenciaEco = ingresar.next();
                                if(asistenciaEco.equals("Si") || asistenciaEco.equals("si")){
                                    moto.setAsistenciaModoEco(true);
                                }else if(asistenciaEco.equals("No") || asistenciaEco.equals("no")){
                                    moto.setAsistenciaModoEco(false);
                                }
                                
                                System.out.println("Ingrese la cantidad de horas en alquiler: ");
                                moto.setHorasAlquiler(ingresar.nextInt());
                                
                                System.out.println("Ingrese el tiempo de viaje total: ");
                                moto.setTiempoViaje(ingresar.nextInt());
                                
                                System.out.println("Requiere mantencion al final del dia Si/No: ");
                                mantencion = ingresar.next();
                                if(mantencion.equals("Si") || mantencion.equals("si")){
                                    moto.setMantenimientoFinalDia(true);
                                }else if(mantencion.equals("No") || mantencion.equals("no")){
                                    moto.setMantenimientoFinalDia(false);
                                }
                                
                                contadorMoto += 1;
                                if(contadorMoto > 2 ){
                                    System.out.println("Alcanzo el limite de motos a agregar");
                                    break;
                                }else{
                                    aux.agregarVehiculo(moto);
                                    break;
                                }
                                
                            case 3:
                                Bicicleta bicicleta = new Bicicleta();
                                
                                while(true){
                                    System.out.println("Ingrese un codigo unico: ");
                                    bicicleta.setCodigoVehiculo(ingresar.next());                                    
                                    
                                    if(aux.validarCodigo(bicicleta)!= false){
                                        System.out.println("Codigo valido");
                                        break;
                                    }
                                }
                                
                                System.out.println("Ingrese el tipo de frenos");
                                bicicleta.setTipoFrenos(ingresar.next());
                                
                                System.out.println("Ingrese la capacidad de bateria KM: ");
                                bicicleta.setCapacidadBateriaBici(ingresar.nextInt());
                                
                                System.out.println("Ingrese la cantidad de horas en alquiler: ");
                                bicicleta.setHorasAlquiler(ingresar.nextInt());                                
                                
                                System.out.println("Requiere mantencion al final del dia Si/No: ");
                                mantencion = ingresar.next();
                                if(mantencion.equals("Si") || mantencion.equals("si")){
                                    bicicleta.setMantenimientoFinalDia(true);
                                }else if(mantencion.equals("No") || mantencion.equals("no")){
                                    bicicleta.setMantenimientoFinalDia(false);
                                }
                                
                                contadorBicicleta += 1;
                                if(contadorBicicleta > 2 ){
                                    System.out.println("Alcanzo el limite de biciletas a agregar");
                                    break;
                                }else{
                                    aux.agregarVehiculo(bicicleta);
                                    break;
                                }                                                                 
                        }                                                
                    }default:                                        
                case 2:
                    if(aux.entregarlista().isEmpty()){
                        System.out.println("No hay vehiculos agregados");
                    }else{
                        aux.mostrarVehiculos();
                        aux.cantidadVehiculos();
                    }
            }
        }
            
        
        
        
        
        
        
        
        
    }
    
}
