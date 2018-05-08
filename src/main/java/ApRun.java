import java.util.*;

public class ApRun {
	
	private String str1, str2;	
	
	public void runAP()
	{
			str1 = readInput(0);
			str2 = readInput(1);
			
		Ap ap = new Ap(str1, str2);
		ap.cal();
		printResult(ap);
	}
	
	private String readInput(int i)
	{
		Scanner scan = new Scanner(System.in);
		if(i == 0)
		{
			System.out.print("문서를 입력하시오>");
			String str = scan.nextLine();
			if(str.length() > 2500)
				return null;
			return str;
		}
		else if(i == 1)
		{
			System.out.print("검색단어를 입력하시오>");
			String str = scan.nextLine();
			if(str.length() > 50)
				return null;
			return str;
		}
		else
			return null;
	}
	
	private void printResult(Ap ap)
	{
		System.out.println(ap.getResult() + "번 반복");
	}
	
	
}
