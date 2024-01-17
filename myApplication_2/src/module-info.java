//myApplication_2 모듈은 모듈 a와 b가 제공하는 패키지를 사용하애 하므로
// 두 모뮬에 대한 의존설정이 필요함
module myApplication_2 {
	requires myModule_a;
	requires myModule_b;
}