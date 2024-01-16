
public class Board {

	public static void main(String[] args) {
		
	}
	

}
interface IBoard{
	// 프로젝트에서 메소드를 만들때 메소드 이름을 정해야한다. 이때 인터페이스 먼저 생성
	// 글쓰기
	void write(BoardDTO dto);
	// 글 수정
	void update(BoardDTO dto);
	// 글 삭제
	void delete(int num);
	// 글 조회
	BoardDTO search();
	//
}
// 글쓰기 기능 구현
class BoardFucntion implements IBoard{

	@Override
	public void write(BoardDTO dto) {
		
	}

	@Override
	public void update(BoardDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardDTO search() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

class BoardDTO{
	private int num; // 게시판 글번호
	private String title; // 글 제목
	private String content; // 글내용
	public int getNum() {
		return num;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
