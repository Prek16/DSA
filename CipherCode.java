/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Preksha Agrawal
 */
import java.util.*;
public class CipherCode {
    public static void main(String[]args)
    {
    Scanner sc= new Scanner(System.in);
    String str=sc.next();
    String res="";
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)<='u')
        res=res+(char)(str.charAt(i)+5);
        else
        res=res+(char)(str.charAt(i)-'v'+'a');
    }
        System.out.println(res);
    }

}