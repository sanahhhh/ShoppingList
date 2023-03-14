package com.example.shoppinglist.domain

class GetShopItem(private val shopListInterface: ShopListInterface) {

    fun getItem(shopItemId: Int):ShopItem {
        return shopListInterface.getItem(shopItemId)
    }
}