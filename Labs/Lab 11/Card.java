public class Card {

    private int value;
    private String suit;

    public Card (int value, String suit){
        this.value = value;
        this.suit = suit;
    }

    public String getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }

    public String declareCard() {
        String result = null;
        switch(this.value) {
            case 11:
                result = "the Jack of " + this.suit;
                break;
            case 12:
                result = "the Queen of " + this.suit;
                break;
            case 13:
                result = "the King of " + this.suit;
                break;
            case 1:
                result = "the Ace of " + this.suit;
                break;
            default:
                result = "the " + this.value + " of " + this.suit;
        }
        return result;
    }
    
}
