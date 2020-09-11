class NormalClass (val id:Int, val name:String, val proglang:String)
data class DataClass (val id:Int, val name:String, val proglang:String)


fun main(){
    println("---------------implement normal class:")
    val clas1 = NormalClass(1,"Normal Class","kotlin")
    val clas2 = NormalClass(1,"Normal Class","kotlin")
    val clas3=clas1

    println(clas1)                    //toString()
    println(clas1.hashCode())         //hashCode()
    println(clas1.equals(clas2))      //equal()
    println(clas1.equals(clas3))


    println("---------------implement data class:")
    val cls1 = DataClass(1,"Data Class","kotlin")
    val cls2 = DataClass(1,"Data Class","kotlin")
    val cls3=cls1

    println(cls1)                    //toString()
    println(cls1.hashCode())         //hashCode()
    println(cls1.equals(cls2))      //equal()
    println(cls1.equals(cls3))




}