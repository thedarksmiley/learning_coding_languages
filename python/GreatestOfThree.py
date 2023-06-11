a=input("Enter first number\n")
b=input("Enter second number\n") 
c=input("Enter third number\n")
if  int(a)>int(b) and int(a)>int(c):
    print(a + " is greatest")
elif int(b)>int(a) and int(b)>int(c):
    print(b + " is greatest")
elif int(c)>int(a) and int(c)>int(b):
    print(c + " is greatest")
else:
    print("all number are equal") 