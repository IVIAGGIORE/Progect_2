package com.education;

public class Student {
	private Data[] data;
	private int curIndex;
	
	public Student() {
		data = new Data[10];
		curIndex = 0;
	}
	
	public Student(int n){
		data = new Data[n];
		curIndex = 0;
	}
	
	public Data[] getData() {
		return data;
	}
	public void setData(Data[] data) {
		this.data = data;
		curIndex = data.length;
	}
	
	public void add(Data data) {
		if(curIndex >= this.data.length) {
			throw new RuntimeException("Write error");
		}
		this.data[curIndex++] = data;
	}
	
	public String excellentStudents() {
		
		String s = " ";
		
		for(int i = 0; i < this.data.length; i++) {
			if(data[i].getProgress() == 9 || data[i].getProgress() == 10) {
				s = s + data[i].getSurname() + " "
			+ data[i].getInitsial()+ " " + data[i].getNumberGroup() + "/n";
			}
		}
		
		return s;
	}
	
}
