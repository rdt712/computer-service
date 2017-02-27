package com.toler.dtlp.computer.domain;

import java.util.List;

public class ComputerResponse {
	
	private List<Computer> computers;
	
	public ComputerResponse() { }

	public ComputerResponse(List<Computer> computers) {
		this.computers = computers;
	}

	public List<Computer> getComputers() {
		return computers;
	}

	public void setComputers(List<Computer> computers) {
		this.computers = computers;
	}
}
