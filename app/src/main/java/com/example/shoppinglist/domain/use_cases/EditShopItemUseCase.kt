package com.example.shoppinglist.domain.use_cases

import com.example.shoppinglist.domain.ShopItem
import com.example.shoppinglist.domain.ShopListRepository

class EditShopItemUseCase(private val shopListInterface: ShopListRepository) {

    suspend fun editItem(shopItem: ShopItem) {
        shopListInterface.editItem(shopItem)
    }
}