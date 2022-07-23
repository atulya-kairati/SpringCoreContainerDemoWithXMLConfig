package com.manus.bean;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

}
