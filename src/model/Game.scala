package model

class Game {
  val dealer = new Dealer()
  val player = new Player()
  
  val symbols:List[String] = List("hearts", "spades", "diamonds", "clubs")
  for (i<-0 until 4) {
   var symbol = symbols(i)
   
   val card0:Card = new Card(symbol,2, "number2")
   val card1:Card = new Card(symbol,3, "number3")
   val card2:Card = new Card(symbol,4, "number4")
   val card3:Card = new Card(symbol,5, "number5")
   val card5:Card = new Card(symbol,6, "number6")
   val card6:Card = new Card(symbol,7, "number7")
   val card7:Card = new Card(symbol,8, "number8")
   val card8:Card = new Card(symbol,9, "number9")
   val card9:Card = new Card(symbol,10, "number10")
   val card10:Card = new Card(symbol,10, "jack")
   val card11:Card = new Card(symbol,10, "queen")
   val card12:Card = new Card(symbol,10, "king")
   val card13:Card = new Card(symbol,11, "ace")    
  }
  
  
}