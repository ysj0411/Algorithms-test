"""list_1=[1,2,3,4,5]
list_2=[]
for item in list_1:
    list_2.append(item*2)
print(list_2)
list_3=[i*2 for i in list_1]
print(list_3)
list_4=map(lambda x:x*2,list_1)
print(list_4)"""
"""list_1=[1,2,3,4,5]
def double_func(x):
    return x*2
list_2=map(double_func,list_1)
print(list_2)"""
from functools import reduce
list_1=xrange(1,101)
def add(x,y):
    return x+y
print(reduce(add,list_1))
