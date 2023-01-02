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
        j = 1 
        mini_value = arr[0]
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


def raiise(base, power):
    return base ** power 
print(raiise(9, 3))


# from a list of numbers move zero to the end of the list
def moveToEnd(arr:list, k):
    # [0, 2, 0, -1, 8, 0]
    le = 0
    ri = len(arr) -1;
    while le < ri:
        while le < ri and arr[ri] == k:
            ri -=1;
        if arr[le] == k:
            arr[le], arr[ri] = arr[ri], arr[le];
        le += 1;
    return arr;

print(moveToEnd([0, 2, 0, -1, 8, 0], k=0))
        
# approach 2
def move_to_left(arr, k):
    for item in arr:
        if item == k:
            arr.remove(item);
            arr.append(item);
    return arr

print(move_to_left([2, 1, 2, 2, 2, 3, 4, 2], 2))