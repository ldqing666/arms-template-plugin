package com.github.ldqing666.armstemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.ldqing666.armstemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
