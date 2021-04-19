package question4;
import java.util.Arrays;
import java.util.Scanner;

public class Question_8 {
	static String removeDuplicate(char str[], int n)
	{
		
		int index = 0;

		
		for (int i = 0; i < n; i++)
		{

			
			int j;
			for (j = 0; j < i; j++)
			{
				if (str[i] == str[j])
				{
					break;
				}
			}

			
			if (j == i)
			{
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}

	
	public static void main(String[] args)
	{
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str1 = input1.nextLine();
		char str[] = str1.toCharArray();
		int n = str.length;
		System.out.println(removeDuplicate(str, n));
	}
}
