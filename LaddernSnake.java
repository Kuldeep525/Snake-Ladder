 public class LaddernSnake {
	   
    public static void main(String[] args){
    int position = 0 ; 
        System.out.println("position is ::" + position );
        int  diceValue = (int)(Math.random() *10) %6 + 1;
        Utility utility = new Utility();
        utility.playOption(position ,diceValue);   
}
}

    
    class Utility {
            
           public void playOption( int position , int diceValue ) {
           while ( position <= 99) {
 
    
                int option = (int)(Math.random() *10) % 3 + 1;
           switch ((int)option) {
             
             case 1:       
                System.out.println("you have not played so you are in smae position" );
                break;
             case 2:
                position = (position + diceValue);
                System.out.println("you have moved to ladder  by " + position );
                break;
            case 3:
              position = (position - diceValue);
                     if(position < 0 ){
                       position = 0;
                                          }
               
             System.out.println("your position after snake is" + position );
                 break;
           }
          
           
   }
  }  
}
  