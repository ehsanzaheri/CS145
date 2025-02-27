import java.util.*;

public class CardDealTest {
    private Stack<CardData> deck;
    private Random random;
    private int playerScore;
    private int compScore;

    public CardDealTest() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Stack<>();
        random = new Random();
        for (String suit : suits) {
            for (String rank : ranks) {
                CardData card = new CardData(rank, suit);
                deck.push(card);  // Add card to stack
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck, random);
    }

    public CardData dealCard() {
        if (deck.size() > 0) {
            return deck.pop();
        }
        return null;  // If no cards left, return null
    }

    public int findCardValue(CardData card) {
        int cardValue = 0;
        String rank = card.getRank();
        if (rank.equals("Ace")) {
            cardValue = 11;
        } else if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
            cardValue = 10;
        } else {
            cardValue = Integer.parseInt(rank);
        }
        return cardValue;
    }

    public void instructions() {
        System.out.println("Welcome to the game of BlackJack!");
        System.out.println("Both you and the computer will be dealt two cards.");
        System.out.println("You will be able to see one of the computer's cards.");
        System.out.println("You can draw another card if you wish, as can the computer.");
        System.out.println("When you are finished, your score and the computer's score will be shown.");
        System.out.println("The player with the highest score wins, unless they score over 21, in which case they lose.");
    }

    public int playerDeal() {
        playerScore = 0;
        CardData playerCard1 = dealCard();
        System.out.println("Card 1: " + playerCard1);
        playerScore += findCardValue(playerCard1);
        CardData playerCard2 = dealCard();
        System.out.println("Card 2: " + playerCard2);
        playerScore += findCardValue(playerCard2);
        System.out.println("Current Score: " + playerScore);
        return playerScore;
    }

    public int computerDeal() {
        compScore = 0;
        CardData compCard1 = dealCard();
        System.out.println("Dealer's Card: " + compCard1);
        compScore += findCardValue(compCard1);
        CardData compCard2 = dealCard();
        compScore += findCardValue(compCard2);
        return compScore;
    }

    public int hit(int playerScore) {
        System.out.println("Draw another card? (yes or no): ");
        Scanner input = new Scanner(System.in);
        String hit = input.next();
        if (hit.equals("yes")) {
            CardData playerCard = dealCard();
            System.out.println("Card: " + playerCard);
            playerScore += findCardValue(playerCard);
            System.out.println("Current Score: " + playerScore);
            return hit(playerScore);  // Recursively ask if the player wants another card
        }
        return playerScore;
    }

    public int compHit(int compScore) {
        if (compScore < 16) {
            CardData compCard = dealCard();
            compScore += findCardValue(compCard);
            return compHit(compScore);  // Recursively draw cards until comp score >= 16
        }
        return compScore;
    }

    public void gameResults(int playerScore, int compScore) {
        System.out.println("Your Score: " + playerScore);
        System.out.println("Dealer's Score: " + compScore);
        if (playerScore > 21) {
            System.out.println("You busted! Dealer wins.");
        } else if (compScore > 21) {
            System.out.println("Dealer busted! You win.");
        } else if (playerScore > compScore) {
            System.out.println("You win!");
        } else if (compScore > playerScore) {
            System.out.println("Dealer wins.");
        } else {
            System.out.println("It's a tie.");
        }
    }
}
