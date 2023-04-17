package org.diyorbek.sqlitedatabase_t3.database

import org.diyorbek.sqlitedatabase_t3.model.Food

interface FoodService {
    fun saveFood(food: Food)
    fun updateFood(food: Food)
    fun deleteFood(id: Int)
    fun getFoodList(): List<Food>
}