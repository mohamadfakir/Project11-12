package deckofcards;

    import java.util.Random;

    public class DeckofCards {
        String suit[] = {"Clubs","Diamonds","Hearts","Spades"};
        String rank[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","king","Ace"};
        String deck[] = new String[52];
        String cardPlay[][] = new String[4][9];

        Random random = new Random();


        /*
         * Shuffle cards with random method
         */
        public String[] shuffleCards() {
            String temp;
            for(int i=0; i<deck.length; i++) {
                int j = random.nextInt(52); // Getting Random Number Between 0 to 52 for cards
                //Swapping with random cards
                temp = deck[i];
                deck[i] = deck[j];
                deck[j] = temp;
            }
            return deck;
        }

        /*
         * getting cards according to their rank and suits
         */
        public void gettingCards() {
            int deckIndex = 0;
            for(int i=0; i<suit.length; i++) {
                for(int j=0; j<rank.length; j++) {
                    //put rank and suit together
                    deck[deckIndex] = rank[j] + " of " + suit[i];
                    deckIndex++; //Incrementing Deck
                }
            }
        }

        public void displayCards() {
            int deckCindex = 0;

            for(int i=0; i<cardPlay.length;i++) {
                System.out.println("Player is " + (i + 1));
                for(int j=0; j<cardPlay[i].length;j++) {
                    cardPlay[i][j] = deck[deckCindex];
                    System.out.println(cardPlay[i][j]);
                    deckCindex++;
                }
            }
        }
        public static void main(String[] args) {
            DeckofCards deckOfCards = new DeckofCards();
            deckOfCards.gettingCards();
            deckOfCards.shuffleCards();
            deckOfCards.displayCards();
        }
}
