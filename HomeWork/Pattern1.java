package HomeWork;

public class Pattern1 {

    public static void main(String[] args) {

        int num = 5;
        for (int i = 1; i <= num; i++) {
            int temp =1;
            for (int j = 1; j <= num*2-1; j++) {
                if(i+j>=num+1 && j-i<=num-1){
                    if(j<num) {
                        System.out.print(temp + " ");
                        temp++;
                    }
                    else {
                        System.out.print(temp + " ");
                        temp--;
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
