

int lowest = 0
int middle = 0
int highest = 0

i = 0
while (i < 3) {
    println "New number please!";
    String input = System.console().readLine();
    int number = Integer.parseInt(input);
    if (i == 0) {
        highest = number;
    } else {
        if (number > highest) {
            lowest = middle;
            middle = highest;
            highest = number;
        } else if ( number < middle ) {
            highest = middle;
            middle = lowest;
            lowest = number;
        } else {
            middle = number;
        }
    } 
    i++;
}

println highest;
println middle;
println lowest;