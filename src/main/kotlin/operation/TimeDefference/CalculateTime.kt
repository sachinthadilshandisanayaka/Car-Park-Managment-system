package operation.TimeDefference

import java.time.LocalDateTime

interface CalculateTime {
    fun calculation(park : LocalDateTime, now : LocalDateTime) : Long?
}