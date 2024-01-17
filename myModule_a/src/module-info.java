// myModule_a 모듈이 포함하는 패키지를 외부 프로젝트에서 사용할 수 있도록 
// 모듈기술자 파일에 작성
module myModule_a {
	exports pack1;
//	exports pack2;
	requires transitive myModule_b;
}