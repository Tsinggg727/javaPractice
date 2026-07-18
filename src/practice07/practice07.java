package practice07;
//递推公式练习：斐波拉契数列 最大公约数 
public class practice07 {

	public static void main(String[] args) {
		System.out.println(fib(5));
		System.out.println(g(12,15));

	}
	//斐波拉契数列
	public static int fib(int n) {
		if (n==2||n==1) return 1;
		return fib(n-2)+fib(n-1);
	}
	//辗转相余法 m%n=0的最大公约数为n
	public static int g(int m,int n) {
		if (m%n==0) return n;
		return g(n,m%n);
	}
}
