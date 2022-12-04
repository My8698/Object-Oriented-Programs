package com.bridgelabz.oops;
import java.util.Random;
public class DeckOfCards
{
    /**
     * deck is a string array indicating total number of cards in deck
     */
    String[] deck = new String[52];
    /**
     * suit is a string array indicating suits in deck of cards
     */
    String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
    /**
     * rank is a string array indicating rank in deck of cards
     */
    String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    /**
     * to distributing 9 cards to 4 players so we take 2D arrray palyCards
     */
    String[][] playCards = new String[4][9];
    static Random random = new Random();

    /**
     * getting cards according to their rank and suits
     */
    public void alignCards() {
        int deckIndex = 0;// Initializing with 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                // aligning ranks and suits together
                deck[deckIndex] = rank[j] + " of " + suit[i];
                deckIndex++;// incrementing deck index
            }
        }
    }
    /**
     * shuffling of cards
     */
    public String[] suffleCards() {
        int j = 0;
        String temp;
        for (int i = 0; i < deck.length; i++) {
            j = random.nextInt(52);// getting random numbers from 0 to 52
            // swapping existing data with random data//
            temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        return deck;
    }
    /**
     * displaying cards
     */
    public void displayCards(String[] deck) {
        int deckindex = 0;
        for (int i = 0; i < playCards.length; i++) {
            System.out.println("player is " + (i + 1));
            for (int j = 0; j < playCards[i].length; j++) {
                playCards[i][j] = deck[deckindex];
                System.out.println(playCards[i][j]);
                deckindex++;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        //Create Object
        DeckOfCards deckOfCards = new DeckOfCards();
        //Calling the method
        deckOfCards.alignCards();
        String[] deck = deckOfCards.suffleCards();
        deckOfCards.displayCards(deck);
    }
}
