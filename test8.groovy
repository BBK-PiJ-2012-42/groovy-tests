int highest = 0;
int inputInt = 0;
while (inputInt != -1) {
    print "New number: ";
    String inputStr = System.console().readLine();
    inputInt = Integer.parseInt(inputStr);
    if (inputInt > highest) { highest = inputInt } 
}
println highest + " is the biggest number you gave me."