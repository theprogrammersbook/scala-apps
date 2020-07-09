package com.muthyatechnology.trails

object SubTypingApp extends App {
  val dog = new Dog("Harry")
  val cat = new Cat("Sally")

  val animals = ArrayBuffer.empty[Pet]
  animals.append(dog)
  animals.append(cat)
  animals.foreach(pet => println(pet.name))  // Prints Harry Sally
}
