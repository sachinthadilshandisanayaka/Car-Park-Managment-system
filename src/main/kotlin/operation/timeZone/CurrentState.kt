package operation.timeZone

import java.time.LocalDateTime

class CurrentState : ParkTime{
    override fun currentTimeAndDate(): LocalDateTime? {
        return LocalDateTime.now()
    }
}