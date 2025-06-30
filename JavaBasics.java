class JavaBasics {Add commentMore actions
static int number = 10;
//1
public void displayMessage() {
System.out.println("Hello!");
}
public static void main(String[] args) {
System.out.println("My name is Jayaram");
//2
int age = 22;
boolean isStudent = true;
char grade = 'A';
float height = 5.4f;
double weight = 50.55;
System.out.println("Age: " + age);
System.out.println("Is Student: " + isStudent);
System.out.println("Grade: " + grade);
System.out.println("Height: " + height);
System.out.println("Weight: " + weight);
//3
int number = 20;
System.out.println("Local variable: " + number);
System.out.println("Global variable: " + JavaBasics.number);
//4
printMyName();
JavaBasics obj = new JavaBasics();
obj.displayMessage();
}
//5
public static void printMyName() {
System.out.println("My name is Jayaram");
}
}
