class TwoDToOneD
{
public static void main(String args[])
{
int arr2D[][]={
{1,2,3},
{4,5,6},
{7,8,9}};
int rows = arr2D.length;
int cols = arr2D[0].length;
int arr1D[]= new int[rows*cols];
int index = 0;
for(int i =0;i<rows;i++)
{
for(int j =0; j<cols;j++)
{
arr1D[index++] = arr2D[i][j];
}
}
for (int i = 0; i < arr1D.length; i++) 
{
System.out.print(arr1D[i] + " ");
}
}
}