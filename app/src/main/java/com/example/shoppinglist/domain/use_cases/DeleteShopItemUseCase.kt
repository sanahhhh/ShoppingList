package com.example.shoppinglist.domain.use_cases

import com.example.shoppinglist.domain.ShopItem
import com.example.shoppinglist.domain.ShopListRepository

class DeleteShopItemUseCase(private val shopListInterface: ShopListRepository) {

    suspend fun deleteItem(shopItem: ShopItem) {
        shopListInterface.deleteItem(shopItem)
    }
}