class Solution {
    public int numDecodings(String s) {
        int n = s.length(), oneStep = 1, twoStep = 0;
		if(n==0 || s.charAt(0)=='0') return 0;
		for(int i=1;i<n;i++){
			int oneDigit = Character.getNumericValue(s.charAt(i));
			int twoDigit = Character.getNumericValue(s.charAt(i-1))*10 + oneDigit;
            int curStep = 0;
			if(oneDigit != 0) curStep+=oneStep; 
			if(twoDigit >=10 && twoDigit <= 26){
				if(i<2) curStep++; // two step is not evaluated until after 2 steps
				else curStep+=twoStep;
			}
            twoStep = oneStep;
            oneStep = curStep;
		}	
		return oneStep;
    }
}