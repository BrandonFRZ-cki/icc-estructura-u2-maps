package controllers;

import java.util.HashMap;
import java.util.Map;

import controllers.impl.EmpleadoDAOHashMap;
import controllers.impl.EmpleadoDAOTreeMap;
import models.Empleado;

public class EmpleadoContoller {
    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {// Inyeccion de Dependencias
        this.empleadoDAO = empleadoDAO;
    }
    public void agregarEmpleado(Empleado empleado) {
        empleadoDAO.add(empleado);
    }
    public void eliminarEmpleado(int id) {
        empleadoDAO.deleteEmpleado(id);
    }
    public void listarEmpleados() {
        empleadoDAO.listarEmpleados();
    }

}