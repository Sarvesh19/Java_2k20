package exectuter;

public class TestMaxDiff {
	public static void main(String[] args) {

		int num = 1101057;
		String str = String.valueOf(num);
        char temp = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
        	
        	if(str.charAt(i) =='9' && i ==0){
                continue;
            } else if(i==0){
                temp = str.charAt(i);

                str = str.replace(str.charAt(i), '9');
                count++;
                continue;

            }
        	
        	
        	if(str.charAt(i) !='9'){
        		
                count++;

                if(!str.equals(String.valueOf(num))){
                   if(str.charAt(i) == temp){
                       str = str.replace(str.charAt(i), '9');
                   } 
                }
                             if(count == 1) {
	                   	temp = str.charAt(i);
		                str = str.replace(str.charAt(i), '9');

	                   }
                
            }
        	
		}
        
        
        
        
        String strMin = String.valueOf(num);
        char temp1 = 0;
        int count2 = 0;
        for (int i = 0; i < strMin.length(); i++) {
            if(strMin.charAt(i) =='1' && i ==0){
                continue;
            } else if(i==0){
                temp1 = strMin.charAt(i);

                strMin = strMin.replace(strMin.charAt(i), '1');
                count2++;
                continue;

            }

        	if(strMin.charAt(i) !='0' && strMin.charAt(i) !='1'){
                count2++;

                if(!strMin.equals(String.valueOf(num))){
                   if(strMin.charAt(i) == temp1){
                       strMin = strMin.replace(strMin.charAt(i), '0');
                   } 
                }
                 if(count2 == 1) {
                                temp1 = strMin.charAt(i);

                strMin = strMin.replace(strMin.charAt(i), '0');
                 }
                
            }
        	
		}
        
	        
	        
	        System.out.println(Integer.parseInt(str) -   Integer.parseInt(strMin) );
        
        
		
		
	}
}
