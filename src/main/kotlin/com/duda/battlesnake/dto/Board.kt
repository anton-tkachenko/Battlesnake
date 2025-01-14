package com.duda.battlesnake.dto

data class Board(
    val height: Int,
    val width: Int,
    val food: List<Coordinates>,
    val hazards: List<Coordinates>,
    val snakes: List<BattleSnake>
)
