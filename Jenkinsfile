pipeline {
		agent any
		
		stages {
			
			stage ('Compile State') {
				steps {			
					withMaven(maven : 'LOCALMAVEN') {
						sh 'mvn clean install'
					}	
				}
			}	
			
			stage ('Testing State') {
				steps {			
					withMaven(maven : 'LOCALMAVEN') {
						sh 'mvn test'
					}	
				}
			}	
			
			stage ('Deployment State') {
				steps {			
					withMaven(maven : 'LOCALMAVEN') {
						sh 'mvn deply'
					}	
				}
			}				
		}
		
}