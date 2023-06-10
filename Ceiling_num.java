/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hour;

/**
 *
 * @author Preksha Agrawal
 */
//ceiling=smallest number in array>=target
public class Ceiling_num {

    public static void main(String[]args)
    {
        int[]arr={2,3,5,9,14,16,18};
        int target=14;
        int ans=Ceiling_num(arr,target);
        System.out.println(ans);
    }
    static int Ceiling_num(int[]arr,int target)
    {
        if(target>arr[arr.length-1])
        {
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
            //find the middle element
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }else if (target>arr[mid])
            {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
