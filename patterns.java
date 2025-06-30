import java.util.Scanner;Add commentMore actions

class patterns{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter n:");
int n=s.nextInt();
/* 1).
for(int i=0;i<=n;i++){
for(int j=0;j<n;j++){
System.out.print("*");
}
System.out.println();
}

/* 2).
 for(int i=1;i<=n;i++){
for(int j=1;j<n;j++){
System.out.print(i);
}
System.out.println();
}*/

/* 3).
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.print(j);
}
System.out.println();
}*/

/* 4).
int k=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.print(k+"	");
k+=2;
}
System.out.println();
}
*/

/* 5).
int k=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.print(k+"	");
k++;
}
System.out.println();
}*/

/*6).
int k=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.print(k+"	");
if(k==9){
k=1;
continue;
}
k++;
}
System.out.println();
}
*/

/* 7).
int i,j;
for(i=1;i<=n;i++){
for(j=1;j<n;j++){
if(j%2==1){
System.out.print("1");
}
else{
System.out.print("0");
}
}
System.out.println();
}
*/
/* 8).
int i,j,k;
for(i=1;i<=n;i++){
for(j=n-i;j>=0;j--){
System.out.print(" ");
}
for(k=1;k<=i;k++){
System.out.print(" *");
}
System.out.println();
}*/
/* 9).
for(int i=1;i<=n;i++) {
for (int j=n;j>i;j--) {
System.out.print(" ");
}
for(int k=1;k<=i;k++) {
System.out.print((2 * k) + " ");
}
System.out.println();
}*/
int i,j,k;
for(i=1;i<=n;i++){
for(j=n-i;j>=0;j--){
System.out.print(" ");
}
for(k=1;k<=i;k++){
System.out.print(" *");
}
System.out.println();
}
}
}
