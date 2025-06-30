class Methods{More actions
static int a=10;
static int b=20;
int c=30;
int d=40;
{
System.out.println("Instance method");
System.out.println(c);
System.out.println(d);
}
static{
System.out.println("Static method");
System.out.println(a);
System.out.println(b);
}
public static void main(String[] jaya){
System.out.println("Main method");
Methods m=new Methods();
m.Display();
}
}*/
/* 2).
/*
class Methods{
static int a=10;
static int b=20;
static void Display(){
int c=30;
int d=40;
System.out.println(c);
System.out.println(d);
}
static{
System.out.println("Static method");
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
public static void main(String[] jaya){
Methods m=new Methods();
System.out.println("Main method");
int c=30;
int d=40;
m.Display();
}
}*/
/* 3).
@@ -42,7 +47,7 @@
static int b=20;
int c=30;
int d=40;
{
void call(){
System.out.println("Instance method");
System.out.println(c);
System.out.println(d);
@@ -55,6 +60,7 @@
public static void main(String[] jaya){
System.out.println("Main method");
Methods m=new Methods();
m.call();
}
}*/
/* 4).
@@ -63,20 +69,21 @@
static int b=20;
int c=30;
int d=40;
void call(){
void staticcall(){
System.out.println("Instance method");
System.out.println(c);
System.out.println(d);
System.out.println(a);
System.out.println(b);
}
static{
static void display() {
System.out.println("Static method");
call();
}
public static void main(String[] jaya){
System.out.println("Main method");
Methods m=new Methods();
m.call();
m.display();
}
}*/
/* 5).
@@ -85,7 +92,7 @@
static int b=20;
int c=30;
int d=40;
{
void call(){
System.out.println("Instance method");
System.out.println(c);
System.out.println(d);
@@ -99,10 +106,11 @@
public static void main(String[] jaya){
System.out.println("Main method");
Methods m=new Methods();
m.call();
}
}*/
/* 6).
class static{
class Methods{
static int a=10;
static int b=20;
int c=30;
@@ -124,21 +132,20 @@
int d=40;
void Display(){
System.out.println("Instance method");
System.out.println(c);
System.out.println(d);
}
static void display(){
System.out.println("Static method");
System.out.println(a);
System.out.println(b);
}
public static void main(String[] jaya){
System.out.println("Main method");
Methods m=new Methods();
m.display();
System.out.println(m.a);
System.out.println(m.b);
System.out.println(m.c);
System.out.println(m.d);
display();
m.Display();
}
}*/
