package com.example.stockmarketapp.domain.model

data class CompanyInfo(
    val symbol: String,
    val description: String,
    val name: String,
    val industry: String,
    val countryName: String
)