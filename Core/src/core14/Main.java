package core14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		FileOutputStream fos = new FileOutputStream("/home/amilovskiy/Desktop/temp.txt");
		FileInputStream fis = new FileInputStream("/home/amilovskiy/Desktop/temp.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		TestSerial ts = new TestSerial();
		oos.writeObject(ts);
		oos.flush();
		oos.close();
		
		TestSerial tsAfterSerial = (TestSerial) ois.readObject();
		System.out.println(tsAfterSerial.str);

	}
}
