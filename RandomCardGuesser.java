import java.util.Random;
import java.util.Scanner;

public class RandomCardGuesser {
    private static final String deckRanks[] = {"King", "Queen", "Jack", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private static final String deckSuits[] = {"of Diamonds", "of Spades", "of Hearts", "of Clubs"};
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a card, any card! Think of a card from a standard 52-card playing deck and we'll try and match it.\n");
        getRandomCard();
        System.out.println("\nWas this your card?\nType yes or no");
        
        String result = input.nextLine();
        if(result.equalsIgnoreCase("yes")){
            System.out.println("Great!");
        } else {
            System.out.println("Sorry.");
        }
    }
    
    public static void getRandomCard(){ 

        Random cardSelector = new Random();
        
        int randomRank = cardSelector.nextInt(deckRanks.length);
        int randomSuit = cardSelector.nextInt(deckSuits.length);

        System.out.println(deckRanks[randomRank] + " " + deckSuits[randomSuit]);
  
    }
}
