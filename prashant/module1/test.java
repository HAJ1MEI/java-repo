package prashant.module1;

public class test {
    public static void main(String[] args) {
        int n = 7;
        int mid = n/2;

        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                if(j<=mid){
                    if(j>=mid-1 && j<mid+1){
                        System.out.print("*");
                    }
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
