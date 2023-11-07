package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;
import com.example.demo.dto.Empleado.ClasesTrabajo;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	IEmpleadoDAO dao;
	//buscar empleados
	public List<Empleado> listarEmpleados(){
		return dao.findAll();
	};
	//buscar empleado por ID
	public Empleado empleadoXID(Integer id){
		return dao.findById(id).get();
	};
	//almacenar empleado
	public Empleado guardarEmpleado(Empleado empleado){
		//System.out.println(dao.save(empleado));
		return dao.save(empleado);
	};
	//actualizar empleado
	public Empleado actualizarEmpleado(Empleado empleado) {
		System.out.println(dao.save(empleado));
		return dao.save(empleado);
	};
	//eliminar
	public void eliminarEmpleado(Integer id) {
		dao.deleteById(id);
	};
	//buscar empleados por trabajo
	public List<Empleado> listarEmpleadosPorTrabajo(ClasesTrabajo trabajo) {
		System.out.println(dao.findByTrabajo(trabajo));
		return dao.findByTrabajo(trabajo);
	};
}
