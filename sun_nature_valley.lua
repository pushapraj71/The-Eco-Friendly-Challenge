--This code is written in Lua 5.3

--Define the global variables
local petChoice = nil -- Stores the user's pet choice
local petName = nil -- Stores the user's pet name

-- Declare the functions
-- Function to read and store user's Pet Choice
function getPetChoice() 
    print("Please choose a pet: dog, cat, or snake?")
    petChoice = io.read()
end

-- Function to read and store user's Pet Name
function getPetName() 
    print("What do you want to name your pet?")
    petName = io.read()
end

-- Function to create eco-friendly Pet 
function createEcoFriendlyPet() 
    print("Creating an eco-friendly pet...")
    --Store pet choice and pet name
    getPetChoice()
    getPetName()
    --Create a dictionary to store pet information
    local pet = {
        type = petChoice,
        name = petName,
        ecoFriendly = true
    }
    --Print out pet information
    print("Your pet is a ".. pet.type.. " and it's name is ".. pet.name.. ". It is eco-friendly!")
end

--Calling the createEcoFriendlyPet function
createEcoFriendlyPet()