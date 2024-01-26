/*
	ArrayList가 사용할 수 있는 추가 메소드
메소드							설명
isEmpty()						ArrayList가 비었으면 true 아니면 false를 리턴
clear()							저장된 모든 객체 삭제
contains(Object o)				파라미터 o를 가지고 있는지 확인 ture or false 리턴		
*/
package Collection;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
public class Collection04_1_ArrayList {

	public static void main(String[] args) {
		List list = new ArrayList();
		// db에 글의 갯수가 5개라고 가정
		/*
		  	1번글 제목1 내용1 작성자1
		  	2번글 제목2 내용2 작성자2
		  	3번글 제목3 내용3 작성자3
		  	4번글 제목4 내용4 작성자4
		  	5번글 제목5 내용5 작성자5
		*/
		list.add(new BoardDTO("제목1", "내용1", "작성자1"));
		list.add(new BoardDTO("제목2", "내용2", "작성자2"));
		list.add(new BoardDTO("제목3", "내용3", "작성자3"));
		list.add(new BoardDTO("제목4", "내용4", "작성자4"));
		list.add(new BoardDTO("제목5", "내용5", "작성자5"));
		System.out.println("글(BoardDTO)의 갯수 : " + list.size());
		BoardDTO board3 = (BoardDTO)list.get(2);
		System.out.println(board3.getSubject() + " "+ board3.getContent()+ " " + board3.getWriter());
//		System.out.print(list.get(2).getSubject() + " ");
//		System.out.print(list.get(2).getContent() + " ");
//		System.out.print(list.get(2).getWriter());
	
		System.out.println();
		for(Object obj : list) {
			BoardDTO dto = (BoardDTO)obj;
			System.out.println(dto.getSubject() +"	"+ dto.getContent() +"	"+ dto.getWriter() );
		}
//		System.out.println();
//		for(int i =0;i<list.size();i++) {
//			BoardDTO board =(BoardDTO)list.get(i);
//			System.out.println(board.getSubject() +"\t"+ board.getContent() +"\t"+ board.getWriter());
//		}
//		System.out.println();
//		int i =0;
//		while(i<list.size()) {
//			BoardDTO board = (BoardDTO)list.get(i++);
//			System.out.println(board.getSubject() +"\t"+ board.getContent() +"\t"+ board.getWriter());
//			
//		}
		System.out.println();
		list.remove(2);
		for(Object obj : list) {
			BoardDTO dto = (BoardDTO)obj;
			System.out.println(dto.getSubject() +"	"+ dto.getContent() +"	"+ dto.getWriter() );
		}
		
	}

}
// 게시판 db에 저장된 글하나의 정보를 저장할 DTO역할을 하는 BoardDTO클래스


@AllArgsConstructor
@Getter
@Setter
class BoardDTO{
	private String subject;
	private String content;
	private String writer;
	
}
