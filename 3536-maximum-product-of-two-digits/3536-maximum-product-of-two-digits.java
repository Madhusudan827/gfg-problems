class Solution {
    public int maxProduct(int n) {
      ArrayList<Integer> al=new ArrayList<>();
        int product=1;
        while(n>0){
           al.add(n%10); 
            n=n/10;
        }
        Collections.sort(al);
        product=al.get(al.size()-2)*al.get(al.size()-1);
        return product;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna