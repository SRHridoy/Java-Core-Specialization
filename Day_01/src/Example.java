class Example {

	static void fun1(){
		System.out.println("A");
	}
	static void fun2(){
		System.out.println("B");
	}
	public static void main(String[] args){
		
		System.out.println("C");
		fun1();
		fun2();
		Example.fun1();//evabeo kaj kore... etai asol...

	//Onno Function er Static Function call korte chaile oi class er nam.functionName() likha lagbe...
		Area.fun1();
		Area.fun2();
	}

}
class Area{
	static void fun1(){
		System.out.println("Area1");
	}
	static void fun2(){
		System.out.println("Area2");
	}
}

