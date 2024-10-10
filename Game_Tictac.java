import java.util.Scanner;
class Game_Tictac{
    Boolean Tictac[][]=new Boolean[3][3];
    public static void main(String[] args) {
        Game_Tictac tictac = new Game_Tictac();
        tictac.intialize();    
        tictac.start_game();
    }
    void intialize(){
        for(int i =0 ; i<=2;i++){
            for(int j=0;j<=2;j++){
               
                Tictac[i][j]=null;

            }}
    }
    void start_game(){
        
       intialize();
        Scanner player1 = new Scanner(System.in);
        Scanner player2 = new Scanner(System.in);
        int count_turn = 0;
        boolean over=false;
        while (true) {
            draw_toe();
            if(count_turn%2==0){
                System.out.println("Player one turn (enter the column number you want to mark)");
                int player1_turn =Integer.parseInt( player1.nextLine());
                turn_play(player1_turn,true);
               }
               over=column_check()||row_check()||diagonal_check()|| draw_game();
        
               if(over==true) {
                   break;
               }
            if(count_turn%2==0){
                System.out.println("Player two turn (enter the column number you want to mark)");
                int player2_turn =Integer.parseInt( player2.nextLine());
                turn_play(player2_turn,false);
               }   
           
        

    }
    player1.close();
    player2.close();
    }

      void turn_play(int box,Boolean value){
        int count=0;
        
        for(int i =0 ; i<3;i++){
            for(int j=0;j<3;j++){
                count++;
               if(count == box ){
                if(Tictac[i][j]!=null){
                    System.out.print("Enter valid input\n");
                }
                Tictac[i][j]=value;
                break;
            }
        }
    }}

     boolean column_check(){
    
   
        for(int i =0 ; i<=2;i++){
            int count_consecetive_player1=0;
    int count_consecetive_player2=0;
            for(int j=0;j<=2;j++){
                
               if(Tictac[j][i]!=null){
                if(Tictac[j][i]==true){
                    
                    count_consecetive_player1+=1;
                  
                }
                if(Tictac[j][i]==false){
                   
                    count_consecetive_player2+=1;
                    
                }
               }
               
            }
            if(count_consecetive_player1==3){
                System.out.println("player1 wins");
                game_over();
                return true;
         
            }
            if(count_consecetive_player2==3){
                System.out.println("player2 wins");
                game_over();
                return true;
         
            }
           }
       
    return false;
     }

     
     boolean row_check(){
    
   
        for(int i =0 ; i<=2;i++){
            int count_consecetive_player1=0;
    int count_consecetive_player2=0;
            for(int j=0;j<=2;j++){
                
               if(Tictac[i][j]!=null){
                if(Tictac[i][j]==true){
                    
                    count_consecetive_player1+=1;
                  
                }
                if(Tictac[i][j]==false){
                   
                    count_consecetive_player2+=1;
                    
                }
               }
               
            }
            if(count_consecetive_player1==3){
                System.out.println("player1 wins");
                game_over();
                return true;
         
            }
            if(count_consecetive_player2==3){
                System.out.println("player2 wins");
                game_over();
                return true;
         
            }
           }
       
    return false;
     }


     boolean diagonal_check(){
    
   
        for(int i =0 ; i<=2;i++){
            int count_consecetive_player1=0;
    int count_consecetive_player2=0;
            for(int j=0;j<=2;j++){
                if(i==j){
                   
               if(Tictac[i][j]!=null){
                if(Tictac[i][j]==true){
                    count_consecetive_player1+=1;  
                }
                if(Tictac[i][j]==false){
                   
                    count_consecetive_player2+=1;
                    
                }
               }
               
            }
            else if(i==j+2-i){
                if(Tictac[i][j]!=null){
                    if(Tictac[i][j]==true){
                        count_consecetive_player1+=1;  
                    }
                    if(Tictac[i][j]==false){
                       
                        count_consecetive_player2+=1;
                        
                    }
                   }

            }
        
        
        
        
        
        
        }
            if(count_consecetive_player1==3){
                System.out.println("player1 wins");
                game_over();
                return true;
         
            }
            if(count_consecetive_player2==3){
                System.out.println("player2 wins");
                game_over();
                return true;
         
            }
           }
       
    return false;
     }

     void draw_toe(){
        for(int i=0 ; i<= 2;i++){
            
           
            for(int j=0 ; j<= 2; j++){
                
                if(Tictac[i][j]==null){
                    System.out.print("   ");
                    System.out.print("|");
                }
                else if(Tictac[i][j]==true){
                    System.out.print("P1 ");
                    System.out.print("|");
                }
                else if(Tictac[i][j]==false){
                    System.out.print("P2 ");
                    System.out.print("|");
                }
            }
            System.out.print("\n-------------\n");

        }
     }



     boolean draw_game(){
      int box_fill=0;
        for(int i =0 ; i<=2;i++){
            for(int j=0;j<=2;j++){
               
              if(  Tictac[i][j]!=null){
                box_fill++;

              }

            }}

        if(box_fill==9){
            System.out.println("Draw Game");
            game_over();
         
            return true;
        }    
        return false;
     }
     void game_over(){
        draw_toe();
        System.out.println("\nThanks for playing!");
     }
}