package vd2_comparable;

public class Main {
    public static void main(String[] args){
        PokerCard tenOfSpades= new PokerCard(1, 10); // 10 bich
        PokerCard fiveOfDiamond= new PokerCard(3, 5);
        PokerCard tenOfDiamond= new PokerCard(3, 10);

        System.out.println(fiveOfDiamond.compareTo(tenOfSpades));
        System.out.println(tenOfDiamond.compareTo(fiveOfDiamond));
        System.out.println(tenOfDiamond.compareTo(tenOfDiamond));

    }
}
