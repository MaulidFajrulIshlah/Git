fun main(){
    println("Masukan Angka: ")
    var inputAngka = readLine()!!.toInt()

    var bilanganPrima = false

    for (i in 2 .. inputAngka / 2 ){
        if (inputAngka % i == 0){
            bilanganPrima = true
            break
        }
    }

    if (!bilanganPrima)
        print("$inputAngka   Adalah Bilangan Perima")
    else
        print("$inputAngka Bukan Bilangan Prima")
}