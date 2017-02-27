package com.toler.dtlp.computer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.toler.dtlp.computer.dao.ComputerDao;
import com.toler.dtlp.computer.domain.Computer;
import com.toler.dtlp.computer.domain.ComputerResponse;
import com.toler.dtlp.computer.service.ComputerService;

@RestController
public class ComputerController {
	
	@Autowired
	private ComputerDao computerDao;
	
	@Autowired
	private ComputerService computerService;
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Computer getComputer(@PathVariable long id) {
		return computerService.getComputerById(id);
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ComputerResponse getAllComputer() {
		return new ComputerResponse(computerDao.findAll());
	}
}
