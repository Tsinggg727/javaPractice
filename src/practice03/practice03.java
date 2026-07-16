package practice03;

import java.util.Scanner;

public class practice03 {
//位运算03：奇偶位互换
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0xaaaaaaaa;//保留偶数位 1010 1010 1010...
		int b=0x55555555;//保留奇数位 0101 0101 0101...
		int x=num&a;
		int y=num&b;
		System.out.println((x>>1)^(y<<1));

	}

}
