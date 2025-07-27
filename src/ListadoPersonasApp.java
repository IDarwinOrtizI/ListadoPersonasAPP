import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // lista fuera del ciclo while
        List<Persona> personas = new ArrayList();
        // menu
        var salir = false;
        while (!salir) {
            monstrarMenu();
            try {
                salir = ejecutarOpcion(consola, personas);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println();
        }
    }

    private static void monstrarMenu() {
        System.out.print("""
            Menu de opciones:
            1. Agregar persona  
            2. Listar personas
            3. Salir
            """);   
        System.out.print("Seleccione una opcion: ");
        Scanner consola = new Scanner(System.in);
    }

    private static boolean ejecutarOpcion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        // Revisamos la opcion seleccionada
        switch (opcion) {
            case 1 -> {// Agregar persona
                System.out.print("Ingrese el nombre de la persona: ");
                var nombre = consola.nextLine();
                System.out.print("Ingrese el telefono de la persona: ");
                var tel = consola.nextLine();
                System.out.print("Ingrese el correo de la persona: ");
                var correo = consola.nextLine();
                // Crear el objeto Persona
                var persona = new Persona(nombre, tel, correo);
                // se agrega la persona a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " personas");
            }// fin case 1
            case 2 -> {// Listar personas
                System.out.println("Listado de personas:");
                // Mejora usando lambda para imprimir cada persona
                // personas.forEach((persona)-> System.out.println(persona));
                personas.forEach(System.out::println);
            }// fin case 2
            case 3 -> {// Salir
                System.out.println("Saliendo de la aplicacion...");
                salir = true;
            }// fin case 3
            default -> {
                System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        }// fin  switch
        return salir;
    }
}