// Peter Gerdin

public class Integers2 {
    public static void main(String[] arg){
        double[] array = new double[5];

        for(int sub = 0; sub<5; sub++){
            array[sub] = Math.pow(2, sub + 1);
        }
        for(double x: array){
            System.out.println(x);
        }

        for(int sub = (array.length-1); sub > -1; --sub) {
            System.out.println(array[sub]);
        }
    }
}
