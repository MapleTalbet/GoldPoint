package point;

import java.util.Scanner;

public class GoldenPoint {
	public static void Get_num(int n) {
	    int []num = new int[n];
	    for (int i = 0; i <n; i++) {
	    	System.out.println("第"+(i+1)+"个数：");
	    	@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	        num[i]=scan.nextInt();
	    }
	    int sum=0;
	    for (int i = 0; i <num.length; i++) {
	        sum+=num[i];
	    }
	    double ave=sum/num.length;
	    double golden=ave*0.618;
	    System.out.println("黄金点为："+golden);
	    double diff = num[0]-golden;
	    diff=Math.abs(diff);
	    int temp=num[0];
	    for(int i=1;i<num.length;i++){
	    	if(Math.abs(num[i]-golden)<diff){
	         temp=num[i];
	    	}
	    }
	    System.out.println("离黄金点最近的数为："+temp);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	   System.out.println("输入人数N:");
	   @SuppressWarnings("resource")
	   Scanner scan = new Scanner(System.in);
	   int N=scan.nextInt();
	   Get_num(N);
	    
	}

}
