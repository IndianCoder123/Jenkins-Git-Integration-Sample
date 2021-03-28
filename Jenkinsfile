pipeline {
		agent any
		
		stages {
			
			stage ('Compile State') {
				steps {			
					withMaven(maven : 'apache-maven-3.6.3') {
						sh 'mvn clean install'
					}	
				}
			}	
			
			stage ('Testing State') {
				steps {			
					withMaven(maven : 'apache-maven-3.6.3') {
						sh 'mvn test'
					}	
				}
			}	
			
			stage ('Deployment State') {
				steps {			
					withMaven(maven : 'apache-maven-3.6.3') {
						sh 'mvn deply'
					}	
				}
			}				
		}
		
}