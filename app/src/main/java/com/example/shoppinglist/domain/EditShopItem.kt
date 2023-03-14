package com.example.shoppinglist.domain

class EditShopItem(private val shopListInterface: ShopListInterface) {

    fun editItem(shopItem: ShopItem) {
        shopListInterface.editItem(shopItem)
    }
}