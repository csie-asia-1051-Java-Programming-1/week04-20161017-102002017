package ex;
/*
 * Topic: 寫一個程式讓使用者輸入多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 102002017 邱泓偉
 */

import java.util.Scanner;
public class ex01_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);		
		int n = scn.nextInt();
		int p = 0;
		int i = 0;
		
		while(n > -1)
		{
			p+=n;
			i++;
			n = scn.nextInt();
		}
		
		System.out.println("總和 = " + p);
		System.out.println("平均 = " + (float)p/i);

	}

}
