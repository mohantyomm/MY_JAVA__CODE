package com.omm.java35;

import java.util.Scanner;

public class CWH_35_own_pr 
	{
		CWH_35_own_pr(int x) 
			{
				int temp = 0;
				if (x == 1) 
					{
						System.out.println("THe num is prime");
					} 
				else 
					{
						for (int i = 2; i < (x / 2); i++) 
							{
								if (x % i == 0) 
									{
										System.out.println("THe num is not prime");
										temp = 1;
										break;
									}
							}
					if (temp == 0) 
						{
							System.out.println("Entered number is a prime number");
						}
				}

			}

	public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			int num;
			System.out.println("Enter the number : ");
			num = sc.nextInt();
			CWH_35_own_pr obj = new CWH_35_own_pr(num);
			sc.close();

		}
	}
