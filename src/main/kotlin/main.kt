fun main() {
   println("Был в сети " + lastSeen(5000))
}

fun lastSeen(seconds: Int): String {
    return when {
        seconds < 60 -> "недавно"
        seconds < 60 * 60 -> "${seconds / 60} ${minutes(seconds / 60)} назад"
        seconds >= 60 * 60 && seconds < 24 * 60 * 60 -> "${seconds / 3600} ${hours (seconds / 3600)} назад"
        seconds >= 24 * 60 * 60 && seconds < 24 * 60 * 60 * 2 -> "вчера"
        seconds >= 24 * 60 * 60 * 2 && seconds < 24 * 60 * 60 * 3 -> "позавчера"
        else -> "давно"
    }
}

fun minutes(minutes: Int): String {
    return if (minutes >= 11 && minutes <= 14) "минут" else if (minutes % 10 == 1) "минуту" else if (minutes % 10 >=2 && minutes % 10 <= 4) "минуты" else "минут"
}

fun hours(hours: Int): String {
    return if (hours >= 5 && hours <= 20) "часов" else if (hours == 1 || hours == 21) "час" else "часа"
}
