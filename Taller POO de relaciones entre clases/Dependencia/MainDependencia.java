package Dependencia;

public class MainDependencia {
    public static void main(String[] args) {
        // 1. Creamos la motocicleta
        Motocicleta miMoto = new Motocicleta("BMW", "M 1000 R");
        
        // 2. Creamos el mecánico
        Mecanico juan = new Mecanico("Kevin");
        
        // 3. Ejecutamos la dependencia (le pasamos la moto al mecánico)
        System.out.println("--- PRUEBA DE DEPENDENCIA ---");
        juan.realizarMantenimiento(miMoto);
    }
}