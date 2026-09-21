import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n<0){
             System.out.println(-(n%10));
        }else{
             System.out.println(n%10);
        }

      
        
    }
}