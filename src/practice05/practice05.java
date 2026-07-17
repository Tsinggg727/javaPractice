package practice05;
//位运算05:出现k次的数 任意进制转换法
public class practice05 {

	public static void main(String[] args) {
		// 参数设置
		int[] arr= {1,1,1,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9};
		int k=3;
		int len=arr.length;//length没括号
		//转换成k进制：k个k进制 不进位相加=0
		//建一个数组存转换成k进制的字符串
		char[][] array=new char[len][];
		int maxlen=0;
		for(int i=0;i<len;i++) {
			//转为k进制 翻转 转为字符串 转为字符数组
			array[i]=new StringBuilder(Integer.toString(arr[i],k)).reverse().toString().toCharArray();
			if (maxlen<array[i].length)
				maxlen=array[i].length;
		}
		//建一个数组 存每列不进位加法的和
		int restarr[]=new int[maxlen];
		for(int i=0;i<len;i++) {
			for (int j=0;j<maxlen;j++) {//列按固定maxlen循环
				if(j>=array[i].length) {
					//***j>=array[i].length j=length的时候超过array[i][j]范围
					//当前列大于该数长度
					restarr[j]+=0;
				}else {
					restarr[j]+=(array[i][j]-'0');
					//array是字符数组 要减去与字符0才是对应的数
				}
				
			}
			
		}
		//还原剩余数
		int rest=0;
		for (int i=0;i<maxlen;i++){
			rest+=(restarr[i]%k)*Math.pow(k,i);//%k 不进位加法 Math.pow(底数,指数)
		}
		System.out.println(rest);

	}

}
