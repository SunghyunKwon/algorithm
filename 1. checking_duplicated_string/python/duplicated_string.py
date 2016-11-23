#!/usr/bin/python
def check_duplicated_string(input_string):
    if len(input_string) > 255:
        return False

    array = [0 for _ in xrange(255)]
    for char in input_string:
        if array[ord(char)] >= 1:
            return False

        array[ord(char)] += 1

    return True

string = raw_input()
print check_duplicated_string(string)

