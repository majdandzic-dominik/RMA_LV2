package com.example.inspiringpeople.model

import java.io.Serializable

data class InspiringPerson(
    val name: String,
    val dob: String,
    val details: String,
    val imageSrc: String
) : Serializable