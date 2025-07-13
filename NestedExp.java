public class NestedExp {
    public static void main(String[] args) {
        int n = 30;
        for(int i=0;i<n;i++) { //runs from i=0 to i = 29
            for(int j = 0;j<n;j++) { //for each value of i,this runs from j = 0 to j<30
                if(i * j == 30) 
                System.out.println(i + " and " + j + " Product is the 30 ");
                
            }
        }
    }
    
}
