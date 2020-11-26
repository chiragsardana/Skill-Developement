package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Decode_the_string {

//	original string: abbbababbbababbbab 
//	encoded string : "3[a3[b]1[ab]]".
//	Reverse String = ]]ba[1]b[3a[3

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = reader.read();
		while(t-->0) {
			String str = reader.readLine();
//			str = reversed(str);
			Stack<String> st = new Stack<>();
			Stack<Integer> stInt = new Stack<>();
			String result = "";
			for(int i = 0; i < str.length() ;i++) {
				if(Character.isDigit(str.charAt(i))) {
					int num=0;
                    while(Character.isDigit(str.charAt(i)))
                    {
                        num=num*10+str.charAt(i)-'0';
                        i++;
                    }
                    stInt.push(num);
				}
				if(str.charAt(i) == '[') {
					st.push(result);
					result = "";
				}
				else if(str.charAt(i) == ']') {
					StringBuilder sb=new StringBuilder(st.pop());
                    int count=stInt.pop();
                    for(int j=0;j<count;j++)
                    {
                        sb.append(result);
                    }
                    result=sb.toString();
				}
				else {
					result += str.charAt(i); 
				}
			}
			System.out.println(result);
		}
	}
	private static String reversed(String str) {
//		String result = "";
//		for(int i = ;i>=0;i--) {
//			result += str.charAt(i);
//		}
//		return result;
		return null;
	}

}
