package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
//JAWABAN:
    val inputString = "Ardini" // Ganti dengan string yang ingin Anda coba konversi

    try {
        val convertedInt = inputString.toInt()
        println("String yang dikonversi menjadi bilangan bulat: $convertedInt")
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan: Gagal mengonversi string menjadi bilangan bulat.")
        println("Exception: ${e.message}")
    }
}
