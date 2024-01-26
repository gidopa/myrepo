//vector에 저장된 객체 얻기와 객체 삭제
package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		Vector vector = new Vector() ;
		System.out.println("벡터 용량 : "+vector.capacity());
		double[] arr = {38.6, 9.2, 45.3, 6.1, 4.7, 1.6};
		for(int i=0;i<arr.length;i++) {
			vector.add(arr[i]);
		}
		for(int i=0;i<vector.size();i++) {
		System.out.print(vector.get(i)+" ");
		}
		System.out.println();
		double target = 6.1;
		System.out.println(vector.indexOf(target));
		double del = 45.3;
		
		if(vector.contains(del)) {
			boolean res = vector.remove(del);
			if(res) {
				System.out.println("삭제");
			}
		}else {
			System.out.println("no target in vector");
		}
		System.out.println("삭제후");
		System.out.println(vector);
		
		Enumeration enu = vector.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

}
