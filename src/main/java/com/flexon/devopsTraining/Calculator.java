// Its comment
package com.flexon.devopsTraining;

public class Calculator {
	
	public Integer numb1,numb2;
	public static Integer addCalc(Integer numb1,Integer numb2)
	{
		if (numb1 == null || numb2 == null)
			return null;
		return numb1+numb2;
		
	}
	public static Integer subCalc(Integer numb1,Integer numb2)
	{
		if (numb1 == null || numb2 == null)
			return null;
		return numb1-numb2;
	}
	public static Integer mulCalc(Integer numb1,Integer numb2)
	{
		if (numb1 == null || numb2 == null)
			return null;
		return numb1*numb2;
	}
	
}
