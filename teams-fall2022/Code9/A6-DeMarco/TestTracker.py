import unittest
import protomealtracker as TrackerClass

class TestTracker(unittest.TestCase):
    tracker = TrackerClass.protomealtracker()
    meal_id = []
    meal_name = []

    def test_0_add_meal(self):
        print("Start add_meal test\n")

        for i in range (5):
            meal = 'meal' + str(i)
            calories = i

            self.meal_name.append(meal + ":" + str(calories))

            meal_id = self.tracker.add_meal(meal, calories)

            self.assertIsNone(meal_id)
            self.meal_id.append(meal_id)
        print("meal_id length = ", len(self.meal_id))
        print(self.meal_id)
        print("meal_name length = ", len(self.meal_name))
        print(self.meal_name)
        print("\nEnd add_meal test\n")
    
    def test_1_get_meal(self):
        print("Start get_meal test\n")

        length = len(self.meal_id)
        print("meal_id length = ", len(self.meal_id))
        print("meal_name length = ", len(self.meal_name))

        for i in range(10):
            if i < length:
                self.assertEqual(self.meal_name[i], self.tracker.get_meal(self.meal_id[i]))
            else:
                print("Testing for get_meal no user message")
                self.assertEqual("A meal with this ID does not exist.", self.tracker.get_meal(i))
        print("\nEnd get_meal test\n")

if __name__ == '__main__':
    unittest.main()