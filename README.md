> # Java Core

<b><mark>Java is a popular programming language, created in 1995 by James Gosling.</mark>

<mark>IITian Vinod Khosla and Gosling in 1981 they create Sun Microsystem and vinod left and Gosling create Java which was known as Oak, Silk in past but finally JAVA...</mark>

## Advantages of Java : 
* <mark>Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
here, javac(java Compiler compile the code into .class files and these are called byte code) and interpeter(JVM). jvm is machine dependent but byte code machine independent...</mark>
* <mark>It supports multithreding(it's not multi-tasking) where multiple program runs at a time but not in real as the operations are fast so it seem at a time</mark>

* <mark>There is a feature of Garbage collection which is used to delete unused memory</mark>


* <mark>Automatic memory management means if we create a variable named a1 = 5 and and a2 = 5 then two variable indicate same memory address. </mark>

* <mark>Robust means in any situation it can be used...</mark>

* <mark>Many pre-defined classes.</mark>


<mark>javac compile kore and java run kore...</mark>

<mark>File er nam ar class er nam same must...Jodi onek class thake taile dekhte hobe kon class e main function e thakbe seta onujai nam hobe...Class er first later boro hater and camel case.
function e pascal case...</mark>

```java
class Example {

	public static void main(String[] args){
		
		System.out.println("Hello I am Specializing Java Core");
	}

}
```

<mark>Onno Function er Static Function call korte chaile oi class er nam.functionName() likha lagbe...</mark>
```java
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
```

<mark>Jesob function static na segula ke non-static/ instance member function/ object member function bole...Egula onno class e use korte hooile age oi class er object create kore then object.func() diye call kora lagbe...</mark>

```java
public class Object1 {
    public static void main(String[] args){
        Obj2 obj2 = new Obj2();
        obj2.fun1();
        obj2.fun2();
        System.out.println(obj2.x);//prints 0
    }
}

class Obj2{
    int x;//Instance(object) member variable
    int y;//Instance(object) member variable
    void fun1(){//Instance (object) member function
        System.out.println("This is fun1 and it is non-static");
    }
    void fun2(){
        System.out.println("This is fun2 and it is instance member function");
    }
}
```


<mark>Java te uninitialized var e 0 thake...</mark>


