import org.ashok.Constants

def call(Map config=[:], Closure body) {
    if (config.info) {
        println "INFO: ${config.msg}"
    } else if (config.error) {
        println "ERROR: ${config.error}"
    }

    println ${Constants.SLACK_MESSAGE}
    body()
}


def printDate() {
    println new java.util.Date()
}