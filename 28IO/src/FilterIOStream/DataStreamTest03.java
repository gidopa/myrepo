package FilterIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

/*	객체 직렬화란 ? 
	- 객체를 출력하려면 변수값들을 일렬로 늘어선 바이트 데이터로 변경해야 하는데 
	  객체 변수에 저장된 값들을 바이트 데이터로 변경하는것을 객체 직렬화라 부름
	객체 직렬화를 하는 이유 
	- 데이터 출력을 위해
	객체 역직렬화
	- 직렬화된 바이트 데이터를 다시 객체의 변수값으로 복원하는 것 
	ObjectInputStream과 ObjectOutputStream
	- 객체 입출력을 위한 보조 스트림
	output -> 바이트 출력 스트림과 연결되어 객체를 직렬화
	input -> 바이트 입력스트림과 연결되어 객체를 역직렬화
	
	ObjectOutputStream으로 객체 직렬화를 위해 writeObject() 사용
	oos.writeObject(객체주소);
	
	역직렬화
	객체클래스타입 참조변수 = (객체클래스타입)ois.readObject();
*/
public class DataStreamTest03 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Member member1 = new Member("fal1", "단풍이");
		Product prodcut1 = new Product("노트북", 1500000);
		int[] arr1 = {1,2,3};
		//객체 직렬화해서 파일에 저장
		oos.writeObject(member1);
		oos.writeObject(prodcut1);
		oos.writeObject(arr1);
		
		oos.flush();
		oos.close(); 
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/object.dat"));
		Member member2 = (Member)ois.readObject();
		Product product2 = (Product)ois.readObject();
		int[] arr2 = (int[])ois.readObject();
		
		ois.close();
		System.out.println(member2.toString());
		System.out.println(product2.toString());
		System.out.println(Arrays.toString(arr2));
		
	}

}
/*
	Serializable 인터페이스
	- 인터페이스를 구현한 클래스만 직렬화할 수 있도록 정해놈
	- 시리얼라이저블 인터페이스는 멤버가 없는 빈 인터페이스지만 객체를 직렬화할 수 있다고 표시하는 역할을 함
		interface Serializable{}
	- 객체가 직렬화될 때 객체안의 인스턴스변수값은 직렬화 대상이지만 static 변수값과 stransient로 선언된
	  변수값은 직렬화 대상이 아님 -> 출력 되지 않는다
	serialVersionUID static 상수
	- 직렬화/역직렬화할때 사용된 클래스는 기본적으로 동일한 클래스여야 한다.
      만약 클래스의 이름이 같더라도 클래스의 내용이 다르면 역직렬화에 실패
      serialVersionUID 상수를 자동 생성하는 기능 제공
      클래스 implements Serializable 하고 마우스를 클래스 이름위에 올려놓으면 Add generate serial version ID 링크가 나옴
*/
class Member implements Serializable{
	private static final long serialVersionUID = -752226614355150067L;
	private String id, name;
	public Member(String id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return id + " : " + name;
	}
	
	
}
class Product implements Serializable {
	private static final long serialVersionUID = -621812868470078544L;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price =price;
	}

	@Override
	public String toString() {
		return name + " : " + price ;
	}
	
}


