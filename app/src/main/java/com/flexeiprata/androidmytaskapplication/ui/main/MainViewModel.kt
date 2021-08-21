package com.flexeiprata.androidmytaskapplication.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import androidx.paging.liveData
import com.flexeiprata.androidmytaskapplication.data.pagination.MainDataSource
import com.flexeiprata.androidmytaskapplication.data.repository.MainRepository
import com.flexeiprata.androidmytaskapplication.utils.Resource
import kotlinx.coroutines.Dispatchers


class MainViewModel(private val repository: MainRepository) : ViewModel(){
    val listData = Pager(PagingConfig(pageSize = 6)) {
        MainDataSource(repository)
    }.liveData.cachedIn(viewModelScope)
}