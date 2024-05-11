package HomeWork;

public class Pattern3 {

    public static void main(String[] args) {

        int num =5;
        for (int i = 1; i <= 2*num-1 ; i++) {
            int temp = 65;
            for (int j = 1; j <=2*num-1 ; j++) {

                if(i+j<=num+1 || j-i>=num-1 || i-j>=num-1 || i+j>=3*num-1){
                    if(j<=num){
                        System.out.print((char) temp+" ");
                        if (j==num && (i!=1 || i!=2*num))continue;
                        temp++;
                    }
                    else {
                        temp--;
                        System.out.print((char) temp+" ");
                    }
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
