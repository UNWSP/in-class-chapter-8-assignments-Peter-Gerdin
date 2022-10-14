// Peter Gerdin

public class integers10 {
    public static void main(String[] arg){
        int[] threeMult = {3,6,9,12,15,18,21,24,27,30};
        double sum = 0;

        for(int sub=0; sub < threeMult.length; ++sub){
            if(sub!=0){System.out.print(",");}
            System.out.print(threeMult[sub]);
        }
        System.out.print("\n");
        for(int sub = (threeMult.length-1); sub > -1; --sub){
            if(sub!= threeMult.length-1){System.out.print(",");}
            System.out.print(threeMult[sub]);
        }
        for(int x:threeMult){
            sum +=x;
        }
        System.out.print("\nsum: "+ sum);
        double aNum = sum/ threeMult.length;
        String average = String.format("%.2f", aNum);
        System.out.print("\naverage: "+average);
    }
}
