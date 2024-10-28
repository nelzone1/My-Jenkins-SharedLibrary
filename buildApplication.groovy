// Function for Building the Application 

def buildApplication(mavenHome) { 

    stage('Java Application Build') { 

        echo 'Performing Java Maven Application Build' 

        sh "${mavenHome}/bin/mvn clean package -X" 

    } 

} 