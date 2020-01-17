package com.airensoft.creator.livemolo_clone

class CastModel {
    val castername : String
    val title : String
    val viewer : Int
    val titlepic : Int


    constructor(castername: String, title: String, viewer: Int,  titlepic: Int) {
        this.castername =  castername
        this.title = title
        this.viewer = viewer
        this.titlepic = titlepic
    }
}