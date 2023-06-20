/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tcs_nqt;

/**
 *
 * @author Preksha Agrawal
 */
import java.util.*;
public class coin_distribution_problem {

    public static void main(String[] args) {
        System.out.println("Number: ");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        int one=0,two=0;
        int five=(number-4)/5;
        
        if(((number-5*five)%2)==0)
        {
            one=2;
        }else
        {
            two=(number-5*five-one)/2;
        }
            
            
    }
}
