
    

def exch(a,b):
    a,b=b,a
def Selection(a):
    N=len(a)
    
    for i in range(0,N):
        mi=i
        for j in range(i+1,N):
            if a[j]<a[mi]:
                a[j],a[mi]=a[mi],a[j]    
                
                
                
        
                     
l=input()
a=l.split(',')
print(a)
a=[int(a[i]) for i in range(len(a))]
print(a)  
Selection(a)
print(a)

