package Arrays;

/*
You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
Example 2:

Input:
s = for
Output: rof
Your Task:

You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 <= |s| <= 10000 
*/
public class ReverseTheArray {
	public static void main(String[] args) {
		System.out.println("Main Method!!!");
		String str = "Chirag Sardana";
		System.out.println("The Reverse String is: "+Reverse.reverseWord(str.toCharArray()));
	}
}
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(char[] character)
    {
        // Reverse the string str
        for(Integer i = 0;i < character.length/2; i++){
            character[i] = (char) (character[i] ^ character[character.length - i - 1]);
            character[character.length - i - 1] = (char) (character[i] ^ character[character.length - i - 1]);
            character[i] = (char) (character[i] ^ character[character.length - i - 1]);
        }
        return String.valueOf(character);
    }
}
