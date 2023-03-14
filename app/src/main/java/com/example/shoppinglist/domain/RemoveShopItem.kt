package com.example.shoppinglist.domain

class RemoveShopItem(private val shopListInterface: ShopListInterface) {

    fun removeItem(shopItem: ShopItem) {
        shopListInterface.removeItem(shopItem)
    }
}