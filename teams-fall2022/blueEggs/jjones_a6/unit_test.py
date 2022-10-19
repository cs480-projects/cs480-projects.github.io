from my_function import*


class unit_testing_functions:
    
    def check_average(tuple_of_tuples, average_from_stat):
        age_data = []
        age_sum = 0
        for pair in tuple_of_tuples:
            age_data.append(pair[1])
            age_sum += pair[1]
            
        expected_average = round(age_sum / len(tuple_of_tuples), 2)
        
        if average_from_stat != expected_average:
            raise Exception("pythons statistics mean calculation has failed. The average is,", expected_average)
        
        
    def test_average(tuple_of_tuples, expected):
        if find_average(tuple_of_tuples) != expected:
            raise Exception("pythons statistics mean calculation has failed")
        print("The mean age derived from stats is success!")
        
    

        
        print("The mean age derived mathematically is", round(age_sum / len(tuple_of_tuples), 2), "the statistics mean function succeeded")

    
    