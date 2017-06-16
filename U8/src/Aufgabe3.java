public class Aufgabe3 {
	public static void main(String [] args){
		System.out.println("Welcome to the program!\nDatentypen in Java:\n");
		Object x =3/4 + 1/4;
		System.out.println("\\item[a)] x = " + x+": \t " + x.getClass().getSimpleName());
		x = (3%4==1);
		System.out.println("\\item[b)] x = " + x+": \t " + x.getClass().getSimpleName());
		//Object y = (12%3==1);
		//System.out.println(y);
		//x = (true || y);
		System.out.println("\\item[c)] x = true \t: \tolean");
		x = 3|4;
		System.out.println("\\item[d)] x = " + x+": \t " + x.getClass().getSimpleName());
		x = 2/3.0+1.0/3;
		System.out.println("\\item[e)] x = " + x+": \t " + x.getClass().getSimpleName());
		x = 2^2^3;
		System.out.println("\\item[f)] x = " + x+": \t " + x.getClass().getSimpleName());
		x = (1<2 && 1<0);
		System.out.println("\\item[g)] x = " + x+": \t " + x.getClass().getSimpleName());
		x = (2&3);
		System.out.println("\\item[h)] x = " + x+": \t " + x.getClass().getSimpleName());
		x = (~5);
		System.out.println("\\item[i)] x = " + x+": \t " + x.getClass().getSimpleName());
		x = (true ? 8 : 7);
		System.out.println("\\item[j)] x = " + x+": \t " + x.getClass().getSimpleName());
		x = 3<<3;
		System.out.println("\\item[k)] x = " + x+": \t " + x.getClass().getSimpleName());
		x = 1/0.0;
		System.out.println("\\item[l)] x = " + x+": \t " + x.getClass().getSimpleName());
	}
}
