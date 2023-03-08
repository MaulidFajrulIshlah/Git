fun main(){
    print("masukkan angka: ")
    val inputAngka = readln()!!.toInt()
    if(inputAngka % 2 == 1 || inputAngka / inputAngka == 1 ) {
        println("$inputAngka adalah bilangan prima")
    }else if(inputAngka / 3..100 == 2..100){
        println("$inputAngka bukan bilangan prima")
    }
}