package com.airensoft.creator.livemolo_clone.model

class CastModel {
    val castername : String
    val title : String
    val viewer : Int
    val titlepic : Int
    val imageUrl : String


    constructor(castername: String, title: String, viewer: Int,  titlepic: Int, imageUrl : String) {
        this.castername =  castername
        this.title = title
        this.viewer = viewer
        this.titlepic = titlepic
        this.imageUrl = imageUrl
    }
}