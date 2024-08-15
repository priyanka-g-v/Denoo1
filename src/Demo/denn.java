package Demo;

import org.testng.annotations.Test;

public class denn
{
	@Test
	public void pgm()
	{
		String s = "AbCdEf";
		String u="";
		String l="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch))
				l=l+ch;
			else if(Character.isUpperCase(ch))
				u=u+ch;
		}
		System.out.println(u+l);
	}
}
