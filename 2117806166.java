try:
        soup=BeautifulSoup(html,'html.parser')
        plt=soup.find_all('div',attrs={'class':'p-price'})#提取所有class为p-price的标签
        tlt=soup.find_all('div',attrs={'class':'p-name p-name-type-2'})
  
        title=re.findall(r'<em>.*</em>',str(tlt))
        price=re.findall(r'<i>\d*\.\d*</i>',str(plt))
        
        for i in range(len(title)):
            price[i]=re.sub(r'<[^>]+>',"",str(price[i]),re.S)
            title[i]=re.sub(r'<[^>]+>',"",str(title[i]),re.S)
            ilt.append([price[i],title[i]])
    except:
        print("")