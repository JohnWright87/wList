package com.example.wlist

import androidx.core.net.toUri

class WishlistFetcher {

    companion object {
        var wishItemsList: MutableList<Wishlist> = ArrayList()
        val iName = ""
        val iPrice = ""
        val urlWeb = ""

        fun GetWishlist(): MutableList<Wishlist> {
            var wishlists : MutableList<Wishlist> = ArrayList()
            for (i in 0..9) {
            }
            return wishItemsList
        }
        fun addItemToList(item: Wishlist):MutableList<Wishlist> {
            wishItemsList.add(item)
            return wishItemsList
        }
        fun getNext5Items(): MutableList<Wishlist> {
            var newItems : MutableList<Wishlist> = ArrayList()
            for (i in 10..14) {
                val email = Wishlist(iName, iPrice.toString().toDouble(), urlWeb.toString().toUri())//image
                newItems.add(email)
            }
            return newItems
        }
    }
}