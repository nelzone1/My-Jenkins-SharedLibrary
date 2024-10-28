// Function for Approving DockerHub Push 

def approvePush() { 

    stage('Approve - Push Image to DockerHub') { 

        env.APPROVE_DEPLOYMENT = input( 

            message: 'User input required. Proceed with DockerHub Push?', 

            ok: 'Yes', 

            parameters: [ 

                choice(name: 'Deployment', choices: ['Yes', 'Abort'], description: 'Choose Yes to push the image to DockerHub') 

            ] 

        ) 

        return env.APPROVE_DEPLOYMENT == 'Yes' 

    } 

} 