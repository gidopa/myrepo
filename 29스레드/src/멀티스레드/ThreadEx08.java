package 멀티스레드;
public class ThreadEx08 {
	//메인 스레드를 기준으로 해서 스레드 그룹 만들어보기
	public static void main(String[] args) {
		//설명 : 기본적으로 메인스레드 자체가 하나의 메인그룹에 형성되어서
		//		자동으로 메인그룹이라는 곳에 포함되어 있기때문에
		//      현재 실행되고 있는 메인스레드가 속해 있는 그룹에 대한 스레드 그룹객체메모리의 주소 얻기
		
		ThreadGroup g_main = Thread.currentThread().getThreadGroup();
		 
		//수동으로 스레드 그룹 만들어 보기
		ThreadGroup grp1 = new ThreadGroup("Group1"); //스레드 그룹 생성시 이름을 지정하여 만들수 있다
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		//Group1스레드 그룹에 SubGroup1스레드 그룹을 만들어서 포함시키자
	//  ThreadGroup subGrp1 = new ThreadGroup(부모스레드그룹객체의주소, "생성하는 스레드 그룹명");	
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");
		
		//설명:
		//어떤 특정 스레드를 Group1스레드 그룹에 가입시켜야 합니다.
		//가입시키기전에 Group1스레드 그룹에 가입된 스레드들의 작업 우선순위를 3으로 설정
		grp1.setMaxPriority(3);
		//우선순위란?
		//특정 스레드 그룹안에 포함되어 있는 스레드들이 더 많은 작업 시간을 가지도록한다.
		//보충 설명) 현재 Group1스레드 그룹안에 가입시킨 모든 스레드들의 우선순위값을 3으로 일괄적으로 지정한다.
		
		//grp1참조변수가 사용하고 있는 Group1스레드그룹에 가입시킬 보조작업스레드객체 생성 후 가입시키기
		Thread t1 = new Thread(grp1, "t1");
	//  Thread t1 = new Thread(가입할 스레드그룹 객체주소,  생성하는 보조작업스레드명);	
		
		//SubGroup1스레드그룹에 포함시킬 보조작업스레드 객체 생성
		Thread t2 = new Thread(subGrp1, "t2");
		
		//Group2스레드그룹에 포함시킬 보조작업스레드 객체 생성
		Thread t3 = new Thread(grp2, "t3");
		
		//보조작업스레드 t1, t2, t3 일시작 시키기
		t1.start();  t2.start();  t3.start();
		
		//현재 작업을 실행하고 있는 메인스레드가 속해 있는 그룹에 대한 스레드 그룹 이름 얻기
		System.out.print(">> List of ThreadGroup : " +  g_main.getName() + "그룹,");
		
		//현재 생성된 스레드 그룹의 갯수 출력
		System.out.println(" Activity ThreadGroup : " + g_main.activeGroupCount());
		
		//스레드 그룹에 관한 모든 정보를 자세히 출력해보자
		//참고.
		//이스레드 그웁에 대한 정보를 표준 출력형식으로 받아 출력합니다.
		//이메소드는 디버깅 테스트의 경우에만 사용합니다.
		g_main.list();
	/*	
		java.lang.ThreadGroup[name=main,maxpri=10]  //main스레드 그룹의 최대 작업 우선순위값 10
			    
			    Thread[#1,main,5,main] //main스레드의 기본우선순위 정보 5
			   
			    java.lang.ThreadGroup[name=Group1,maxpri=3] // Group1스레드 그룹의 최대 우선순위값 3
			       
			       //Group1부모 스레드 그룹의 하위 스레드그룹 SubGroup1도 최대 우선순위값 3을 상속받아 사용
					java.lang.ThreadGroup[name=SubGroup1,maxpri=3]
					
				//Group2스레드 그룹은 최대 우선순위값을 지정하지 않았으므로
				//부모 main스레드그룹의 최대 우선순위값 10을 상속받아서 사용함
			    java.lang.ThreadGroup[name=Group2,maxpri=10]
	

		결론 : 
		스레드 그룹
		- 서로 관련된 스레드들을 그룹으로 묶어서 관리 하기 위한 객체 메모리 이다.
		- 모든 스레드는 반드시 하나의 스레드  그룹에  포함되어 있어야 한다
		- 스레드 그룹에 포함시키지 않고 생성한 보조작업스레드는 main스레드그룹에 자동 포함된다.
		- 자신을 생성한 스레드(부모스레드)의 그룹에 우선순위를 상속받는다.
		

	*/
	
	}

}










