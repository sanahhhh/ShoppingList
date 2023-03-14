package com.example.shoppinglist.domain

class GetShopList (private val shopListInterface: ShopListInterface) {

    fun getShopList(): List<ShopItem> {
        return shopListInterface.getShopList()
    }
}