library identifier: 'jenkins-pipeline-demo@master',
        retriever: modernSCM([$class: 'GitSCMSource', remote: 'https://github.com/ashokprabhuv/jenkins-pipeline-demo.git'])

pipeline {
    agent any
    stages {
        stage("Stage 1") {
            steps {
                    test1 name: 'Ashok Prabhu'
            }
        }
    }
}
