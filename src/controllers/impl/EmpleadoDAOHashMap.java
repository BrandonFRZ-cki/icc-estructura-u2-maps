package controllers.impl;

import controllers.EmpleadoDAO;
import models.Empleado;

import java.util.HashMap;
import java.util.Map;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void listarEmpleados() {
        for (Empleado empleado : empleados.keySet()) {
            System.out.println(empleado);
        }
    }

    @Override
    public void deleteEmpleado(int id) {
        empleados.remove(new Empleado(id));
    }
}
