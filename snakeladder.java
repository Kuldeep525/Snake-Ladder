public class snakeladder {
     public static final int SNAKE = 1 ;
     public static final int LADDER = 2;
     public static void main(String[] args){
    
    int dice ;
    int option ;
    
    
    
    option = (int)(Math.random()*3);
    switch ((int)option) {
             
              case LADDER:
                 dice = (int)(Math.random() * 6)+1;
                 System.out.println("you have moved ahead by " + dice);
                 break;
              case SNAKE:
                 dice = (int)(Math.random() * 6)+1;
                 System.out.println("you have moved behind  by " + dice);
                 break;
              default :
                 System.out.println("you have not played" );
                  break;
      }      
    
 }
}
    