package mataha;
import java.util.Scanner;
public class Mataha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      BoardMataha board = new BoardMataha();
      int x=1 , y=3 ;
      NodeMataha n = board.initializeBoard(x,y);
      boolean ff = true ;
      do {
         System.out.println( "\n" +"Enter strategy you want to  play with : " + "\n" +
                                " 1) User Game . "  + "\n" +
                                " 2) DFS . " + "\n" +
                                " 3) BFS . " + "\n" + 
                                " 4) UCS . " + "\n" + 
                                " 5) HILL . " + "\n" + 
                                " 6) A*  . " + "\n" +
                                " 7) DFS AA  . " + "\n" +
                                " 8) Exit . "                  
                                ) ;
         int typeOfGame = input.nextInt();
         switch(typeOfGame)
        {
            case 1 :
                do {
                    System.out.println("-------------------- \n"
                    + " W to go Up \n"
                    + " S to go Down \n"
                    + " D to go Right \n"
                    + " A to go Left \n");
                    char c ;
                    c = input.next().charAt(0);    
                    board.move(n,n.nowX,n.nowY,c);
                    board.creatNextstate(n);
                }while( ! board.isFinal(n));
                System.out.println(".....YOU Win.....");
                break;
            case 2 :
            {
                //Node node = n;
                System.out.println(" DFS Solution : ") ;
                board.dfs(n) ;
                System.out.println(" DFS finish  ") ;
                break;
            }
            case 3 :
            {
                //Node node = n;
                System.out.println(" BFS Solution : ") ;
                board.bfs(n);
                System.out.println(" BFS finish  ") ;
                break;
            }
            case 4 :
            {
                System.out.println(" UCS Solution : ") ;
                board.ucs(n);
                System.out.println(" UCS finish  ") ;
                break;
            }
            case 5 :
            {
                System.out.println(" HILL Solution : ") ;
                board.Hill(n);
                System.out.println(" HILL finish  ") ;
                break;
            }
            case 6 :
            {
                System.out.println(" A star Solution : ") ;
                board.aStar(n);
                System.out.println(" A star finish  ") ;
                break;
            }
            case 7 :
            {
                System.out.println(" DFS AA Solution : ") ;
                board.aadfs(n);
                System.out.println(" DFS AA finish  ") ;
                break;
            }
            default :{
                    ff=false ;
                    System.out.println("<<---Thank You for Play --->>");
                }
                input.close();
            }
        }while(ff);
        
    }
    
}
