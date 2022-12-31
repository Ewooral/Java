def swap(arr):
    i = 0;
    j = len(arr) - 1;
    while i < j:
        arr[i], arr[j] = arr[j], arr[i];
        i+=1;
        j-=1;
    return arr;

print(swap([2, 4, 5, 1]))