package com.github.liuqian1996.demoideaplugin.services

import com.intellij.openapi.project.Project
import com.github.liuqian1996.demoideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
