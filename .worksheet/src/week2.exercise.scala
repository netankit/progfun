package week2

object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
  println("Factorial Tail recursion");$skip(131); 
  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int =
    if (n==0) acc
    else loop(acc*n,n-1)
   loop(1,n)
  };System.out.println("""factorial: (n: Int)Int""");$skip(15); val res$0 = 
  factorial(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  factorial(8);System.out.println("""res1: Int = """ + $show(res$1))}
}
