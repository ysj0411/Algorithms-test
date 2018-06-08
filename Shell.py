import selection
def Shell(a):
    N=len(a)
    h=1
    while(h<N/3):
        h=h*3+1
    while h>=1:
        for i in range(h,N):
            j=i
            while(j>=h and a[j]<a[j-h]):
                a[j],a[j-h]=a[j-h],a[j]
                j-=h
        h=h/3
l=input()
a=Changes(l)
print(a)
Shell(a)
print(a)

