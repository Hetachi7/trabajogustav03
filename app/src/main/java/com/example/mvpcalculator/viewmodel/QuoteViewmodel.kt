package com.example.mvpcalculator.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

    class QuoteViewModel : ViewModel() {
        val quoteModel = MutableLiveData<QuoteModel>()
        fun randomQuote() {
            val currentQuote = QuoteProvider.random()
            quoteModel.postValue(currentQuote)
        }
    }

}