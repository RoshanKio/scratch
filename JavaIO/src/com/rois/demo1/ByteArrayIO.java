package com.rois.demo1;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayIO {

	static public void main(String... strings) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("my.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String s = "My name is Khan";
		byte b[] = s.getBytes();
		Timer.startTime();
		try {
			baos.write(b);
			baos.writeTo(fos);

			Timer.endTime();

			baos.flush();
			baos.close();
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Data stored in the file.....");
	}

}
