package test;

public class ReversalExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// reverse String
		// reversal of array
		// reversa of number
		
		String str1 = "Clean India Green India";
		String revstr1 = "";
		
		for(int index=str1.length()-1;index>=0;index--)
		{
			revstr1 = revstr1 + str1.charAt(index);
		}
		
		System.out.println("reversed string " +revstr1);
		
		//number of vowels
		
		int result = 0;
		
		for(int index=0;index<str1.length()-1;index++)
		{
		if(str1.charAt(index)  == 'a' || str1.charAt(index) == 'e' || str1.charAt(index)== 'i' || str1.charAt(index)== 'o' ||
				str1.charAt(index)=='u')
		{
			result ++;
		}
		
		
		//reversal of array
		
		int[] array1 = {20,30,40,50,60};
			
		
		for(int index1 =array1.length-1;index1>=0;index1--)
		{
			System.out.println(array1[index1]);
		}
		
		
		//reversal of number
		int num5 = 452356;
		//RESULT = 653254;
		
		
		
		
	}
	}

}
