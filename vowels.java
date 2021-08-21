import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.IOException;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
               // Remove vowels from string.
public class vowels {
	
        
	public static void main(String args[]) throws IOException {	 
		
		String st ="krishna";
		char ch []=st.toCharArray();
		char ch1 =0;
		for(int i=0;i<st.length();i++) {
			if(ch[i]!='a' && ch[i]!='e'&& ch[i]!='i' && ch[i]!='o'&& ch[i]!='u') {
				ch1=ch[i];
				System.out.print(ch1);
			}
			
		}
	
		} 
     }

OUTPUT: krshn









