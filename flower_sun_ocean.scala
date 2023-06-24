import scala.util.Random

// Creating a class for the Challenge
class EcoFriendlyChallenge {
    // Declaring Variables
    private var challengeStatus : Boolean = false
    private var challengeCompleted : Boolean = false
    
    // Defining a function to start the challenge
    def startChallenge(){
        // Generating a random number
        val r = Random.nextInt(5)
        challengeStatus = true
        challengeCompleted = false
        
        // Printing the random number
        println("The Eco-Friendly Challenge has started with a random number: " + r)
        println("Let's begin the challenge")
    }
    
    // Defining a function to check the current status of the challenge
    def checkStatus(): Boolean = {
        return challengeStatus
    }
    
    // Defining a function to complete the challenge
    def completeChallenge(){
        challengeCompleted = true
        challengeStatus = false
    }
    
    // Defining a function to get the completion status of the challenge
    def checkCompletion(): Boolean = {
        return challengeCompleted
    }
    
    // Defining a function to check the energy saved by the challenge
    def checkEnergySaved(energySaved : Double): Double = {
        return energySaved
    }
}

// Defining an object for the challenge
object EcoFriendlyChallenge {
  def main(args: Array[String]): Unit = {
    
    // Creating an object of the challenge
    val eco = new EcoFriendlyChallenge()
    
    // Invoking the startChallenge method
    eco.startChallenge()
    
    // Checking the current status of the challenge
    val status = eco.checkStatus()
    if(status) {
      println("The challenge is currently in progress!")
    }
    else {
      println("The challenge is not in progress!")
    }
    
    // Completing the challenge
    eco.completeChallenge()
    
    // Checking the completion status of the challenge
    val completion = eco.checkCompletion()
    if(completion) {
      println("The Challenge has been completed successfully!")
    }
    else {
      println("The Challenge has not been completed yet!")
    }
    
    // Calculating the energy saved by the challenge
    val energySaved = 10.0
    val totalEnergySaved = eco.checkEnergySaved(energySaved)
    println("The total energy saved by this challenge is: " + totalEnergySaved + " Units")
  }
}