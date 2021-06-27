// Convert string to camel case

// Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
// The first word within the output should be capitalized only if the original word was capitalized 
// (known as Upper Camel Case, also often referred to as Pascal case).

// Examples
// "the-stealth-warrior" gets converted to "theStealthWarrior"
// "The_Stealth_Warrior" gets converted to "TheStealthWarrior"


import java.lang.StringBuilder;

class Solution {
    static String toCamelCase(String s){
        String result = "";
        // Check if the given string is empty or not 
        if(!s.isEmpty()){
            // Replace all of the '-' or '_' with a single space
            if(s.indexOf('-') != -1 || s.indexOf('_') != -1) {
                result  = s.replaceAll("[^A-Za-z0-9]", " ");      
            } 

            StringBuilder sb = new StringBuilder();  
            // Store the words array that has been split with space 
            for(String word : result.split(" ")) {
              // Make the first letter of each word to be capitalized  
              sb.append(Character.toUpperCase(word.charAt(0)));
              // Append the remaining letters 
              sb.append(word.substring(1).toLowerCase());
            }

            result = sb.toString(); 

            // If the given word starts with lowerCase, make the result's first letter lowercase too 
            if(!Character.isUpperCase(s.charAt(0))) {
              result = Character.toLowerCase(result.charAt(0)) + result.substring(1);
            }        
          }  
        return result;
    }
}


// Other developer's solution 

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SolutionAlternative {

  static String toCamelCaseAlternative (String s){
    Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
        m.appendReplacement(sb, m.group(1).toUpperCase());
    }
    return m.appendTail(sb).toString();
  }
}