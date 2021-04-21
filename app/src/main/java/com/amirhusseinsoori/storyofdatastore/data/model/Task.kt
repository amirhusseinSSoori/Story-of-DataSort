package com.amirhusseinsoori.storyofdatastore.data.model

import java.util.*




enum class TaskPriority {
    HIGH, MEDIUM, LOW
}
data class Task(
    val name: String,
    val deadline: Date,
    val priority: TaskPriority,
    val completed: Boolean = false
)