import pymysql as mq

myobj = mq.connect(host="localhost", user="root", password="")
cursorobj = myobj.cursor()
try:
    db = "create database emp"
    cursorobj.execute(db)
    print("Database Created")
except:
    print("Database error")
