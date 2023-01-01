def swap(arr):
    hash_mapOrDictionary = {};
    i = 0;
    j = len(arr) - 1;
    while i < j:
        if arr[i] not in hash_mapOrDictionary:
            hash_mapOrDictionary[i] = arr[i];
        arr[i], arr[j] = arr[j], arr[i];
        i+=1;
        j-=1;
        hash_mapOrDictionary[i] = True;
    print(hash_mapOrDictionary)
    return arr;

print(swap([2, 4, 5, 1]));