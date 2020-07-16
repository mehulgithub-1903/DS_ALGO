package strings;

public class largestAndSmallestSubstring {
	public static void main(String [] args) {
    String a="ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
   System.out.println(getSmallestAndLargest(a, 240));
		
}
	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";

largest=smallest=s.substring(0, k);
int start=1;
int end=start+k;
	     while(end<=s.length()) {
	    	if(s.substring(start, end).compareTo(smallest)<0) {
	    		smallest=s.substring(start,end);
	    		start++;
	    		end++;
	    	}
	    	else if(s.substring(start, end).compareTo(largest)>0) {
	    		largest=s.substring(start,end);
	    	start++;
	    	end++;
	    	}
	    	else {
	    		start++;
	    		end++;
	    		}
	     }
	        return smallest + "\n" + largest;
	    }
}
