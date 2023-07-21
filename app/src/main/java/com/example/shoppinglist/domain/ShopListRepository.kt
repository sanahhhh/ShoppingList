package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    suspend fun addItem(shopItem: ShopItem)

    suspend fun deleteItem(shopItem: ShopItem)

    suspend fun editItem(shopItem: ShopItem)

    suspend fun getItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>

}