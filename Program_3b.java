/*3b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
//Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.
public class PerformanceTest{
public static void main(String[] args){
long startTime = System.currentTimeMillis();
StringBuffer sb = new StringBuffer("Java");
for (int i=0; i<10000; i++){
sb.append("Tpoint");
}
System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) +
"ms");
startTime = System.currentTimeMillis();
StringBuilder sb2 = new StringBuilder("Java");
for (int i=0; i<10000; i++){
sb2.append("Tpoint");
}
System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) +
"ms");
}
}
o/p
Time taken by StringBuffer: 4ms
Time taken by StringBuilder: 1ms

//Exercises

//String
/*1. Question: Given a string, write a method to determine if it is a palindrome (reads the same
forward and backward), ignoring case and non-alphanumeric characters. Input: "A man, a plan,
a canal: Panama"

Output: true Input: "race a car"
Output: false*/

  public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(cleaned).reverse();
        return cleaned.equals(reversed.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
    }
}

/*2. Question: Implement a method that counts the number of vowels (a, e, i, o, u) in a given string,
case-insensitive. Input: "Hello World"
Output: 3 Input: "Programming Interview"
Output: 6*/
public class VowelCounter {
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Hello World")); // 3
        System.out.println(countVowels("Programming Interview")); // 6
    }
}

  
//Joining Strings
/*1. Question: Write a method that joins an array of strings with a specified delimiter, without using
built-in join methods. Input: ["apple", "banana", "cherry"], delimiter: ", "
Output: "apple, banana, cherry" Input: ["Java", "is", "fun"], delimiter: "-"
Output: "Java-is-fun"*/
public class StringJoinerCustom {
    public static String join(String[] arr, String delimiter) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) result.append(delimiter);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] arr1 = {"apple", "banana", "cherry"};
        System.out.println(join(arr1, ", ")); // apple, banana, cherry
    }
}

/*2. Question: Implement a method that concatenates alternating characters from two input strings.
If one string is longer than the other, append the remaining characters. Input: "abc", "123"
Output: "a1b2c3" Input: "hello", "world!"
Output: "hweolrllod!"*/
public class AlternateMerge {
    public static String merge(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLen = Math.max(a.length(), b.length());
        for (int i = 0; i < maxLen; i++) {
            if (i < a.length()) result.append(a.charAt(i));
            if (i < b.length()) result.append(b.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(merge("abc", "123"));     // a1b2c3
        System.out.println(merge("hello", "world!")); // hweolrllod!
    }
}

//Additional String Methods
/*1. Question: Create a method that finds the longest substring without repeating characters in a
given string. Input: "abcabcbb"
Output: "abc" (or "cab" or "abc" - any substring of length 3 without repeating characters)
Input: "bbbbb"
Output: "b" Input: "pwwkew"
Output: "wke" (or "kew")*/
public class LongestUniqueSubstring {
    public static String longestUniqueSubstring(String s) {
        String longest = "", current = "";
        for (char c : s.toCharArray()) {
            String sc = String.valueOf(c);
            if (current.contains(sc)) {
                current = current.substring(current.indexOf(sc) + 1);
            }
            current += sc;
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestUniqueSubstring("abcabcbb")); // abc
        System.out.println(longestUniqueSubstring("bbbbb"));    // b
        System.out.println(longestUniqueSubstring("pwwkew"));   // wke
    }
}

/*2. Question: Write a method that takes a string and returns the first non-repeated character. If all
characters are repeated, return null. Input: "swiss"
Output: "w" Input: "aabb"
Output: null*/
import java.util.LinkedHashMap;

public class FirstNonRepeatedChar {
    public static Character firstUniqueChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) == 1) return c;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("swiss")); // w
        System.out.println(firstUniqueChar("aabb"));  // null
    }
}

//StringBuffer
/*1. Question: Implement a method using StringBuffer to reverse every word in a sentence while
maintaining the word order. Input: "Java programming is fun"
Output: "avaJ gnimmargorp si nuf" Input: "Hello World"
Output: "olleH dlroW"*/
public class ReverseWords {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuffer(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Java programming is fun")); // avaJ gnimmargorp si nuf
    }
}

/*2. Question: Write a method using StringBuffer to efficiently remove all occurrences of a given
character from a string. Input: "programming", character: 'm'
Output: "prograing" Input: "banana", character: 'a'
Output: "bnn"*/
public class RemoveChar {
    public static String removeChar(String str, char ch) {
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ch) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeChar("programming", 'm')); // prograing
        System.out.println(removeChar("banana", 'a'));      // bnn
    }
}

//StringBuilder
/*1. Question: Implement a method using StringBuilder to efficiently generate all possible
substrings of a given string. Input: "abc"
Output: ["a", "ab", "abc", "b", "bc", "c"] Input: "xy"
Output: ["x", "xy", "y"]*/
import java.util.ArrayList;

public class SubstringGenerator {
    public static ArrayList<String> allSubstrings(String str) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i + 1; j <= sb.length(); j++) {
                result.add(sb.substring(i, j));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(allSubstrings("abc")); // [a, ab, abc, b, bc, c]
    }
}

/*2. Question: Create a method using StringBuilder to insert a space after every n characters in a
string, except at the end. Input: "ABCDEFGHIJKLMNOPQR", n=4
Output: "ABCD EFGH IJKL MNOP QR" Input: "programming", n=3
Output: "pro gra mmi*/
public class InsertSpaces {
    public static String insertSpaces(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = n; i < sb.length(); i += n + 1) {
            sb.insert(i, ' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(insertSpaces("ABCDEFGHIJKLMNOPQR", 4)); // ABCD EFGH IJKL MNOP QR
        System.out.println(insertSpaces("programming", 3));        // pro gra mmi ng
    }
}
