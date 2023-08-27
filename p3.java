// 3. Write a program to determine whether the entered character is vowel or not

import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            System.out.println("Charecter is vowel");
        }
        else{
            System.out.println("Charecter is not vowel");
        }

    }
}
