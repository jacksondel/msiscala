package model

class Game {
  
  def initialize() = {
    // create 1 player, dealer and 1 deck for each game
    // initialize deck and give out cards
    
    val deck = new Deck()
    deck.initDeck()
    val dealer = new Dealer(deck)
    val player = new Player(deck)   
    dealer.getCard()
    player.getCard()
    player.getCard()
  }

  
 
}