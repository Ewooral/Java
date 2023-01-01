from typing import List

# reverse an array
def swap(arr):
    i = 0;
    j = len(arr) - 1;
    while i < j:
        arr[i], arr[j] = arr[j], arr[i];
        i+=1;
        j-=1;
    return arr;

print(swap([2, -1, 4, 1, 5, 0]));


# find minimum value in an array
def min_value(arr: list):
        i, j = 0, 1 
        mini_value = arr[i]
        while j < len(arr):
            curV = arr[j]
            if curV < mini_value:
                mini_value = curV;
            j += 1;
        print(mini_value)

min_value([2,-9, 4, 1, -4, 5, 0])


# write a raise to the pow method
def raise_to_the_pow(base, exponent):
    # 2 ^ 3 = 2 * 2 * 2
    res = 1;
    for i in range(exponent):
        res *= base;
    return res;
print(raise_to_the_pow(9, 3));

        

