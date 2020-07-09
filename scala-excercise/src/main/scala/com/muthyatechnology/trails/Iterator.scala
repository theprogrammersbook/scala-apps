package com.muthyatechnology.trails

trait Iterator[A] {
  def hasNext:Boolean
  def next():A
}
