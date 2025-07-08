package controllers;

import models.Empleado;

import java.util.*;

public class Mapa {
    public Mapa() {
    }
    public void ejemploConHashMap() {
        System.out.println("****************** HashMap");
        Map<String,String> capitales = new HashMap<String,String>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Peru", "Lima");
        capitales.put("Colombia", "Bogota");
        System.out.println(capitales.keySet());

        System.out.println("--------------- For");
        for (String key : capitales.keySet()) {
            System.out.println("Pais → "+key + " | Capital → "+capitales.get(key));
        }
        System.out.println("Capital de Ecuador → "+capitales.get("Ecuador"));

        System.out.println("--------");
        Map<Integer,Empleado> empleados = new HashMap<>();
        empleados.put(1,new Empleado(3,"Pedro","Tester"));
        empleados.put(2,new Empleado(1,"Ana","Dev"));
        empleados.put(2,new Empleado(2,"Luis","Dev"));
        empleados.put(3,new Empleado(1,"Pedro","Disenador"));

        for(Map.Entry<Integer,Empleado> entry : empleados.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("--------");
        Map<Empleado,Integer> empleadosDos = new HashMap<>();
        empleadosDos.put(new Empleado(3,"Pedro","Tester"),200);
        empleadosDos.put(new Empleado(1,"Ana","Dev"),100);
        empleadosDos.put(new Empleado(1,"Ana","Dev"),100);
        empleadosDos.put(new Empleado(2,"Ana","Dev"),600);


        for(Map.Entry<Empleado,Integer> entry : empleadosDos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
    public void ejemploConLinkedHashMap() {
        System.out.println("****************** LinkedHashMap");
        Map<String,Integer> productos = new LinkedHashMap<String,Integer>();
        productos.put("Pan", 20);
        productos.put("Salsa", 10);
        productos.put("Guitarra", 5);
        productos.put("Pala", 10);
        productos.put("wiro", 60);
        System.out.println(productos.keySet());
        System.out.println("--------------- For");
        for (String key : productos.keySet()) {
            System.out.println("Producto → "+key + " | "+productos.get(key));
        }

    }
    public void ejemploConTreeMap() {
        System.out.println("****************** TreeMap");
        Map<Integer,String> personas = new TreeMap<Integer,String>();
        personas.put(1, "Jose");
        personas.put(20, "Paulo");
        personas.put(3, "Pedro");
        personas.put(40, "Ana");
        personas.put(5, "Luis");
        System.out.println(personas.keySet());
        for (int id : personas.keySet()) {
            System.out.println(" * "+id+" | "+personas.get(id));
        }


        System.out.println("--------");
        Map<Empleado,Integer> empleadosDos = new TreeMap<Empleado,Integer>();
        empleadosDos.put(new Empleado(3,"Pedro","Tester"),200);
        empleadosDos.put(new Empleado(1,"Ana","Dev"),100);
        empleadosDos.put(new Empleado(1,"Ana","Dev"),100);
        empleadosDos.put(new Empleado(2,"Ana","Dev"),600);


        for(Map.Entry<Empleado,Integer> entry : empleadosDos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
