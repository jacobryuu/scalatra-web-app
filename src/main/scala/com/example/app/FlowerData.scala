package com.example.app

object FlowerData {

  var all = List(
    Flower("yellow-tulip", "Yellow Tulip"),
    Flower("red-rose", "Red Rose"),
    Flower("black-rose", "Black Rose"))
}

case class Flower(slug: String, name: String)

