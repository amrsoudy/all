list = []
i = 0

while  i < 3 :
    list.append(int(input('enter the number ')))
    i+= 1



max = list[0]

for  i in  range(0,len(list)):

    if (list[i] < max ):
        max = list[i]
    else :
        max = max






print(max)

