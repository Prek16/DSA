/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Preksha Agrawal
 */
public class maxMin {
    public static void main(String[]args){
        int[]arr = {1,2,3,4,5};
       System.out.println(max(arr));
       System.out.println(min(arr));
    }
    //imagine array is not empty
    static int max(int[]arr)
    {
        int maxVal=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxVal)
            {
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    static int min(int[]arr)
    {
        int minVal=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<minVal)
            {
                minVal=arr[i];
            }
        }
        return minVal;
    }
}
            
