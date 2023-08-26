tasks.register<Exec>("buildFrontend") {
    workingDir("./")
    commandLine("npm", "run", "build")
}

tasks.named("build") {
    dependsOn("buildFrontend")
}