def printAll(*args):
    for i in args:
        print(i)
    print()
    
printAll(1,2,3)
printAll(3,2,1)
def printAll(**kargs):
    for k in kargs:
        print(k,':',kargs[k])
printAll(a=2,b=4,c=6)
def func(x,y=5,*a,**b):
    print(x,y,a,b)
func(1)
func(1,2)
func(1,2,3)
func(1,2,3,4)
func(x=1)
func(x=1,y=3)
func(x=1,y=3,a=1)
func(x=1,y=3,a=1,b=2,t=0)
func(x=1,y=32,a=1,b=2)


