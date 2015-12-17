import model.Game
import tui.Tui

object Blackjack {
  val game = new Game()
  val tui = new Tui()
  
  def main(args : Array[String]) {
    game.initialize()
    
    while (tui.processInput(readLine()) {
      
    }
  }
}