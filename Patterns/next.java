public class next{
    public void pattern7(int n) {
        
        int a=0;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                a++;
                System.out.print(a);
            
            }
        
            System.out.println();
            
            
            
        }

    }

    public static void main(String[] args) {
        next obj = new next();
        obj.pattern7(5);
    }



}

