package com.example.notes

class CourseInfo (val courseId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

class NoteInfo (var course: CourseInfo, var title: String)

