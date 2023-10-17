package com.example.mvpcalculator.viewmodel;

class QuoteViewModel : ViewModel() {
        val quoteModel = MutableLiveData<QuoteModel>()
        fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
        }
}