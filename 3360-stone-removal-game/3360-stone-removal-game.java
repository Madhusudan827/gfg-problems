class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        boolean alice=true;
        boolean bob=false;
        boolean gameOver=false;
        int sequel=10;
        while(!gameOver){
             if(alice){
                if(sequel>n){
                    return false;
                }
                n=n-sequel;
                sequel--;
                alice=false;
                bob=true;
             }
             if(bob){
                if(sequel>n){
                    gameOver=true;
                    return true;
                }
                n=n-sequel;
                sequel--;
                bob=false;
                alice=true;
             }
        }
       
            return true;
        
    }
}  

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna