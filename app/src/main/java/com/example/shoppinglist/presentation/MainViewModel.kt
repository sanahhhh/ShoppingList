package com.example.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppinglist.data.ShopListImpl
import com.example.shoppinglist.domain.*

class MainViewModel:ViewModel() {

    private val rep = ShopListImpl

    private val getShopList = GetShopList(rep)
    private val removeShopItem = RemoveShopItem(rep)
    private val editShopItem = EditShopItem(rep)

    val shopList = getShopList.getShopList()


    fun removeShopItem(shopItem: ShopItem) {
        removeShopItem.removeItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItem.editItem(newItem)
    }
}