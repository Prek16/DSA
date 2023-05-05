/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Preksha Agrawal
 */
public class evendigits {
  
    public static void main(String[]args)
    {
        int[]nums={12,455,1,7,5469};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    //function to check whether it has even digits or not
    static boolean even(int num)
    {
      int digits=digits(num);
         return  digits%2==0;
    }
    //count number of digits in a number
    static int digits(int num)
    {
        int count=0;
              while(num>0)
              {
                  count++;
                  num=num/10;
              }
        return count;
    }
}

