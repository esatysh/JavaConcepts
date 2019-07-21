package stringClassExamples;

import java.util.Arrays;

public class StringExamples {

	public static void main(String[] args) {
	String str="Selenium Webdriver";
	int strLen=str.length();
	System.out.println("String Length "+strLen);
	String splitEx="test-sathish;hellow-world";
	String[] arr1=splitEx.split("-");
	String[] arr2=splitEx.split(";");
	for(String str1:arr1)
	{
		System.out.println(str1);
	}
	for(String str2:arr2)
	{
		System.out.println(str2);
	}
	System.out.println(splitEx.substring(3));
	System.out.println(splitEx.substring(4, 8));
	testMethod();

	}
	
	//this is an interview question
	//reverse the first word and print both the first and second words
	static void testMethod()
	{
		String test="Selenium Training";
		String[] words=test.split(" ");
		String newword="";
		for(int i=words[0].length()-1;i>=0;i--)
		{
			newword=newword+words[0].charAt(i);
			System.out.println(newword+" "+i);
		}
		words[0]=newword;
		System.out.println(Arrays.toString(words));
				
	}

}
