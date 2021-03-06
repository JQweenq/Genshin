package com.josty.genshin.dictionary

import com.josty.genshin.dictionary.data.DictionaryRequests
import com.josty.genshin.dictionary.domain.DictionaryRepository
import com.josty.genshin.dictionary.ui.DictionaryViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val dictionaryModule
    get() = module {
        factory {
            DictionaryRepository(get(), get<Retrofit>().create(DictionaryRequests::class.java))
        }

        viewModel {
            DictionaryViewModel(get())
        }
    }