package practice06;
//递归小练习合集
public class practice06 {

	public static void main(String[] args) {
		//阶乘参数
		int n=5;
		System.out.println(f1(n));
		//打印i-j参数
		f2(3,10);
		//数组求和
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(f3(arr,0));
		//翻转字符串
		String src="abcdefg";
		System.out.println(f4(src,src.length()-1));//end要-1 否则越界
		
	}
	//阶乘
	public static int f1(int n) {
			if(n==1) return 1;
			else if(n==0) return 1;
			return f1(n-1)*n;
			}
	
	//打印i-j
	public static void f2(int i,int j) {
		if(i>j) return;//if(i==j) return 要打印最后一个数
		System.out.println(i);
		f2(i+1,j);// return f2(i+1,j)错误 不能现在return
	}
	
	//数组求和
	public static int f3(int[] arr,int begin) {
		if (begin==arr.length-1) return arr[begin];
		return arr[begin]+f3(arr,begin+1);
		
	}
	//翻转字符串
		public static String f4(String src,int end) {//不是字符数组 是字符串不用[]
			if(end==0) return src.charAt(0)+"";//不能从char转为string 必须加空字符串
			return src.charAt(end)+f4(src,end-1);
			
		}

}
