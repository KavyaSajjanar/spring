package com.xworkz.spring.component;

public class CameraComponent {

	public CameraComponent() {
		System.out.println("invoked CameraComponent from default constructor");
	}

public void capture(String what) {
	System.out.println("invoked capture");
	System.out.println("Capture image is:" +what);
}

}




