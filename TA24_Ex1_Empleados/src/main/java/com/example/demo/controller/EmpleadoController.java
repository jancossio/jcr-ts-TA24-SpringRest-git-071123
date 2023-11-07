package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleado;
import com.example.demo.dto.Empleado.ClasesTrabajo;
import com.example.demo.services.EmpleadoServiceImpl;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/all")
	public List <Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/add")
	public Empleado guardarEmpleados(@RequestBody Empleado empleado){
		int tmp_salario = empleado.determinarSalario(empleado.getTrabajo());
		
		empleado.setSalario(tmp_salario);
		
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@GetMapping("/{id}")
	public Empleado empleadoXID(@PathVariable(name="id") Integer id){
		Empleado empleado_xid = new Empleado();
		
		empleado_xid = empleadoServiceImpl.empleadoXID(id);
		
		return empleado_xid;
	}
	
	@PutMapping("/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id") Integer id, @RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado = new Empleado();
		Empleado empleado_actualizado = new Empleado();
		
		empleado_seleccionado = empleadoServiceImpl.empleadoXID(id);
		
		empleado_seleccionado.setNomApel(empleado.getNomApel());
		
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		return empleado_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarEmpleado(@PathVariable (name="id") Integer id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
	
	@GetMapping("/trabajo/{trabajo}")
	public List <Empleado> listarEmpleadosPorTrabajo(@PathVariable (name="trabajo") String trabajo) {
		ClasesTrabajo tmp_Trabajo = ClasesTrabajo.valueOf(trabajo);
		
		return empleadoServiceImpl.listarEmpleadosPorTrabajo(tmp_Trabajo);
	}
}
