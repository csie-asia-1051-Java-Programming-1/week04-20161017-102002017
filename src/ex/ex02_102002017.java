package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 102002017 邱泓偉
 */

import java.util.Scanner;
public class ex02_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int i = 0;
		int j = 0;
		String stg = "y";
		
		while(stg.equals("y"))
		{
			int n = scn.nextInt();
			int m = scn.nextInt();
			for(i = 1;i <= n; i++)
			{
				for(j = 1; j <= m; j++)
				{
					System.out.print(i + " * " + j + " = " + (i*j) + "\t");
				}
				System.out.println();
			}
			System.out.print("是否繼續(y/n)");
			stg = scn.next();
		}
		System.out.println("謝謝使用");
		

	}

}
