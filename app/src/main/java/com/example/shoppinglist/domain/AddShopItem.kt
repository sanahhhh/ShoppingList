package com.example.shoppinglist.domain

class AddShopItem(private val shopListInterface: ShopListInterface) {

    fun addItem(shopItem: ShopItem) {
        shopListInterface.addItem(shopItem)
    }
}