package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero

     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)

     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *

    Challenge:

    ===============Class B Afternoon===============
    UNLIMITED INNOVATION -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x

     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas

     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    class Hero {
        var name: String = ""
        var age: Int = 0
        var height: Float = 0.0f
        var activities = mutableMapOf<String, Int>()

        fun setProfile(name: String, age: Int, height: Float) {
            this.name = name
            this.age = age
            this.height = height
        }

        fun showProfile() {
            println("========= Profile =========")
            println("Name: $name")
            println("Age: $age")
            println("Height: $height")
            println("===========================")
        }

        fun doActivity(activity: String, times: Int) {
            activities[activity] = activities.getOrDefault(activity, 0) + times
        }

        fun showActivities() {
            println("========= Activities =========")
            activities.forEach { (activity, times) ->
                println("$activity: $times times")
            }
            println("===========================")
        }
    }

    fun main() {
        val hero = Hero()

        // Latihan 1
        hero.setProfile("Ardini Dhaniyah", 20, 162.0f)

        // Latihan 2
        hero.showProfile()

        // Challenge
        val activities = mapOf(
            "jalan" to 1,
            "lari" to 3,
            "makan" to 2,
            "minum" to 5,
            "lompat" to 4,
            "duduk" to 1
        )

        // Latihan 4
        activities.forEach { (activity, times) ->
            hero.doActivity(activity, times)
        }

        // Latihan 5
        hero.showActivities()
    }

}