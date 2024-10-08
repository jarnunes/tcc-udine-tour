package com.jarnunes.udinetour.model

import java.io.Serializable

class Message : Serializable {

    var message: String? = null
    var sentId: String? = null
    var imagePath: String? = null
    private lateinit var userLocation: UserLocation

    constructor() {}

    constructor(messageIn: String?, senderIdIn: String?, imagePathIn: String?) {
        this.message = messageIn
        this.sentId = senderIdIn
        this.imagePath = imagePathIn
        this.userLocation = UserLocation()
    }

    fun setUserLocation(userLocation: UserLocation) {
        this.userLocation = userLocation
    }

    fun getUserLocation(): UserLocation {
        return this.userLocation
    }

}