class protomealtracker:
    meals = []
    mealcals = []

    def add_meal(self, meal, cals):
        self.meals.append(meal)
        self.mealcals.append(cals)
        return len(self.meals) - 1

    def get_meal(self, meal_id):
        if meal_id >= len(self.meals):
            return 'A meal with this ID does not exist.'
        else:
            meal_info = str(self.meals[meal_id]) + ":" + str(self.mealcals[meal_id])
            return meal_info

if __name__ == '__main__':
    tracker = protomealtracker()
    print("Meal apple with cal count 50 has been assigned meal id ", tracker.add_meal('apple', 50))
    print("Meal associated with id 0 is", tracker.get_meal(0))
