//method copy from python, 
//java makes it so much more complicated....ewww...
//string array to int, int to array...could not really manipulate together. annoying!
public class Solution {
    public int addDigits(int num) {
        String[] numStr=Integer.toString(num).split("");
        int len =numStr.length;
        int result=0;
        if (len==1){//make exception for integer is only 1 digits.
            result= Integer.parseInt(numStr[0]);
        }
        while (len!=1){
        	result=0;
        	for (int i=0;i<len;i++){
        		result+=Integer.parseInt(numStr[i]);
        	}
        	numStr=Integer.toString(result).split("");
    		len=numStr.length;
        }
        System.out.println(result);
        return result;
    }
}
