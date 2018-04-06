object Acronym {
   fun generate(f:String) = f.split(' ','-').map{it[0].toUpperCase()}.joinToString("")
}
