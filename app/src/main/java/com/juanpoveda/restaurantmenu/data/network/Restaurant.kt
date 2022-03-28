package com.juanpoveda.restaurantmenu.data.network

import com.google.gson.annotations.SerializedName

data class Restaurant (
    @SerializedName("restaurant_name") val restaurantName: String,
    @SerializedName("restaurant_phone") val restaurantPhone: String,
    @SerializedName("restaurant_website") val restaurantWebsite: String,
    @SerializedName("hours") val hours: String,
    @SerializedName("price_range") val priceRange: String,
    @SerializedName("restaurant_id") val restaurantId: Long,
    @SerializedName("cuisines") val cuisines: List<String>,
    @SerializedName("address") val address: Address,
    @SerializedName("geo") val geo: Geo,
    @SerializedName("menus") val menus: List<Menu>,
    @SerializedName("last_updated") val lastUpdated: String,
)

data class Address (
    @SerializedName("city") val city: String,
    @SerializedName("state") val state: String,
    @SerializedName("postal_code") val postalCode: String,
    @SerializedName("street") val street: String,
    @SerializedName("formatted") val formatted: String,
)

data class Geo (
    @SerializedName("lat") val lat: Float,
    @SerializedName("lon") val lon: Float
)

data class Menu (
    @SerializedName("menu_name") val menuName: String,
    @SerializedName("menu_sections") val menuSections: List<MenuSection>
)

data class MenuSection (
    @SerializedName("section_name") val sectionName: String,
    @SerializedName("description") val description: String,
    @SerializedName("menu_items") val menuItems: List<MenuItem>
)

data class MenuItem (
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("pricing") val pricing: List<Pricing>,
    @SerializedName("price") val price: Float
)

data class Pricing (
    @SerializedName("currency") val currency: String,
    @SerializedName("priceString") val priceString: String,
    @SerializedName("price") val price: Float
)