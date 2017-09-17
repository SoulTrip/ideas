import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Ues Dynamic programming based on optimal sub structure property - A given problem has Optimal Substructure Property if optimal solution of the given problem 
 * can be obtained by using optimal solutions of its subproblems.
 * 
 */ 
public class LongestIncreasingSubsequence {
	public static void main (String[] args) {
	    LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence();
	    int[] sequence = new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80};
	    int[] lis = new int[sequence.length];
	    //initialize the optimal solutions for length one
	    for(int i =0; i<sequence.length; i++) {
	        lis[i] = 1;
	    }
	    System.out.println(obj.getLisLength(sequence, lis));
	}
	
	private int getLisLength(int[] sequence, int[] lis) {
	    for (int i=1; i < sequence.length; i++) {
	        if(sequence[i] > sequence[i-1])
	            lis[i] = lis[i] + lis[i-1];
	        else
	             lis[i] = lis[i-1];
	    }
	    return lis[lis.length-1];
	}
}
