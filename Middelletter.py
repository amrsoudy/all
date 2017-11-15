data =input('enter what you want ')


if (len(data)%2 == 0):
    y = int((len(data)/2) -1 )

    x= data[y]
    z = data[y+1]

    print(x,z)

else:
    y = int((len(data) / 2) )

    x = data[y]

    print(x)




