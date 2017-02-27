package com.toler.dtlp.computer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toler.dtlp.computer.dao.ComputerDao;
import com.toler.dtlp.computer.domain.Computer;
import com.toler.dtlp.computer.exception.NoComputerException;

@Service
public class ComputerServiceImpl implements ComputerService{

	@Autowired
	private ComputerDao computerDao;

	@Override
	public Computer getComputerById(Long id) {
		Computer computer = computerDao.findOne(id);
		if (computer == null) {
			throw new NoComputerException(id);
		}
		return computer;
	}
}
