function gen(n) {
  a=[]
  for(i = 2; i <= n; i++)
    a.push(i)
  return a
}

function is_prime(n) {
  for(i = 2; i <= n/2; i++) {
    if (n % i === 0)
      return false
  }
  return true
}

function primes(n) {
  return gen(n).filter(e => is_prime(e))
}

function menor(a, b) {
  return (a < b)? a : b
}

function divisores(a, b) {
  if (is_prime(a) || is_prime(b))
    return [1]
  vp = primes(menor(a, b)/2)
  n = vp.length
  divs = []
  fa = a
  fb = b
  i = 0
  e = vp[i]
  kg = true
  while (kg) {
    if (fa % e === 0 && fb % e === 0) {
      divs.push(vp[i])
      fa /= e
      fb /= e
    } else {
      i+=1
      e = vp[i]
    }
    if (i >= n)
      kg = false
  }

  return divs
}

function prod(v) {
  a=1
  v.forEach(e => a*=e)
  return a
}

function MDCdue(a, b) {
  return prod(divisores(a,b))
}

//discursiva begin
function remove_um(v) {
  if (v.length <= 2)
    return v
  a=[]
  for(i=1;i<v.length;i++)
    a.push(v[i])
  return a
}
function MDCMulti(v) {
  if (v.length === 2)
    return MDCdue(v[0],v[1])
  return MDCMulti(remove_um(v))
}
//discursiva:end

console.log(MDCMulti([1024,512,256,128,64,12]))
