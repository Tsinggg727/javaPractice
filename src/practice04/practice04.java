package practice04;

import java.util.Scanner;

//位运算04：三十二位表示二进制小数
public class practice04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//只能用nextDouble nextFloat会被截断
		double num=sc.nextDouble();
		//字符串容器
		StringBuilder sb=new StringBuilder("0.");
		while(num>0) {
			num*=2;
			//大于等于一
			if(num>=1) {
				sb.append("1");
				num--;
			}else {
				sb.append("0");
			}
			if(sb.length()>34) {//加上0.两位
				System.out.println("ERROR");
				return;
			}
		}
		System.out.println(sb);
		

	}

}
