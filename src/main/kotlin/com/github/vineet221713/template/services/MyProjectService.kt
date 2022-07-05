package com.github.vineet221713.template.services

import com.intellij.openapi.project.Project
import com.github.vineet221713.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
