package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_01FastTests : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "fb5f0d5b-769c-4f2b-8e9f-4eed34386937"
    id = "JavaScript_01FastTests"
    name = "01.  Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
