package com.theprogrammersbook

import org.scalatest.{BeforeAndAfter, FunSuite}

class PizzaTest  extends FunSuite with BeforeAndAfter{
  test("checking 1 equals to 1"){
        assert(1==1)
  }
  var pizza : Pizza = _
  before{
  pizza = new Pizza
  }
  // testing the size of topping.
  test("initial size of pizza"){
       assert(pizza.getToppings().size==0)
  }
  test("adding topping to pizza"){
       pizza.addTopping(Topping("green olives"))
    assert(pizza.getToppings().size==1)
  }
  test("remove the topping"){
    pizza.removeTopping(Topping("green olives"))
         assert(pizza.getToppings().size==0)
  }
}
