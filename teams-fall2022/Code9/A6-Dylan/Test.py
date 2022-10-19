import unittest
import CalorieRequirement as TrackerClass
import UserProfile as User

class TestTracker(unittest.TestCase):
    tracker = TrackerClass.UsersCalorieRequirement()
    user = []
    user_BMR = []

    def test_0_add_user(self):
        print("Start add_user test\n")

        for i in range (5):
            newUser = User("user" + str(i), i, str(i + 2312))
            newUser.setAge(20 + (i*3))
            newUser.setHeight([5,0+(i*3)])
            newUser.setSex(i%2)
            newUser.setWeight(100 + (25*i))

            self.user.append(newUser)

            user = self.tracker.addUser(newUser)

            self.assertIsNone(user)
            self.user.append(user)
        print("user length = ", len(self.user))
        print(self.user)
        print("\nEnd add_meal test\n")

if __name__ == '__main__':
    unittest.main()