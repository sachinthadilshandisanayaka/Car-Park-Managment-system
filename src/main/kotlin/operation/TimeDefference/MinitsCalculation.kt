package operation.TimeDefference

import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

class MinitsCalculation: CalculateTime {
    override fun calculation(park : LocalDateTime, now : LocalDateTime) : Long? {
        return ChronoUnit.MINUTES.between(park,now)
    }
}