package controllers;

import models.Empleado;

import java.util.Map;

public interface EmpleadoDAO {
    void add(Empleado empleado);
    void listarEmpleados();
    void deleteEmpleado(int id);
}
