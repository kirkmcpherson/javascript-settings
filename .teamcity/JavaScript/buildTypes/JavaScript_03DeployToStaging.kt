package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_03DeployToStaging : BuildType({
    uuid = "ac099801-901b-4e4e-90ac-f8eaabb4ac76"
    id = "JavaScript_03DeployToStaging"
    name = "03.  Deploy to Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
    }
})
