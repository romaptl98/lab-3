/**
*Name-Roma Patel
*Description- : Create a method which accepts a String and replaces all the consonants in the String with 
the next alphabet.
*Date:19/03/2021
*/



 class ConsonantToVowel 
{ 
   
    static boolean isVowel(char ch) 
    { 
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u')  
        { 
            return false; 
        } 
        return true; 
    } 
  
    
    static String replaceConsonants(char[] s)  
    { 
       
        for (int i = 0; i < s.length; i++) 
        { 
            if (!isVowel(s[i])) 
            { 
   
                if (s[i] == 'z')  
                { 
                    s[i] = 'b'; 
                } 
                   
                else
                {  
                    s[i] = (char) (s[i] + 1); 
   
                    if (isVowel(s[i]))  
                    { 
                        s[i] = (char) (s[i] + 1); 
                    } 
                } 
            } 
        } 
        return String.valueOf(s); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String s = "java"; 
        System.out.println(replaceConsonants(s.toCharArray())); 
    } 
}  
  