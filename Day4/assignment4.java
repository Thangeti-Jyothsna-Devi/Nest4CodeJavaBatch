package day4;
public class assignment4 {
	public static void main(String[] args) {
		int[] num= {2,4,6,8} ;
		int count_even1=0,count_odd1=0;
		for (int i=0;i<num.length;i++) {
			if(num[i]%2==0)
			{
				count_even1++;
			}
			else
			{
				count_odd1++;
			}
		}
		int[] num2= {2,3,5,6,7,8,9,0};
		int count_even2=0,count_odd2=0;
		for (int j=0;j< num2.length;j++)
		{
			if (num2[j] % 2==0)
			{
				count_even2++;
			}
			else
			{
				count_odd2++;
			}
		}
		int[] num3= {-2,3,4,5,6,9,0,0,0,0,0,2};
		int count_even3=0,count_odd3=0;
		for (int k=0;k< num3.length;k++)
		{
			if (num3[k] % 2==0)
			{
				count_even3++;
			}
			else
			{
				count_odd3++;
			}
		}
		System.out.println("TEST CASE1");
		System.out.println("Count Of Even numbers:"+count_even1);
		System.out.println("Count Of Odd Numbers:"+count_odd1);
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("TEST CASE2");
		System.out.println("Count Of Even numbers:"+count_even2);
		System.out.println("Count Of Odd Numbers:"+count_odd2);
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("TEST CASE3");
		System.out.println("Count Of Even numbers:"+count_even3);
		System.out.println("Count Of Odd Numbers:"+count_odd3);
	}
}