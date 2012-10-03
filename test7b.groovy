println "First number please!";
String inputA = System.console().readLine();
int A = Integer.parseInt(inputA);

println "Second number please!";
String inputB = System.console().readLine();
int B = Integer.parseInt(inputB);

println "Last number please!";
String inputC = System.console().readLine();
int C = Integer.parseInt(inputC);

if (A > B && B > C) { println A + " " + B + " " + C }
if (A > C && C > B) { println A + " " + C + " " + B }
if (B > C && C > A) { println B + " " + C + " " + A }
if (B > A && A > C) { println B + " " + A + " " + C }
if (C > A && A > B) { println C + " " + A + " " + B }
if (C > B && B > A) { println C + " " + B + " " + A }
