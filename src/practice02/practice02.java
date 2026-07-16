package practice02;

import java.util.Scanner;

public class practice02 {
//位运算02：二进制中1的个数
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count1=0;
		//方法一：左移1到数的不同位置比较每一位
		for(int i=0;i<32;i++) {
			//number和左移i位的1相与
			if((num&(1<<i))==(1<<i)) {
				count1++;
			}
		}
		System.out.println(count1);

		//方法二：无符号右移数字 最低位与1比较
		int count2=0;
		for(int i=0;i<32;i++) {
			if(((num>>>i)&1)==1) {
				count2++;
			}
		}
		System.out.println(count2);
		
		//方法三：x与x-1相与 消去最低位1及以下部分 如1010&1001
		int count3=0;
		while(num!=0) {
			num=num&(num-1);
			count3++;
		}
		System.out.println(count3);
	}

}
