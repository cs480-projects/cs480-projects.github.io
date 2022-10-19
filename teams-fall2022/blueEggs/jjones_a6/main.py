from my_function import*
from unit_test import*


def main():
    name_tuple = ("Jack", "Ada", "Lev", "Kay", "Winny", "Jason", "Krystal", "Luke", "Liam")
    age_list = [20, 18, 22, 16, 20, 36, 37, 4, 1]
    name_and_age_tuple = tuple_generator(name_tuple, age_list)
    find_youngest(name_and_age_tuple)
    average_age = find_average(name_and_age_tuple)
    # test the function called in my_function by calculation it myself
    unit_testing_functions.check_average(name_and_age_tuple, average_age)
    # test the function called in my_function by calculation it myself
    try:
        unit_testing_functions.check_average(name_and_age_tuple, average_age+1)
    except:
        print('Failed')
    # test the function call in the unit_test and feed the value of average
    unit_testing_functions.test_average(name_and_age_tuple, 19.33)
    # failure of test the function call in the unit_test and feed the a failed value of average
    try:
        unit_testing_functions.test_average(name_and_age_tuple, 20.33)
    except:
        print('Failed again')
    above_average_name_and_age = greater_than_average_generator(name_and_age_tuple, average_age)
    print("Here are the people who's age is above the average", above_average_name_and_age)


if __name__ == "__main__":
    main()
#  output of a successful run
# The youngest person is ('Liam', 1)
# The average age is 19.33
# The mean age derived mathematically is 19.33 the statistics mean function succeeded
# Traceback (most recent call last):
#   File "c:\Users\Jason\OneDrive\Documents\GitHub\cs480-projects.github.io\teams-fall2022\blueEggs\jjones_a6\main.py", line 19, in <module>
#     main()
#   File "c:\Users\Jason\OneDrive\Documents\GitHub\cs480-projects.github.io\teams-fall2022\blueEggs\jjones_a6\main.py", line 13, in main
#     unit_testing_functions.check_average(name_and_age_tuple, 30)
#   File "c:\Users\Jason\OneDrive\Documents\GitHub\cs480-projects.github.io\teams-fall2022\blueEggs\jjones_a6\unit_test.py", line 14, in check_average
#     raise Exception("pythons statistics mean calculation has failed. The average is,", expected_average)
# Exception: ('pythons statistics mean calculation has failed. The average is,', 19.33)
# PS C:\Users\Jason\OneDrive\Documents\GitHub\cs480-projects.github.io>