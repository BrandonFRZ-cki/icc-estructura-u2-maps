import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.Mapa;

import controllers.impl.EmpleadoDAOHashMap;
import controllers.impl.EmpleadoDAOTreeMap;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        System.out.println("*** Empleado Example ***");
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTreeMap = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContollerDos = new EmpleadoContoller(empleadoDAOTreeMap);

        Empleado emp1 = new Empleado(5,"Pedro","Dev");
        Empleado emp2 = new Empleado(3,"Juan","Dev");
        Empleado emp3 = new Empleado(1,"Jose","Dev");
        Empleado emp4 = new Empleado(2,"Pedro","Dev");
        Empleado emp5 = new Empleado(4,"Pedro","Dev");

        empleadoContoller.agregarEmpleado(emp1);
        empleadoContoller.agregarEmpleado(emp2);
        empleadoContoller.agregarEmpleado(emp3);
        empleadoContoller.agregarEmpleado(emp4);
        empleadoContoller.agregarEmpleado(emp5);

        empleadoContollerDos.agregarEmpleado(emp1);
        empleadoContollerDos.agregarEmpleado(emp2);
        empleadoContollerDos.agregarEmpleado(emp3);
        empleadoContollerDos.agregarEmpleado(emp4);
        empleadoContollerDos.agregarEmpleado(emp5);

        System.out.println("---------------- HASH MAP");
        empleadoContoller.listarEmpleados();
        System.out.println("---------------- TREE MAP");
        empleadoContollerDos.listarEmpleados();

    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEjerccios() {
        System.out.println("*** Ejercicios ***");
        Ejercicios ejercicios = new Ejercicios();

        // Anagramas
        System.out.println(ejercicios.areAnagrams("listen", "silent"));
        System.out.println(ejercicios.areAnagrams("hello", "bello"));
        System.out.println(ejercicios.sonAnagramas("roma", "amor"));

        // Sumatoria de dos
        int[] resultado = ejercicios.sumatoriaDeDos(new int[] {9, 2, 3, 6}, 5);
        if (resultado != null) {
            System.out.println("Índices con suma 5: [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontró una suma igual a 5.");
        }

        // Contar caracteres
        System.out.print("Frecuencia de caracteres en 'hola': ");
        ejercicios.contarCaracteres("hola");
    }

}
