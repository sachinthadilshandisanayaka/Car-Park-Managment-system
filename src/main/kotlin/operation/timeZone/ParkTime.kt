package operation.timeZone

import java.time.LocalDateTime

interface ParkTime {
    fun currentTimeAndDate(): LocalDateTime?
}