mapa = new Map([
  ['chave1', 'valor1'],
  ['chave2', 'valor2'],
  [1, {2: 4}]
])

mapa.forEach((v,k,m) => console.log('k='+ k + ', v=' + JSON.stringify(v)))
