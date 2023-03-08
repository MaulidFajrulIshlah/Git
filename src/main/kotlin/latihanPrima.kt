fun main(){
    print("Masukkan angka : ")
    val input = readLine()?.toIntOrNull()

    if (input == null) {
        println("Masukan tidak valid.")
        return
    }

    var i = 2
    var isPrima = true

    while (i < input) {
        if (input % i == 0) {
            isPrima = false
            break
        }
        i++
    }

    if (isPrima) {
        println("$input adalah bilangan prima.")
    } else {
        println("$input bukan bilangan prima.")}
}