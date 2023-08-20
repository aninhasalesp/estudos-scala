object Leap {
  def leapYear(year: Int): Boolean = {
    if (year % 4 == 0) {
      if (year % 100 == 0 && year % 400 != 0) return false
      return true
    }
    return false
  }
}
