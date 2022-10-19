import UserProfile as User

class UsersCalorieRequirement:
    users = []
    userBMR = []

    def addUser(user):
        users.append(user)

        if(user.getSex()):
            BMR = 66 + ((13.7*0.453592) * user.getWeight()) + (5 * ((user.getHeight[0] * 30.48) + (user.getHeight[1] * 2.54))) - (6.8 * user.getAge())
        else:
            BMR = 655 + ((9.6*0.453592) * user.getWeight()) + (1.8 * ((user.getHeight[0] * 30.48) + (user.getHeight[1] * 2.54))) - (4.7 * user.getAge())
        
        userBMR.append(BMR)
        return 1

    def getUserBMR(self, user):
        for i in range(len(users)):
            if(users[i].getAccountNum() == user.getAccountNum()):
                return userBMR[i]
        return "User does not exist in the database"

if __name__ == '__main__':
    usersRegistry = UsersCalorieRequirement()
    user1 = User(Bob, 123, '000001')
    user1.setAge(69)
    user1.setHeight([5,9])
    user1.setSex(True)
    user1.setWeight(189)
    print("Adding Bob into registry: ", usersRegistry.addUser(user1))
    print("Retrieving Bob's BMR: ", usersRegistry.getUserBMR(user1))
