def call(Map pipelineParams) {
    pipeline {
        agent any
        stages {
            stage ("Shared Pipeline Stage 1") {
                steps {
                    println "Shared pipeline name: ${pipelineParams.pipelineName}"
                }
            }
        }
        post {
            success {
                println "Pipeline completed successfully"
            }
        }
    }
}
