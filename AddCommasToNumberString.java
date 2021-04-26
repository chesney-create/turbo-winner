package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberString extends ConsoleProgram {

	private String addCommasToNumericString(String digits, int i) {
      String result = "";
      int len = digits.length();
      int nDigits = 0;
      for (int i1 = len -1; i1 >= 0; i1--); {
    	 result = digits.charAt(i) + result;
    	 nDigits++;
    	 Object n;
		if (((nDigits % 3)== 0) && (i > 0)) {
    		 result = "," + result;
    	 }
      }
	return result;

	}
	
}


