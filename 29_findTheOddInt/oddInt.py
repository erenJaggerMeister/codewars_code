def find_it(seq):
    arrs = seq
    Dict = {}
    # put into hash / list
    for x in arrs:
        checkKey = Dict.get(x)
        if (checkKey==None):
            Dict[x] = 1
        else :
            Dict[x] += 1

    # check odd
    for x in Dict:
        checkOdd = Dict.get(x) % 2 != 0
        if checkOdd == True:
            return x
    for elem in seq:
        print(seq.count(elem))
    return 0

print(find_it([20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5]))
print(find_it([1,1,2,-2,5,2,4,4,-1,-2,5]))
print(find_it([20,1,1,2,2,3,3,5,5,4,20,4,5]))
print(find_it([10]))
print(find_it([10, 10, 10]))
print(find_it([1,1,1,1,1,1,10,1,1,1,1]))