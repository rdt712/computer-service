package com.toler.dtlp.computer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toler.dtlp.computer.domain.Computer;

public interface ComputerDao extends JpaRepository<Computer, Long> {

	List<Computer> findByAccountId(Long accountId);
}
