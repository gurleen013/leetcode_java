public class rightpyramid {
    public void pattern7(int n) {
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightpyramid obj = new rightpyramid();
        obj.pattern7(5);
    }



}
