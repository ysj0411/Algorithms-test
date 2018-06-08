from PIL import Image
image_name='image.jpg'
img=Image.open(image_name)
img=img.convert('L')

w,h=img.size
if w>100:
    h=int((100/w)*h)
    w=100
img=img.resize((w,h),Image.ANTIALIAS)
data=[]#保存像素字符的列表
char=[' ',',','1','+','q','D','@','M']
for i in range(h):
    line=''
    for j in range(w):
        pi=img.getpixel((j,i))
    for k in range(0,8):
        if pi<(k+1)*32:
            line+=char[7-k]
            break
    data.append(line)
f=open(image_name+'.txt','w')

for d in data:
    print(d, file=f)
    
f.close()



