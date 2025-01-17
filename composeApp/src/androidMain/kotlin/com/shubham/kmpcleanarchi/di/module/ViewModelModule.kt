package com.shubham.kmpcleanarchi.di.module

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import com.shubham.kmpcleanarchi.core.presentation.viewmodels.MyViewModel
actual val viewModelModule = module {

    viewModelOf(::MyViewModel)
    /*viewModelOf(::AuthViewModel)
    viewModelOf(::HomeScreenViewModel)
    viewModelOf(::ProductDetailsViewModel)
    viewModelOf(::MostPopularScreenViewModel)
    viewModelOf(::BrandScreenViewModel)
    viewModelOf(::WishListViewModel)
    viewModelOf(::AllBrandsViewModel)
    viewModelOf(::CartViewModel)
    viewModelOf(::SearchViewModel)
    viewModelOf(::CheckOutViewModel)
    viewModelOf(::AddLocationViewModel)
    viewModelOf(::ProfileViewModel)
    viewModelOf(::EditProfileViewModel)
    viewModelOf(::OrdersViewModel)
    viewModelOf(::ReviewViewModel)
    viewModelOf(::CategoryViewModel)
    viewModelOf(::SettingsViewModel)*/
}