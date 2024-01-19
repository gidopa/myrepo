import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
/*
	DTO역할을 하는 클래스란? (Data Transform Object)
	- DB의 테이블에서 조회한 한행의 정보를 객체 단위로 저장할 목적의 클래스
	- 회원가입을 하거나 새로운 글을 작성할때 하나의 레코드 단위로 DB에 추가할 목적의 클래스
	- 인스턴스변수, 생성자 ,getter,setter 메소드들
*/
//아래의 클래스 컴파일 과정에서 생성자,getter,setter,hashcode, equlas, toString 자동생성

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class MemberDTO {
	private String name;
	private String id;
	private int age;
	
	

	


}
