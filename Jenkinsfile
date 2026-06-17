pipeline{
agent any
tools{
maven 'maven'
}
stages{
	stage('Checkout'){
		steps{
			git branch:'main' url:'https://github.com/RohanVSomani/test0303.git'
		}
	}
	stage('Build'){
		steps{
			sh 'mvn clean package'
		}
	}
	stage('test'){
		steps{
			sh 'mvn test'
		}
	}
	stage('Run the Application'){
		steps{
			sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
		}
	}
	
}
post{
	success{
		echo 'Build successful'
	}
	failure{
		echo 'Build failure'
	}
}
}
