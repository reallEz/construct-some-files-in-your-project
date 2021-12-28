package com.github.reallez.constructsomefilesinyourproject.services

import com.intellij.openapi.project.Project
import com.github.reallez.constructsomefilesinyourproject.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
