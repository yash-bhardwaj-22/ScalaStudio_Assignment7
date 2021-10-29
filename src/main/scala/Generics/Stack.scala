package Generics

class Stack[Int] {
  private class Node(val data:Int, val next:Node)
  private var head:Node = null

  def push(x:Int): Unit = {
    head = new Node(x,head)
  }
  def pop():Int = {
    val elem = head.data
    head = head.next
    elem
  }
  def isEmpty:Boolean = head == null
  def top:Int = head.data
}
