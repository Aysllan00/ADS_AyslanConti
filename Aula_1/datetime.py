from datetime import date
now = date.today()

a = now.strftime('%m-#d-%y')
b = now.strftime('%d %b %Y is a %A on the %d day of %B.')

birthday = date(2000, 10, 6)
age = now - birthday
d = age.days
print(d)