package com.example.notes

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init { // Anything in this initializer blocker is run when this class is called
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "android programming with intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "android Async programming and services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java fundamentals: the java language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "java fundamentals: the core platform")
        courses.set(course.courseId, course)
    }

}