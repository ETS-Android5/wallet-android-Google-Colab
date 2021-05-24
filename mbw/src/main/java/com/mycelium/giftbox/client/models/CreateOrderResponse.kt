package com.mycelium.giftbox.client.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CreateOrderResponse(
    val amount: String?,
    val client_order_id: String?,
    val code: String?,
    val created_at: String?,
    val product_currency: String?,
    val quantity: String?,
    val status: String?
) : Parcelable