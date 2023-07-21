package com.example.shoppinglist.domain.use_cases

import com.example.shoppinglist.domain.ShopItem
import com.example.shoppinglist.domain.ShopListRepository

class GetShopItemUseCase(private val shopListInterface: ShopListRepository) {

    suspend fun getItem(shopItemId: Int): ShopItem {
        return shopListInterface.getItem(shopItemId)
    }

}