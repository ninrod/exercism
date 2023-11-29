function is_prime(p) {
  for(let i=2; i<p/2;i++)
    if (p % i === 0)
      return false
  return true
}

function n_first(n) {
  a=[]
  for(let i=1 ;i <= n;i++)
    a.push(i)
  return a
}

n_first(1000).filter(p => is_prime(p)).forEach(e => console.log(e))

