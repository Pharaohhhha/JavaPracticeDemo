package com.hand.tanchun.basic50;

public class DDDL {
	public static void main(String[] args) {
 
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		System.out.println(a.get(a) + " - " + a.get(d) + " - " + a.get(b) + " - " + b.get(a) + " - " + b.get(c) + " - "
			+ b.get(d));


		String result =
				"A : " + a.get(a) + " - " + a.get(b) + " - " + a.get(c) + " - " + a.get(d)
						+ "\nB : " + b.get(a) + " - " + b.get(b) + " - " + b.get(c) + " - " + b.get(d)
						+ "\nC : " + c.get(a) + " - " + c.get(b) + " - " + c.get(c) + " - " + c.get(d)
						+ "\nD : " + d.get(a) + " - " + d.get(b) + " - " + d.get(c) + " - " + d.get(d);
		System.out.println(result);

	}
 
}
 
class A {
	// TODO
	String get(D d) {
		return "AD";
	}
 
	// TODO
	String get(A a) {
		return "AA";
	}
 
	/*
	 * 说明：类B 继承于A，get(B b)直接继承get(A a) 
	 * 关系：class A -> get(A a)
	 */
	String get(B b) {
		return "AA";
	}
 
	/* 
	 * 说明：类C 继承于B，父类B 中没有方法get(C c),类B 的父类A 中也没有该方法，类方法就近继承get(A a) 
	 * 关系：class A -> get(A a)
	 */
	String get(C c) {
		return "AA";
	}
 
}
 
class B extends A {
	// TODO
	String get(A a) {
		return "BA";
	}
 
	// TODO
	String get(B b) {
		return "BB";
	}
 
	/* 
	 * 说明：类B 没有方法get(C c)，且父类A 也没有该方法，而类C 是B 的子类，类B 的方法get(C c)就近继承get(B b) 
	 * 关系：class B -> get(B b)
	 */
	String get(C c) {
		return "BB";
	}
 
	/* 
	 * 说明：类B 的父类A 存在方法get(D d)，直接继承过来。 
	 * 关系：class A -> get(D d)
	 */
	String get(D d) {
		return "AD";
	}
}
 
class C extends B {
	/* 
	 * 说明：父类B 中有方法get(A a),直接集成过来即可。 
	 * 关系：class B -> get(A a)
	 */
	String get(A a) {
		return "BA";
	}
 
	/* 
	 * 说明：父类B 中有方法get(B b),直接集成过来即可。 
	 * 关系：class B -> get(B b)
	 */
	String get(B b) {
		return "BB";
	}
 
	/*
	 * 说明：类C 与类D 都继承于B。父类B 中没有get(C c),B 的父类A 中也没有此方法，则类C 继承类B 的get(B b)。 
	 * 关系：class B -> get(B b)
	 */
	String get(C c) {
		return "BB";
	}
 
	/*
	 * 说明：父类B 继承于类A，A中有方法get(D d)，直接继承过来即可。 
	 * 关系：class A -> get(D d)
	 */
	String get(D d) {
		return "AD";
	}
}
 
class D extends B {
	String get(A a) {
		return "BA";
	}
 
	String get(B b) {
		return "BB";
	}
 
	String get(C c) {
		return "BB";
	}
 
	String get(D d) {
		return "AD";
	}
 
}
