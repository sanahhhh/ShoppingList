package com.example.shoppinglist.domain

interface ShopListInterface {

    fun addItem(shopItem: ShopItem)

    fun removeItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>

}