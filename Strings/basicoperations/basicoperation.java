import java.util.*;
public class basicoperation{


    //striver nqt sheet questions QS 2
    public static void countVowelConsonantSpace(String s){
        int vowel=0;
        int consonant=0;
        int space=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')vowel++;
            else if(ch>='a' && ch<='z')consonant++;
            else if(ch==' ') space++;
        }

        System.out.println(" Vowel is "+vowel+" consonant is "+consonant+" spaces is "+space);
    }
 public static void main(String args[]){
    String str="Take u forward is Awesome";
    countVowelConsonantSpace(str);

 }
} 