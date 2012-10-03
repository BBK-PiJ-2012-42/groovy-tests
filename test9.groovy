int lastNumber = 0;
int inputInt = 0;
boolean inSequence = true;


while (inputInt != -1) {
    print "New number: ";
    String inputStr = System.console().readLine();
    inputInt = Integer.parseInt(inputStr);
    if (inputInt > lastNumber) { lastNumber = inputInt } else {
        if (inputInt != -1) { inSequence = false }
        };
}

if (inSequence) {
    println "Yes"
} else { println "No" }