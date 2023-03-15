package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

class GetShopList (private val shopListInterface: ShopListInterface) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListInterface.getShopList()
    }
}