public class CardGameTest {
    public static void main(String[] args) {
        int playerScore = 0;
        int compScore = 0;
        CardDealTest myDeck = new CardDealTest();

        myDeck.shuffle();
        myDeck.instructions();
        compScore = myDeck.computerDeal();
        playerScore = myDeck.playerDeal();
        compScore = myDeck.compHit(compScore);
        playerScore = myDeck.hit(playerScore);
        myDeck.gameResults(playerScore, compScore);
    }
}
