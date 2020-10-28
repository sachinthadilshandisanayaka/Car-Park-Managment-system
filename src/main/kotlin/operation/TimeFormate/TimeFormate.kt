package operation.TimeFormate

import java.time.LocalDateTime

interface TimeFormate {
    fun timeAndDate(dateTime : String): LocalDateTime?
}