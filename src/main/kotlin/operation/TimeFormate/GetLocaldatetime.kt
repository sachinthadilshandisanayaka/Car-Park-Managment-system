package operation.TimeFormate

import java.time.LocalDateTime

class GetLocaldatetime :TimeFormate {
    override fun timeAndDate(dateTime : String): LocalDateTime?{
        return LocalDateTime.parse(dateTime)
    }
}