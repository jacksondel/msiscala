package tui

class Tui {
  def processInput(input: String) = {
    var continue = true
    input match {
      case "q" => continue = false
    }
    continue
  }
}