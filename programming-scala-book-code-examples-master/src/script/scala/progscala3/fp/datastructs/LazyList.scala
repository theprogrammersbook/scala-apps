// src/script/scala/progscala3/fp/datastructs/LazyListNaturals.scala

val naturalNumbers = LazyList.from(0)
naturalNumbers.take(1000).toList
