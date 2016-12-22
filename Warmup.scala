import scala.annotation.tailrec

/**
  * Created by Asus on 25.11.2016.
  */
object Warmup {
  def reverse(l:List[Int]):List[Int] = l match {
    case Nil => Nil
    case x :: xs => reverse (xs) ::: List (x)
  }
  def Add(l:List[Int],a:Int):List[Int] = l match {
    case Nil => List(a)
    case x::xs => x :: Add(xs, a)
  }

  @tailrec def lenacc(l:List[Int], acc: Int): Int = {
    if (l.isEmpty)
      acc
    else lenacc(l.tail, acc + 1)
  }

  def Len(l:List[Int]): Int = {
    lenacc(l, 0)
  }
  def Sum(l:List[Int]):Int = l match{
    case Nil => 0
    case x::xs => x + Sum(xs)
  }
  def SemiFil(l:List[Int]):List[Int] = l match {
    case Nil => Nil
    case x::xs => if (x>0) x :: SemiFil(xs) else SemiFil(xs)
  }
  def Fil(f : Int => Boolean, l:List[Int]):List[Int] = l match{
    case Nil => Nil
    case x::xs => if (f(x)) x :: Fil(f,xs) else Fil(f,xs)
  }
  def main(args: Array[String]): Unit = {
    print(Len(List(1,2,3)))
  }
}
