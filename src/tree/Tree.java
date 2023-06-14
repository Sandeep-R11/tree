/*
import java.util.Scanner;
public class Kanpsack 
{
 public static void main(String[] args) 
 {
 
 Scanner sc = new Scanner(System.in);
 int i,j,m,n;
 float temp;
 float p[] = new float[10];
 float w[] = new float[10];
 float c[] = new float[10];
 
 System.out.print("Enter No. of Objects: ");
 n = sc.nextInt();
 
 System.out.println("Enter Weights:");
 for(i=1;i<=n;i++)
 w[i] = sc.nextFloat();
 
 System.out.println("Enter Profits: ");
 for(i=1;i<=n;i++)
 p[i] = sc.nextFloat();
 
 System.out.println("Enter Knapsack Size");
 m = sc.nextInt();
 
 for(i=1;i<=n;i++)
 c[i] = p[i]/w[i];
 
 for(i=1;i<=n;i++)
 {
 for(j=1;j<=n-i;j++)
 {
 
 if(c[j] < c[j+1])
 {
 temp = c[j];
 c[j] = c[j+1];
 c[j+1]= temp;
 
 temp = w[j];
 w[j] = w[j+1];
 w[j+1] = temp;
 
 temp = p[j];
 p[j] = p[j+1];
 p[j+1] = temp;
 }
 
 }
 }
 
 System.out.println("\n\tThe Items are arranged as \n");
 System.out.print("\n\tItems\tWeights\tProfits\tProfit/Weight\n\n");
 for(i=1;i<=n;i++)
 {
 System.out.println("\t"+i+"\t"+w[i]+"\t"+p[i]+"\t"+c[i]);
 }
 
 float x[] = new float[10];
 float U, profit = 0;
 U = m;
 for(i=1;i<=n;i++)
 x[i]=0;
 for(i=1;i<=n;i++)
 {
 if(w[i] > U) break;
 x[i]=1;
 U= U-w[i];
 }
 if(i<n)
 x[i] = U/w[i];
 System.out.println("\n\t The Solution Vector is : ");
 for(i=1;i<=n;i++)
 System.out.println("\n\t\tx["+i+"] = "+x[i]);
 
 for(i=1;i<=n;i++)
 profit = profit + (p[i] * x[i]);
 System.out.println("\n\t Maximum Profit = "+profit);
 }
}

xxxxxxxxxxxxxxxxxxxxx

import java.util.Scanner;
public class Prims {
 public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
 int cost[][]= new int[10][10];
 int visited[] = new int[10];
 int i, j, n,ne = 1, a = 0, b = 0, u = 0, v = 0;
 int min,mincost = 0;
 System.out.println("Enter the Number of Nodes: ");
 n = sc.nextInt();
 System.out.println("Enter the Cost Matrix:");
 for(i=1; i<=n; i++)
 {
 for(j=1; j<=n; j++)
 {
 cost[i][j] = sc.nextInt();
 }
 } 
 for(i=1;i<=n;i++)
 visited[i] = 0;
 System.out.println("\n\n\t Prims Algorithm\n");
 System.out.println("\n\tThe Edges of Spanning Trees are: ");
 visited[1] = 1;
 while(ne<n)
 {
 min = 999;
 for(i=1;i<=n;i++)
 {
 for(j=1;j<=n;j++)
 {
 if(cost[i][j] < min)
 {
 if(visited[i] == 0)
 continue;
 else
 {
 min = cost[i][j];
 a = u = i;
 b= v = j;
 }
 }
 }
 }
 
 
 if(visited[u] == 0 || visited[v] == 0)
 {
 System.out.println("\n\t"+ne+" Edge ["+a+","+b+"] = "+min);
 ne++;
 mincost += min;
 visited[b] = 1;
 }
 cost[a][b]=cost[b][a]=999;
 }
 System.out.println("\n\tMinimum Cost = "+mincost);
 }
}
*/

