package com.aman.interview;

import java.io.IOException;

public class OpenComputerProgram {

	public static void main(String[] args) {
		
		Runtime runtime=Runtime.getRuntime();
		try {
			runtime.exec("/home/aman/SoapUI-5.5.0/bin/SoapUI-5.5.0");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
