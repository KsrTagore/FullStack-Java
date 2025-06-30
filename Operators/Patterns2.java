import java.util.Scanner;Add commentMore actions
/*class Patterns11 {
public static void main(String[] args) {
int n;
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++) {
System.out.print(" *");
}
System.out.println();
}
}
}*/ 
/*class Patterns12 {
public static void main(String[] args) {
int n;
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++) {
System.out.print(" *");
}
System.out.println();
}
for(int i=n-1;i>0;i--) {
for(int j=i;j<=2*n-i;j++) {
System.out.print(" ");
}
for(int k=0;k<2*i-1;k++) {
System.out.print(" *");
}
System.out.println();
}
}
}*/

/*class Patterns13 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}
for (int k = 1; k <= 2 * i - 1; k++) {
if (k == 1 || k == 2 * i - 1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
for (int i = n - 1; i >= 1; i--) {
for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}
for (int k = 1; k <= 2 * i - 1; k++) {
if (k == 1 || k == 2 * i - 1) {
 System.out.print("*");
}
 else {
System.out.print(" ");
}
}
System.out.println();
}        
}
}*/
/*class patterns14 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i==0 || j==0 || j==n-1 || i==n-1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*class Patterns15 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i==n/2 || j==n/2) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*class Patterns16 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=1;i<=n;i++) {
for(int j=1;j<=n;j++) {
if(i==j || j==n-i+1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*class Patterns17 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i==n/2 || j==n/2 || i==0 || j==0 || j==n-1 || i==n-1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*class Patterns18 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=n;i>0;i--) {
for(int j=0;j<i;j++) {
if(j==0 || i==n || j==i-1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*class Patterns19 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<=n;i++) {
for(int j=0;j<=i;j++) {
if(j!=i) {
System.out.print("*");
}
else {
System.out.print(j);
}
}
System.out.println();
}
}
}*/

class Patterns20 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<=n;i++) {
for(int j=0;j<=n;j++) {
if(j==0 || i==0 || i==j) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}Add comment
