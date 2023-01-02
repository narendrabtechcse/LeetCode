class Solution {
    public boolean detectCapitalUse(String word) {

        //If length is < 1 in that case condition always true
        if(word.length() < 2) return true;

        //Returning the solver function
        return solver(word);

        // Let's go see what's inside solver function
    }

    private boolean solver(String word){

        //First of all we need to separate word in 2 categories
        //One is word starting with Capital letter
        //Second is word starting with small letter
        
//This if block contain all word starting with upper case letter
        if(Character.isUpperCase(word.charAt(0))){
        
        //Now we need to further differentiate the word into 2 categories
        //1 is if second letter is also  upper case
        //2 is if second letter is also  upper case

            //This is block contain word having 1st and 2nd letter capital
            if(Character.isUpperCase(word.charAt(1))){
                
                //Now , go through all remaining letter and check if
                //there is any lower case letter
                //If it is there return false
                for(int i=2; i<word.length(); i++){
                    if(!Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }

            //This else block contain word having 1st upper case but 2nd lower case 
            }else{

                //Now , go through all remaining letter and check if
                //there is any Upper case letter
                //If it is there return false
                for(int i=2; i<word.length(); i++){
                    if(Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
            }

//This else block contain all word starting with lower case letter
        }else{

            //Now , go through all remaining letter and check if
            //there is any upper case letter
            //If it is there return false
            for(int i=1; i<word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))){
                        return false;
                }
            }
        }

        //If we not found any faults in word so return true at end
        return true;
    }
}