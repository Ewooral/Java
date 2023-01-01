from typing import List


def swap(arr):
    i = 0;
    j = len(arr) - 1;
    while i < j:
        arr[i], arr[j] = arr[j], arr[i];
        i+=1;
        j-=1;
    return arr;

print(swap([2, 4, 1, 5, 0]));
# 4, 2, 5, 1
# 


def min_value(arr: list):
        i, j = 0, 1 
        mini_value = arr[i]
        while j < len(arr):
            curV = arr[j]
            if curV < mini_value:
                mini_value = curV;
            j += 1;
        return min_value;

print(min_value([2, 4, 1, 5, 0]))

b = [4, 2]
d = b[0]
print(d)

        

