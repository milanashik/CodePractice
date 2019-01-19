package main;
//return cent,nickel,dime,dollar...........
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class ReturnChange {
	/**
	   * Iterate through each line of input.
	   */
	  final static String COLON =";";
	  static double PP;
	  static double CH;
	  
	  public static void main(String[] args) throws IOException {
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    String line;
	    // line = "94.6,100.00";
	    while ((line = in.readLine()) != null) {
	      separateTrans(line);
	      String result = checkReturn();
	      System.out.println(result);
	    }
	  }
	  
	  public static void separateTrans(String line)
	  {
	    String[] tran = line.split(COLON);
	    PP = Double.parseDouble(tran[0]);
	    CH = Double.parseDouble(tran[1]);    
	  }
	  
	  public static String checkReturn()
	  {
		  ArrayList<String> result = new ArrayList<String>();
	     
		  if(CH < PP)
			  return ("ERROR");
		  if(CH == PP)
			  return("ZERO");
		  
		  Map< Double, String> map = new HashMap<>();
		  map.put( 0.01, "PENNY");
		  map.put( 0.05, "NICKEL" );
		  map.put( 0.1, "DIME");
		  map.put( 0.25, "QUARTER");
		  map.put( 0.50, "HALF DOLLAR");
		  map.put( 1.00, "ONE");
		  map.put( 2.00, "TWO");
		  map.put( 5.00, "FIVE");
		  map.put( 10.00, "TEN");
		  map.put( 20.00, "TWENTY");
		  map.put( 50.00, "FIFTY");
		  map.put( 100.00, "ONE HUNDRED");
		  
		  double[] array = { 0.01, 0.05, 0.1, 0.25, 0.50, 1.00, 2.00, 5.00, 10.00, 20.00, 50.00, 100.00};
		  double returnAmount = CH - PP;
		  int i = map.size()-1;
		  do {
			  int cash = (int)(returnAmount/array[i]);
			  if(cash >0)
			  {
				  returnAmount -= array[i];
				  result.add(map.get(array[i]));
	           
			  }else
			  {
				  i--;
			  }
		  }while(returnAmount > 0 && i >= 0);
		  Collections.sort(result);
		  String fresult = String.join(",", result);
		  return fresult;
	  }
	}