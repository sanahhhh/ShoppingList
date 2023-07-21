package com.example.shoppinglist.domain.use_cases

import androidx.lifecycle.LiveData
import com.example.shoppinglist.domain.ShopItem
import com.example.shoppinglist.domain.ShopListRepository

class GetShopListUseCase (private val shopListInterface: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListInterface.getShopList()
    }
}