object Leap {
  def leapYear(year: Int): Boolean = {
    def divisivel(i: Int) = year % i == 0
    divisivel(4) && (divisivel(400) || !divisivel(100))
  }
}