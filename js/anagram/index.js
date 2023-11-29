let test = ["filipe", "mm", "mama", "anilina", "sopapos", "ama", "radar"]

function rev(s) {
  // solução 1: funções nativas
  // return s.split('').reverse().join('')

  // solucão 2: recursion xique
  // return (s === '') ? '' : p(s.substr(1)) + s.charAt(0);

  // solução 3: for véi de guerra com accumulator
  // let a="";
  // for (let i = s.length-1; i >= 0; i--) {
  //   a+=s[i]
  // }
  // return a
}

function palindromo(s) {
  if(s.length < 3)
    return "?"

  if([...s].reverse.join('') === s)
    g
    return "s"

  return "n"
}

test.forEach(e => console.log(e + ' = ' + palindromo(e)))
