package com.education;

public class Data {
	private String surname;
	private String initsial;
	private String numberGroup;
	private int progress;
	
	public Data (String surname, String initsial, String numberGroup, int progress) {
		setSurname(surname);
		setInitsial(initsial);
		setNumberGroup(numberGroup);
		setProgress(progress);
	}
	public String getSurname() {
		return this.surname;
	}
	public String getInitsial() {
		return this.initsial;
	}
	public String getNumberGroup() {
		return this.numberGroup;
	}
	public int getProgress() {
		return this.progress;
	}
	
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setInitsial(String initsial) {
		this.initsial = initsial;
	}
	public void setNumberGroup(String numberGroup) {
		this.numberGroup = numberGroup;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
}
