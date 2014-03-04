package week3

object rationals {
  val x = new Rational(1, 3)                      //> x  : week3.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : week3.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : week3.Rational = 3/2
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  x.sub(y).sub(z)                                 //> res2: week3.Rational = -79/42
  y.add(y)                                        //> res3: week3.Rational = 10/7
  x.max(y)                                        //> res4: week3.Rational = 5/7
 // val strange  = new Rational (1,0)
  //strange.add(strange)
}

class Rational (x: Int, y : Int){
	require(y !=0, "denominator must be non zero")
	private def gcd (a: Int, b:Int): Int  = if (b == 0) a else gcd (b, a%b)
	private val g = gcd (x,y)
	def numer = x / g
	def denom = y / g
	//def numer = x
	//def denom = y
	
	def less (that:Rational) = numer*that.denom<that.numer*denom
	
	def max (that:Rational) =  if(this.less(that)) that else this
	
	def add(that: Rational)=
		new Rational (
		numer*that.denom + denom*that.numer,
		denom*that.denom)
		
	def neg: Rational = new Rational (-numer, denom)
	
	def sub (that:Rational) = add(that.neg)
	
	override def toString = numer +"/"+ denom
	
}