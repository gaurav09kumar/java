
public class SumExample2 {
public static void
main(String[] args) {
int next, sumSoFar;
next = Integer.parseInt(args[0]);
sumSoFar = next;
next = Integer.parseInt(args[1]);
sumSoFar += next;
next = Integer.parseInt(args[2]);
sumSoFar += next;
next = Integer.parseInt(args[3]);
sumSoFar += next;
System.out.println("Sum: " + sumSoFar);
}
}