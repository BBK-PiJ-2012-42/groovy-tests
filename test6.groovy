println "Dividend please:"
String str1 = System.console().readLine()
int dividend = Integer.parseInt(str1)

println "Divisor please:"
String str2 = System.console().readLine()
int divisor = Integer.parseInt(str2)

int quotent = 0
int remainder = 0

int runningValue = dividend

println runningValue

while (runningValue > 0) {
    runningValue = runningValue - divisor;
    quotent++;
}
if (runningValue != 0) {
quotent--;
remainder = runningValue + divisor;
}

println dividend + " divided by " + divisor + " is " + quotent + " remainder " + remainder   