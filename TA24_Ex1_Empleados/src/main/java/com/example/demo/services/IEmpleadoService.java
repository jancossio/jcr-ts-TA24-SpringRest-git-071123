package com.example.demo.services;

import java.util.List;
import com.example.demo.dto.Empleado;

public interface IEmpleadoService {

	public List<Empleado> listarEmpleados();
	
	public Empleado empleadoXID(Integer id);
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(Integer id);
	
}
