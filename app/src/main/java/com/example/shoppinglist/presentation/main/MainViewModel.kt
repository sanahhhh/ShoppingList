package com.example.shoppinglist.presentation.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoppinglist.data.ShopListImpl
import com.example.shoppinglist.domain.*
import com.example.shoppinglist.domain.use_cases.DeleteShopItemUseCase
import com.example.shoppinglist.domain.use_cases.EditShopItemUseCase
import com.example.shoppinglist.domain.use_cases.GetShopListUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

class MainViewModel(application: Application):AndroidViewModel(application) {

    private val rep = ShopListImpl(application)

    private val getShopList = GetShopListUseCase(rep)
    private val removeShopItem = DeleteShopItemUseCase(rep)
    private val editShopItem = EditShopItemUseCase(rep)

    val shopList = getShopList.getShopList()

    fun removeShopItem(shopItem: ShopItem) {
        viewModelScope.launch {
            removeShopItem.deleteItem(shopItem)
        }
    }

    fun changeEnableState(shopItem: ShopItem) {
        viewModelScope.launch {
            val newItem = shopItem.copy(enabled = !shopItem.enabled)
            editShopItem.editItem(newItem)
        }
    }
}