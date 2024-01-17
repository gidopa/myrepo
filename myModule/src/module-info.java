//myModule은 a,b를 합친 집합모듈
// 두 모듈에 대한 전이 의존설정
module myModule {
	requires transitive myModule_a;
	requires transitive myModule_b;
}