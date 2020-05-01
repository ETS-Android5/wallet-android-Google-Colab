/**
* Auth API
* Auth API<br> <a href='/changelog'>Changelog</a>
*
* The version of the OpenAPI document: v0.0.50
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.mycelium.bequant.remote.client.models



import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 * @param accessToken 
 * @param session 
 */
@JsonClass(generateAdapter = true)
data class SessionResponse (
    @Json(name = "access_token")
    val accessToken: kotlin.String,
    @Json(name = "session")
    val session: kotlin.String
)
