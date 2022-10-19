from statistics import mean


def tuple_generator(tuple_data, list_data):
    merged_tuple = tuple((tuple_data[i], int(list_data[i])) for i in range(0, len(tuple_data)))
    return merged_tuple


def tuple_printer(tuple_data):
    for pair in tuple_data:
        print(pair)


def find_youngest(tuple_of_tuples):
    age_max = 111
    for pair in tuple_of_tuples:
        if pair[1] < age_max:
            youngest = pair
    print("The youngest person is", youngest)
    
    
def find_average(tuple_of_tuples):
    age_data = []
    for pair in tuple_of_tuples:
        age_data.append(pair[1])
    print("The average age is", round(mean(age_data), 2))
    average_age = round(mean(age_data), 2)
    return average_age

def find_average_fail(tuple_of_tuples):
    age_data = []
    for pair in tuple_of_tuples:
        age_data.append(pair[1])
    print("The average age is", round(mean(age_data)+1, 2))
    average_age = round(mean(age_data), 2)
    return average_age


def greater_than_average_generator(tuple_of_tuples, average_age):
    return [x for x in tuple_of_tuples if x[1] > average_age][:len(tuple_of_tuples)]

