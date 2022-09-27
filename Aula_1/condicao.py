a = 54
b = 24
c = 21

if a > b:
    a = b

    if a > c:
        a = c
elif a < c:
    a = c

print(a)    
