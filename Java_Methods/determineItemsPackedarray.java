package Java_Methods;
public class determineItemsPackedarray {
    public static void main(String[] args) {
        int[] boxes= {12,15,9,14,8,12};
        int totalValidItems=0;
        for (int i : boxes) {
            if(i<10){
                System.out.println(i +" :This box is underfilled");
                continue;
            }
            
                System.out.println(i+ " :This box is ready to send.");
            

           totalValidItems = totalValidItems + i; 
        }
        
        System.out.println("The total valid items is: "+totalValidItems);


    }
}
