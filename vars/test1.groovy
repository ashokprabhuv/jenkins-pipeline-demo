def call(Map config) {
  node {
    echo "Printing from the shared lib function test1 ${config.name}"
  }
}
