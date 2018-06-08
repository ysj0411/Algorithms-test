import urllib,time
time_start=time.time()
data=[]
for i in range(30):
    print("requesst move:",i)
    id =1764796+i
    url='http://api.douban.com/v2/movie/subject/%d'%id
    d=urllib.urlopen(url).read()
    data.append(d)
    print(i,time.time()-time_start)
print('data:',len(data))

    
