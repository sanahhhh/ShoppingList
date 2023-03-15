package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListInterface {

    fun addItem(shopItem: ShopItem)

    fun removeItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>

}