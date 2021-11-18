package com.practice.set;

import java.util.HashSet;
import java.util.Set;

public class DuplicateObjectsTest {

	public static void main(String[] args) {

		Data d = new Data(23);
		System.out.println(d.id);

		Set<Data> dataSet = new HashSet<>();
		dataSet.add(new Data(1));
		dataSet.add(new Data(2));
		dataSet.add(new Data(3));
		dataSet.add(new Data(1));
		dataSet.add(new Data(3));

		System.out.println("Data Set Size : " + dataSet.size());

	}

}

class Data {

	int id;

	public Data(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
	    System.out.println("In hashcode");
	    return this.getId();
	}

	@Override
	public boolean equals(Object obj) {
		Data e = null;
	    if(obj instanceof Data){
	        e = (Data) obj;
	    }
	    System.out.println("In equals");
	    if(this.getId() == e.getId()){
	        return true;
	    } else {
	        return false;
	    }
	}

}