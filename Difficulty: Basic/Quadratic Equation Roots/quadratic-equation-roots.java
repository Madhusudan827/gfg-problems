class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
       ArrayList<Integer> al=new ArrayList<>();
        
       int D=b*b-4*a*c;
       if(D<0){
           al.add(-1);
         
           return al;
       }
      double root1=(-b+Math.sqrt(D))/(2.0*a);
     double root2=(-b-Math.sqrt(D))/(2.0*a);
     int r1=(int) Math.floor(root1);
     int r2=(int) Math.floor(root2);
     if(r1<r2){
         al.add(r2);
         al.add(r1);
         
     }else{
         al.add(r1);
         al.add(r2);
     }
     return al;
    
       
        
        
    }
}