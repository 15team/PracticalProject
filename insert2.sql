DBHOST = 'localhost'
DBUSER = 'root'
DBPASS = ''     
DBNAME = 'activities'   #数据库名字

#创建数据表
def jianbiao():
    try:
        db = pymysql.connect(DBHOST, DBUSER, DBPASS, DBNAME)
        cur = db.cursor()   #声明游标
        cur.execute("DROP TABLE IF EXISTS activities")   #创建数据表 名为比赛 若存在则删除
        sql = 'CREATE TABLE activities(name CHAR(100) NOT NULL ,adress CHAR (100)'
        cur.execute(sql)
        print("数据表创建成功！")
    except pymysql.Error as e:
        print("数据表创建失败！"+str(e))