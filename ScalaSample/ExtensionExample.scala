object ExtensionExample {
  implicit class PreInt(x: Int) {
    def add3 = x + 3
  }
  def main (args: Array[String]): Unit = {
    println(3.add3)
  }
}

