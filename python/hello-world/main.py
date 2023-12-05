s = 'filipe|correa|lima da silva'
print(s[12:7-1:-1])

d = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}

e = {
  "filipe": "evelize",
  "juliana": "lilo"
}

print(d)
d.update(e)
print(d)

d.pop('juliana')
print(d)

for k,v in d.items():
    print((k,v))

if 'filipe' in d.keys():
    print('yes!!!')
