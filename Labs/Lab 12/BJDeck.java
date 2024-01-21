public class BJDeck {
    
    public BJCard drawCard() {
        int value = (int)((Math.random()*13)+1);
        int sut = (int)((Math.random()*4)+1);
        String suit = null;
        switch(sut) {
            case 1:
                suit = "Spades";
                break;
            case 2:
                suit = "Clubs";
                break;
            case 3:
                suit = "Hearts";
                break;
            case 4:
                suit = "Diamonds";
                break;    
        }

        return new BJCard(value,suit);
    }
    
}
