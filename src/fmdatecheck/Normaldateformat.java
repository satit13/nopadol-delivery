package fmdatecheck;

import java.text.SimpleDateFormat;

public class Normaldateformat {
	SimpleDateFormat dtfm = new SimpleDateFormat("dd/MM/yyyy");
	public String dtnormal(String vgetdate){	
			
			String vrsDate;
			String vYear;
			String vDateMonth;
			String strResultYear;
			String strgetDate;
			//String vDate;

			strgetDate = vgetdate;
			vYear = strgetDate.substring(6);
			vDateMonth = strgetDate.substring(0,6);			
			Integer xInt1 = Integer.parseInt(vYear);
		   		if (xInt1 > 2500){
		   			Integer bInt= xInt1-543;
		   			strResultYear= Integer.toString(bInt);
		   		}else {
		   			strResultYear= Integer.toString(xInt1);
		   		}
	   			vrsDate=vDateMonth.concat(strResultYear); 	 			
	   	System.out.println(vrsDate);

		return (vrsDate); //pov5603-0245 ·¡Á°‡πÍµ
	}
}
