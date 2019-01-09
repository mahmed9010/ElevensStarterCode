package Activity1;

/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    public static void main(String[] args){
        Card card1 = new Card("7","diamond",7);
        Card card2 = new Card("7","diamond",7);
        Card card3 = new Card("Jack","spades",11);
        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println(card3.toString());
        System.out.println(card1.matches(card2));
        System.out.println(card1.matches(card3));
        System.out.println(card2.matches(card1));
        System.out.println(card2.matches(card3));
    }
}
