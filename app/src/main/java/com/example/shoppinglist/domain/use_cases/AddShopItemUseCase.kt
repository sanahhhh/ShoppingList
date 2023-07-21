package com.example.shoppinglist.domain.use_cases

import com.example.shoppinglist.domain.ShopItem
import com.example.shoppinglist.domain.ShopListRepository

class AddShopItemUseCase(private val shopListInterface: ShopListRepository) {

    suspend fun addItem(shopItem: ShopItem) {
        shopListInterface.addItem(shopItem)
    }
}