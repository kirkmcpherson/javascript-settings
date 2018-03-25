package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "1b57618c-5741-4816-b7a5-aa7ddb619fcc"
    id = "JavaScript"
    parentId = "_Root"
    name = "JavaScript"
    description = "My JS Project by Kirk"
    
    vcsRoot(JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    buildType(JavaScript_03DeployToStaging)
    buildType(JavaScript_02Chrome)
    buildType(JavaScript_01FastTests)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "HttpsGithubComKirkmcphersonJavascriptSettingsGit"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
