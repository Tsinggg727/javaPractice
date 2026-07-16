package practice02;

import java.util.Scanner;

//位运算02-2 二进制判断num（num>0）是否是2的整数次方
public class practice02a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//02法三延续：2的整数次方二进制只有一个1，x与x-1
		if((num&(num-1))==0) {
			System.out.println("Yes");
		}else System.out.println("No");

	}

}
