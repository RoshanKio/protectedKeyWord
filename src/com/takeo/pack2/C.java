package com.takeo.pack2;

import com.takeo.pack1.A;

public class C extends A  {
	public static void main(String as[]) {
		C a = new C();
		A a1 = new C();
		System.out.println(a.i);//O/P:3 
		//System.out.println(a1.i);//A.i is not visible 
	}
}
