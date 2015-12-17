package model

import java.util.Arrays.ArrayList
import scala.collection.mutable.ListBuffer

class Deck {
  
  val symbols:List[String] = List("hearts", "spades", "diamonds", "clubs")
  var deck = new ListBuffer[Card]()

  def initDeck() = {
    
    // initialize a deck and shuffle it
    
    for (i <- 0 until 4) {
   var symbol = symbols(i)
   
   val card0:Card = new Card(symbol,2, "number2")
   val card1:Card = new Card(symbol,3, "number3")
   val card2:Card = new Card(symbol,4, "number4")
   val card3:Card = new Card(symbol,5, "number5")
   val card4:Card = new Card(symbol,6, "number6")
   val card5:Card = new Card(symbol,7, "number7")
   val card6:Card = new Card(symbol,8, "number8")
   val card7:Card = new Card(symbol,9, "number9")
   val card8:Card = new Card(symbol,10, "number10")
   val card9:Card = new Card(symbol,10, "jack")
   val card10:Card = new Card(symbol,10, "queen")
   val card11:Card = new Card(symbol,10, "king")
   val card12:Card = new Card(symbol,11, "ace") 
   
   deck += card0
   deck += card1
   deck += card2
   deck += card3
   deck += card4
   deck += card5
   deck += card6
   deck += card7
   deck += card8
   deck += card9
   deck += card10
   deck += card11
   deck += card12
    } 
 
    util.Random.shuffle(deck)
  }
  
  def giveCard():Card = {
    // hand out first card of deck and remove it from deck
    var card:Card = deck.head
    deck = deck.tail
    
    return card
  }
   

   
   
   
}