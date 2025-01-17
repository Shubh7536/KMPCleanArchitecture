package com.shubham.kmpcleanarchi.core.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shubham.kmpcleanarchi.core.data.utils.DataResult
import com.shubham.kmpcleanarchi.core.domain.repository.ApiRepository
import com.shubham.kmpcleanarchi.core.domain.usecase.MyUseCase
import kotlinx.coroutines.launch

class MyViewModel(private val useCase: MyUseCase) : ViewModel() {

   fun getHarryPotterChar() = viewModelScope.launch{
        when(val response = useCase.getUser()){
            is DataResult.Empty -> {
                println("empty")
            }
            is DataResult.Error -> {
                println("Error ${response.message}")
            }
            is DataResult.Loading -> {}
            is DataResult.Success -> {
                println("Success ${response.data}")
            }
        }
    }

}