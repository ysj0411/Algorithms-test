import web

url=('/','index')

class index:
    def GET(self):
        return "Hello World"
if _name_=="_main_":
    app=web.application(urls,globals())
    app.run()
    
