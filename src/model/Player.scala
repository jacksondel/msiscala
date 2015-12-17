package model

import scala.collection.mutable.ListBuffer

class Player(deck:Deck){
  var myCards = new ListBuffer[Card]()
  
  def getCard() = {
    var card:Card = deck.giveCard()
    
    myCards += card
  }
}