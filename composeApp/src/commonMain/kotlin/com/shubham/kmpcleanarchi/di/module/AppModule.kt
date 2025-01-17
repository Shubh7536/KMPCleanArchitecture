package com.shubham.kmpcleanarchi.di.module

import com.shubham.kmpcleanarchi.core.data.HttpClientFactory
import com.shubham.kmpcleanarchi.core.data.repository.ApiRepositoryImpl
import com.shubham.kmpcleanarchi.core.domain.InputValidation
import com.shubham.kmpcleanarchi.core.domain.repository.ApiRepository
import com.shubham.kmpcleanarchi.core.domain.usecase.MyUseCase
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {

    single { InputValidation() }
    //single { DefaultSessionHandler(dataStore = get()) }.bind<SessionHandler>()
    single { HttpClientFactory.createHttpClient(/*sessionHandler = get(), */engine = get()) }
    single { ApiRepositoryImpl(httpClient = get()) }.bind<ApiRepository>()
    single { MyUseCase(apiRepository = get())}
    /*single { AuthRepositoryImpl(httpClient = get(), sessionHandler = get()) }.bind<AuthRepository>()
    single { ShoesRepositoryImpl(httpClient = get(), database = get()) }.bind<ShoesRepository>()
    single { WishListRepositoryImpl(httpClient = get()) }.bind<WishListRepository>()
    single { CartRepositoryImpl(database = get()) }.bind<CartRepository>()
    single { LocationRepositoryImpl(httpClient = get()) }.bind<LocationRepository>()
    single { ShippingAddressRepositoryImpl(database = get()) }.bind<ShippingAddressRepository>()
    single { UserRepositoryImpl(httpClient = get(), sessionHandler = get()) }.bind<UserRepository>()
    single { OrderRepositoryImpl(httpClient = get()) }.bind<OrderRepository>()
    single { ReviewRepositoryImpl(httpClient = get()) }.bind<ReviewRepository>()
    single { DefaultUserPreferencesRepository(dataStore = get()) }.bind<UserPreferencesRepository>()*/

}