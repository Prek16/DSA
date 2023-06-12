/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Preksha Agrawal
 */
public class SortedMatrix {
    public static void main(String[]args)
    {
        int [][]arr={
            {},
            {},
            {}
        };
        System.out.println(Arrays.toString(search(arr,6)))
    }
    static int[]Binarysearch(int[][]matrix,int row,int cStart,int cEnd,int target)
    {
        while(cStart<=cEnd)
                {
                 int mid= cStart+ (cEnd-cStart)/2;
                if(matrix[row][mid]==target)
                {
                    return new int[]{row,mid};
                }
                if(matrix[row][mid]<target)
                {
                    cStart=mid+1;
                }else
                {
                     cEnd=mid-1;
                }
                }
         return new int[]{-1,-1};
    }
    static int[]search(int[][]matrix,int target)
    {
        int r=matrix.length;
        int c=matrix[0].length;
        if(r==1)
        {
            return Binarysearch(matrix,row:0,cStart:0,cEnd:c-1,target);
        }
        int rStart=0;
        int rEnd=r-1;
        int cMid=c/2;
        
        while(rStart<(rEnd-1))
        {
                int mid= rStart+ (rEnd-rStart)/2;
                if(matrix[cMid][mid]==target)
                {
                    return new int[]{cMid,mid};
                }
                if(matrix[cMid][mid]<target)
                {
                    rStart=mid;
                }else
                {
                     rEnd=mid;
                }
                }
        if(matrix[cMid][rStart]==target)
        {
            return new int[]{rStart,cMid};
        
    }
         if(matrix[cMid][rStart+1]==target)
             {
        return new int[]{rStart+1,cMid};
        }
    if(target<=matrix[rStart+1][cMid-1])
    {
        return binarySearch(matrix,rStart,cStart:0,cEnd:cMid-1,target);
    }
    if(target>=matrix[rStart][cMid+1] && target<=[rStart][c-1])
    {
        return binarySearch(matrix,rStart,cStart:cMid+1,cEnd:c-1,target);
    }
    if(target<=matrix[rStart+1][cMid-1])
    {
        return binarySearch(matrix,row:rStart,cStart:0,cEnd:cMid-1,target);
    }else
    {
        return binarySearch(matrix,rStart,cStart:cMid+1,cEnd:c-1,target);
    }
    }
}
