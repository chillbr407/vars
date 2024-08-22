def call() {
    script {
        def startTime = System.currentTimeMillis() // Start timing
        sh 'mvn clean install' // Execute the Maven build
        def endTime = System.currentTimeMillis() // End timing
        
        def duration = (endTime - startTime) / 1000 // Calculate duration in seconds
        echo "Build completed in ${duration} seconds"
    }
}
