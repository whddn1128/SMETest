
public class Ap {
	private String str1;
	private String str2;
	private int count;
	
	Ap(String str1, String str2)
	{
		this.str1 = str1;
		this.str2 = str2;
	}
	
	public void cal()
	{
		int j = 0;
		for(int i = 0; i<str1.length(); i++)
		{
			if(str1.charAt(i) == str2.charAt(j))
			{
				if(j == str2.length()-1)
				{
					count++;
					j = 0;
				}
				else
					j++;
			}
			else
				j = 0;

		}
	}
	
	public int getResult()
	{
		return this.count;
	}

}
