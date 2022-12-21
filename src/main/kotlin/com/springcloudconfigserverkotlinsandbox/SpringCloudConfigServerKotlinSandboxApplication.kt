package com.springcloudconfigserverkotlinsandbox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class SpringCloudConfigServerKotlinSandboxApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudConfigServerKotlinSandboxApplication>(*args)
}
