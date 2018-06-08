def sum(a,b,c):
    return a+b+c
def chu(a,b):
    return a/b
print(sum(1,2,3))
print(sum(4,56,7))
print(chu(4,1))
sum=lambda a,b,c:a+b+c
chu=lambda a,b:a/b
print(sum(1,2,3))
print(sum(4,56,7))
print(chu(4,1))
def f(n):
    return lambda y:n+y
a=f(2)
print(a(3))

                         
