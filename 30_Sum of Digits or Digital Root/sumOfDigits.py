def digital_root(n):
    a = str(n)
    convert_arrChar = list(a)
    if len(convert_arrChar) == 1 :
        return n
    else :
        total_sum =  int(0)
        while len(convert_arrChar) != 1 :
            total_sum = 0
            for x in convert_arrChar :
                total_sum = total_sum + int(x)
            convert_arrChar = list(map(int,str(total_sum)))
        return total_sum

print(digital_root(286))
print(digital_root(942))
print(digital_root(132189))
print(digital_root(493193))