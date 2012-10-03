int cardNo = 0;
rank= new Object[5];
suit= new Object[5];
boolean rankValid;
boolean suitValid;
String rankStr;
String suitStr;
boolean nothing = true;

while (cardNo < 5) {
    rankValid = false;
    while (rankValid == false) {
        print "Rank for card no "+ (cardNo+1) + " :";
        rankStr = System.console().readLine();
        if (rankStr == "J") { rankValid = true; }
        if (rankStr == "Q") { rankValid = true; }
        if (rankStr == "K") { rankValid = true; }
        try{ if (Integer.parseInt(rankStr)>0 && Integer.parseInt(rankStr)<11) { rankValid = true; } }catch(e){}
        if (rankValid == false) { println "Sorry that is not a valid rank. Please use 1 to 10 or J, Q, K" }
    }
    suitValid = false;
    while (suitValid == false) {
        print "Suit for card no "+ (cardNo+1) + " :";
        suitStr = System.console().readLine();
        if (suitStr == "s") { suitValid = true; }
        if (suitStr == "h") { suitValid = true; }
        if (suitStr == "d") { suitValid = true; }
        if (suitStr == "c") { suitValid = true; }
        if (suitValid == false) { println "Sorry that is not a valid suit. Please use s, h, d or c." }
    }
	
	// Must add check that the new card does not already exist.
    
    rank[cardNo]= rankStr;
    suit[cardNo]= suitStr;
    cardNo++;
}

// Check for same suit.
boolean sameSuit = true
suit.each{ if ( it != suit[1] ) { sameSuit = false } }
// Check for sequence.
// First covert ranks to integers and sort them.
integerRank= new Object[5];
int i = 0;
while (i < 5) {
	if ( rank[i] == "J" ) {
		integerRank[i] = 11;
	}else if ( rank[i] == "Q" ) {
		integerRank[i] = 12;
	}else if ( rank[i] == "K" ) {
		integerRank[i] = 13;
	}else {
		integerRank[i] = Integer.parseInt(rank[i]);
	}
	i++;
}
integerRank.sort()
// println integerRank;

// Check if rank is in sequence.
boolean inSequence = true;
i = 1;
int lastValue = integerRank[0];
while ( i < 5 && inSequence ) {
	if ( integerRank[i] - lastValue != 1 ) {
		inSequence = false;
	}
	lastValue = integerRank[i];
	i++;
}
// println inSequence;

// Check for straight flush.
if ( sameSuit && inSequence ) {
	println "Straight Flush!"
	nothing = false;
}

// Check for Poker.
boolean poker = false;
int sameRankCount = 0;
integerRank.each{ 
	if ( it == integerRank[1] ) { sameRankCount++; }
	if ( sameRankCount == 4 ) { 
		poker = true;
		nothing = false;
	}
}
sameRankCount = 0;
integerRank.each{ 
	if ( it == integerRank[0] ) { sameRankCount++; }
	if ( sameRankCount == 4 ) { 
		poker = true;
		nothing = false;
	}
}

if ( poker ) { println "Poker!" }
if ( nothing ) { println "Sorry that hand is worth zip!" }

// Check for a full house.



