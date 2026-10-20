public class v{
    public void pattern7(int n) {
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print(" ");
            }

            for(int j=2;j<=i;j++){
                System.out.print(i-j+1);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        v obj = new v();
        obj.pattern7(5);
    }



}

