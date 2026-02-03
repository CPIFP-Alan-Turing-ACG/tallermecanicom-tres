public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Gestión de Taller FastFix v1.0");
        System.out.println("-----------------------------------------");

        // TODO: Alumno A debe inicializar aquí el gestor de vehículos

        // TODO: Alumno C debe inicializar aquí el inventario

        // TODO: Alumno B debe registrar una reparación de prueba
        GestorReparaciones reparaciones = new GestorReparaciones();
        reparaciones.procesarReparacion();
        
        System.out.println("Sistema detenido.");
    }
}
