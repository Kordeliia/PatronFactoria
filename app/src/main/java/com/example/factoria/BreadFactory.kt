package com.example.factoria

class BreadFactory {
    fun getBread(breadType : String?): Bread?{
        if(breadType == null) return null
        if(breadType == "BAG"){
            return Baguette()
        } else if(breadType == "SLI"){
            return Sliced()
        } else if(breadType == "ROL") {
            return Roll()
        }
        return null
    }
}