import java.util.*;
public class Matrix
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the rows:");
int m=sc.nextInt();
System.out.println("enter the columns:");
int n=sc.nextInt();
int[][] mat1=new int[m][n];
int[][] mat2=new int[m][n];
int[][] sum=new int[m][n];
System.out.println("enter first matrix");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
mat1[i][j]=sc.nextInt();
}}
System.out.println("enter second matrix");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
mat2[i][j]=sc.nextInt();
}}
//addition of matrices
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
sum[i][j]=mat1[i][j]+mat2[i][j];
}}
System.out.println("sum of the matrices");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(sum[i][j]+"\t");
}
System.out.println();
}}
}
