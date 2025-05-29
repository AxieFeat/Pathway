plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "Pathway"
include("pathway-core")
include("pathway-server")
include("pathway-client")