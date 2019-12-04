package com.ustglobal.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
/*import org.springframework.stereotype.Service;*/
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
/*import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;*/
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springrest.dto.EmployeeBean;
import com.ustglobal.springrest.dto.EmployeeResponse;
import com.ustglobal.springrest.service.EmployeeServices;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServices service;

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) 
	{
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean))
		{
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data added to the DB");
		}else 
		{

			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the DB");
		}
		return response;

	} // end of addEmployee

	@PutMapping(path = "/modify", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(EmployeeBean bean) 
	{
		EmployeeResponse response = new EmployeeResponse();
		if(service.modifyEmployee(bean))
		{
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data modified in the DB");
		}else
		{
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Data not modified in the DB");
		}
		return response;
	} // end of modifyEmployee

	@DeleteMapping(path = "/delete{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id") int id) 
	{
		EmployeeResponse response = new EmployeeResponse();
		if(service.deleteEmployee(id))
		{
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data deleted from the DB");
		}else
		{
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Data deleted from the DB");
		}
		return response;
	} // end of deleteEmployee

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id) 
	{
		EmployeeResponse response = new EmployeeResponse();
		EmployeeBean bean = service.getEmployee(id);
		if(bean!=null)
		{
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data found in the DB");
			response.setEmployeebean(Arrays.asList(bean));
		}else {
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in the DB");
		}
			
		return response;
	} // end of getEmployee

	@GetMapping(path = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() 
	{
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> beans = service.getAllEmployee();
		if(beans!=null)
		{
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data found in the DB");
			response.setEmployeebean(beans);
		}else {
			response.setStatuscode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in the DB");
		}
		return response;
	} // end of getAllEmployee
	
	@GetMapping(path = "/exce", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException()
	{
		int i = 1/0;
	}

} // end of EmployeeController
