package crazydude.com.telemetry.maps

interface MapLine {
    fun remove()
    fun addPoints(points: List<Position>)
    fun setPoint(index: Int, position: Position)
    fun clear()
    fun removeAt(index: Int)
    fun setPoints(points: List<Position>)

    val size: Int
    var color: Int
}