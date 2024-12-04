package com.enesay.kotlindersleri.degiskenler

fun main() {
    println("Hello World")

    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 24
    var ogrenciBoy = 1.89
    var ogrenciBasHarf = 'A'
    var ogrenciDevamDurum = true

    println("Ogrenci Adi : $ogrenciAdi")
    println("Ogrenci yaşı: $ogrenciYas")
    println("Ogrenci Boyu: ${ogrenciBoy + 5}")
    println("Ogrenci Bas Harfi: $ogrenciBasHarf")
    println("Ogrenci Devam Durumu: $ogrenciDevamDurum")

    var sayi1 = 12
    println(sayi1)
    sayi1 = 123
    println(sayi1)

    var intDeger = 12
    var casting1 = intDeger.toDouble()
    println(casting1)
    var stringDeger = "143qa"
    var doubleDeger = 23.54
    var sayi2 = stringDeger.toIntOrNull()
    var casting2 = stringDeger.toIntOrNull() // çeviremezse null döner ama hata vermez
    println(casting2)

    casting2.let {
        println(it)
    }

}