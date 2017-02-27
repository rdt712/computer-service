package com.toler.dtlp.computer.exception;

public class NoComputerException extends RuntimeException {

	private static final long serialVersionUID = 1933891479553720570L;

	private long computerId;

	public NoComputerException(long computerId) {
		this.computerId = computerId;
	}

	public long getComputerId() {
		return computerId;
	}

	public void setComputerId(long computerId) {
		this.computerId = computerId;
	}
}
