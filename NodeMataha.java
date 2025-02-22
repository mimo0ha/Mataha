package mataha;
public class NodeMataha {
    int n ,m;
    int nowX,nowY;
    int goalX,goalY;
    int [][] state ;
    public NodeMataha(int n,int m, int nowX, int nowY, int goalX, int goalY)
    {
    this.n = n;
    this.m = m;
    this.nowX = nowX;
    this.nowY = nowY;
    this.goalX = goalX;
    this.goalY = goalY;
    this.state = new int[n][m];
    }
    NodeMataha parent;
    int cost ;
    int heuristic ;
    int f = cost + heuristic ;
}
