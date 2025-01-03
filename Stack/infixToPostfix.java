private static String infixToPostfix(String Expression)
	{
		String result = "";
		Stack<Character> stack = new ListStack<>();

		for(int i = 0 ;i < Expression.length();i++)
		{
			char ch = Expression.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				result = result + ch;
			}
			else if(ch == '(')
			{
				stack.push('(');
			}
			else if(ch == ')')
			{
				while(!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();
				
				if(!stack.isEmpty() && stack.peek() != '(')
					return "Invalid Expression";
				else
					stack.pop();
			}
			else
			{
				while(!stack.isEmpty() && precidence(ch) <= precidence(stack.peek()))
				{
					if(stack.peek() == '(')
						return "Invalid Expression";
					result += stack.pop();
				}
				
				stack.push(ch);
			}
		}

		while(!stack.isEmpty())
		{
			if(stack.peek() == '(') 
				return "Invalid Expression"; 
			result += stack.pop(); 
		}

		return result;
	}
private static int precedence(char ch) {
    switch (ch) {
        case '+':
        case '-':
            return 1; // Lowest precedence for addition and subtraction
        case '*':
        case '/':
            return 2; // Higher precedence for multiplication and division
        case '^':
            return 3; // Highest precedence for exponentiation
        default:
            return -1; // For non-operator characters
    }
}
