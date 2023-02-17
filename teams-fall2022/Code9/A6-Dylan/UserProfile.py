class UserProfile:

    foodList = []

    def __init__(self, userName, password, accountNum):
        self.userName = userName
        self.password = password
        self.accountNum = accountNum

    def getAccountNum():
        return accountNum

    def setHeight(self, height):
        self.height = height

    def getHeight():
        return height
    
    def setAge(self, age):
        self.age = age

    def getAge():
        return age

    def setSex(self, isMale):
        self.isMale = isMale

    def getSex():
        return isMale

    def setWeight(self, weight):
        self.weight = weight

    def getWeight():
        return weight

    def setNotePadID(self, noteID):
        self.noteID = noteID

    def getNotePadID(self):
        return self.noteID
    
    def setExerciseLevel(self, exerciseLevel):
        self.exerciseLevel = exerciseLevel

    def displayUserName(self):
        print(self.userName)

    