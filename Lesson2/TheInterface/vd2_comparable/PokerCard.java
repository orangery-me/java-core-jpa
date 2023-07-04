package vd2_comparable;

public class PokerCard implements Comparable<PokerCard> {
    int suit; // 1->4
    int number;

    public PokerCard(int s, int n){
        this.suit= s;
        this.number= n;
    }

    public int compareTo(PokerCard p){

        if (this.number < p.number)
            return -1;

        if (this.number > p.number)
            return 1;
        else {

            if (this.suit < p.suit)
                return -1;
            if (this.suit > p.suit)
                return 1;

            return 0;

        }
    }
}
