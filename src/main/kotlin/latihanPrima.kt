fun main(){

    print("Masukkan angka : ")
    val input = readLine()?.toIntOrNull()

    if (input == null) {
        println("Masukan tidak valid.")
        return
    }

    var i = 2
    var prima = true

    while (i < input) {
        if (input % i == 0) {
            prima = false
            break
        }
        i++
    }

    if (prima) {
        println("$input Adalah bilangan prima.")
    } else {
        println("$input Bukan bilangan prima.")}
}