/**
 * 
 */
package practice01;

import java.util.Arrays;
import java.util.Random;

/**
 * 位运算01 核心：异或消除重复数
 */
public class practice01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N=1001;
		int[]arr=new int[N];
		//生成随机索引
		int index=new Random().nextInt(N);
		//生成1-1000的数组
		for(int i=0;i<N-1;i++) {
			arr[i]=i+1;
		}
		//1-11但不包含11的随机数填在数组最后一个位置
		arr[N-1]=new Random().nextInt(N-1)+1;
		//交换
		int temp=arr[N-1];
		arr[N-1]=arr[index];
		arr[index]=temp;
		//打印数组
		System.out.println(Arrays.toString(arr));
		
		
		//方法一：异或消除相同数
		int x=0;
		//x为1-1000相异或^
		for(int i=1;i<=N-1;i++) {
			x=x^i;
		}
		//x异或原数组
		for(int i=0;i<=N-1;i++) {
			x=x^arr[i];
		}
		System.out.println(x);
	
	
	//方法二：开辟辅助空间（类似桶排序）
	  int x2=0;
	  int[]helper=new int[N-1];
	  for (int i=0;i<N;i++) {
		  helper[arr[i]]++;
		  if (helper[arr[i]]==2) {
			  //x2为arr[i]才是真正重复的数
			  x2=arr[i];
			  break;
		  	}  
	  }
	  System.out.println(x2);
	}
}
