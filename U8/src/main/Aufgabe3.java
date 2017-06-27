package main;

public class aufgabe3 {
	public static void main(String [] args){
		System.out.println("Welcome to the program!\nDatentypen in Java:\n");
		Object x =3/4 + 1/4;
		System.out.println("a) x = " + x+" \tThat is a " + x.getClass().getSimpleName());
		x = (3%4==1);
		System.out.println("b) x = " + x+" \tThat is a " + x.getClass().getSimpleName());
		//Object y = (12%3==1);
		//System.out.println(y);
		//x = (true || y);
		System.out.println("c) x = true \tThat is a Boolean");
		x = 3|4;
		System.out.println("d) x = " + x+" \tThat is a " + x.getClass().getSimpleName());
		x = 2/3.0+1.0/3;
		System.out.println("e) x = " + x+" \tThat is a " + x.getClass().getSimpleName());
		x = 2^2^3;
		System.out.println("f) x = " + x+" \tThat is a " + x.getClass().getSimpleName());
		x = (1<2 && 1<0);
		System.out.println("g) x = " + x+" \tThat is a " + x.getClass().getSimpleName());
		x = (2&3);
		System.out.println("h) x = " + x+" \tThat is a " + x.getClass().getSimpleName());
		x = (~5);
		System.out.println("i) x = " + x+" \tThat is a " + x.getClass().getSimpleName());
		x = (true ? 8 : 7);
		System.out.println("j) x = " + x+" \tThat is a " + x.getClass().getSimpleName());
		x = 3<<3;
		System.out.println("k) x = " + x+" \tThat is a " + x.getClass().getSimpleName());
		x = 1/0.0;
		System.out.println("l) x = " + x+" \tThat is a " + x.getClass().getSimpleName());		
	}
}
