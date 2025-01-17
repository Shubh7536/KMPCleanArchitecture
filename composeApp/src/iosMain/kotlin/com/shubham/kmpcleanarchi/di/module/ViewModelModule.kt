package com.shubham.kmpcleanarchi.di.module
import com.shubham.kmpcleanarchi.core.presentation.viewmodels.MyViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val viewModelModule = module {

   singleOf(::MyViewModel)
   /* singleOf(::AuthViewModel)
    singleOf(::HomeScreenViewModel)
    singleOf(::ProductDetailsViewModel)
    singleOf(::MostPopularScreenViewModel)
    singleOf(::BrandScreenViewModel)
    singleOf(::WishListViewModel)
    singleOf(::AllBrandsViewModel)
    singleOf(::CartViewModel)
    singleOf(::SearchViewModel)
    singleOf(::CheckOutViewModel)
    singleOf(::AddLocationViewModel)
    singleOf(::ProfileViewModel)
    singleOf(::EditProfileViewModel)
    singleOf(::OrdersViewModel)
    singleOf(::ReviewViewModel)
    singleOf(::CategoryViewModel)
    singleOf(::SettingsViewModel)*/
}