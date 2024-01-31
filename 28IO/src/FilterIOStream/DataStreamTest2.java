package FilterIOStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
//별로 안중요함
public class DataStreamTest2 {

	public static void main(String[] args){
		int i=0;
		char c=0;
		double d=0;
		String str=null;
		short s=0;
		byte b=0;
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(new File("data.txt")));
			i =dis.readInt();
			c = dis.readChar();
			d = dis.readDouble();
			str = dis.readUTF();
			s = dis.readShort();
			b = dis.readByte();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(i + c + d + str + s + b);
		
	}

}
