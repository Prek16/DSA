/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Preksha Agrawal
 */
import java.util.*;
public class Supermkt_problem {
    public static void main(String[]args)
    {
        
    
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int res=1;
    while(n>0)
    {
        res=res*(n%10);
        n=n/10;
    }
    System.out.println(res);
}
}
