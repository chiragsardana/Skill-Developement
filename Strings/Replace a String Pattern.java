// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Main String: ");
        String mainString = scanner.nextLine();
        System.out.print("\nEnter the Pattern String: ");
        String patternString = scanner.nextLine();
        System.out.print("\nEnter the Replace String: ");
        String replaceString = scanner.nextLine();
        System.out.println("The Strings are as follow: "+mainString+" and "+patternString+" and "+replaceString);
        Integer start = 0;
        Integer end = mainString.length() - 1;
        Boolean result = true;
        if(patternString.length() > mainString.length()){
            // System.out.println("No Pattern Found");
            result = false;
        }else if(patternString.length() == mainString.length()){
            for(int i = 0;i < mainString.length() - 1;i++){
                if(mainString.charAt(i) != patternString.charAt(i)){
                    result = false;
                }
            }
        }else{
            for(int i = 0;i < mainString.length();i++){
                if(mainString.charAt(i) == patternString.charAt(0)){
                    Integer leftoverLength = mainString.length() - 1 - i;
                    System.out.println(leftoverLength);
                    if(leftoverLength < patternString.length() - 1){
                        System.out.println("Its workin?");
                        break;
                    }
                    for(int j = i + 1,k=1;j < patternString.length() + i && k < patternString.length();j++,k++){
                        
                        if(mainString.charAt(j) != patternString.charAt(k)){
                            result = false;
                            break;
                        }
                    }
                    if(result == true){
                        System.out.println("The Result is updating"+start+" "+end);
                        start = i;
                        end = i + patternString.length();
                         System.out.println("The Result is updated"+start+" "+end);
                         break;
                    }
                }
            }
        }
        System.out.println("The result is "+result+ " start and end index is "+ start+"and " +end);
    }
}
