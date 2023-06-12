/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Preksha Agrawal
 */
public class RowColmatrix {
    public static void main(String[]args)
    {
        int[][]arr={
        {},
            {},
            {}
        };
                }
    static int[] search(int[][]matrix,int target)
    {
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>0)
        {
            if(matrix[r][c]==target)
            {
                return new int[]{r,c};
            }
             if(matrix[r][c]<target)
             {
                 r++;
             }else
             {
                 c--;
             }
        }
        return new int[]{-1,-1};
    }
}
