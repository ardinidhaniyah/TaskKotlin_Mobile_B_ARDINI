package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
//JAWABAN:
fun myProfile() {
    val firstName: String = "Ardini"
    val lastName: String = "Dhaniyah"
    val age: Int = 20
    val isSingle: Boolean = false

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age tahun")
    println("Status: $isSingle")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
//JAWABAN:
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")

    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
//JAWABAN:
fun myTeam(): List<Any> {
    val groupMembers = listOf("Ardini", "Alif", "Yoga", "Rafi", "Dedi", "Irfan", "Alan", "Steffany", "Afif", "Rizky")
    val myName = groupMembers.firstOrNull { it == "Ardini" } ?: ""

    println("Daftar Anggota Grup: $groupMembers")
    println("Nama Saya: $myName")

    return groupMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
//JAWABAN:
fun totalMember(): Int {
    val mentor = arrayOf("Jovian", "Imam")
    val countOfGroup = myTeam().size

    return mentor.size + countOfGroup
}

fun main() {
    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("INFINITE INNOVATION", myTeam, "Afternoon")
}