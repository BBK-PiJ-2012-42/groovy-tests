String str = System.console().readLine()
int i = Integer.parseInt(str)
boolean isPrime = true

int j = 2
while (j < 100000) {
    j++;
    if (i != j) {
        if (i % j == 0) {
            isPrime = false;
        }
    }
}
if (isPrime) {
    println("That's prime!");
} else { println("That's not a prime!"); }    